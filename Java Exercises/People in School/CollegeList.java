import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        char userChoice = sc.next().toLowerCase().charAt(0);

        if (userChoice == 'e') {
            System.out.println("Type employee's name, contact number, salary, and department. Press Enter after every input.");
            
            // this is required to move to the next cursor after the char scanner input
            sc.nextLine();
            String name = sc.nextLine();                                         
            String contactNum = sc.nextLine();
            double salary = sc.nextDouble();

            // need this to prevent Scanner skipping input!!!
            sc.nextLine();            

            String department = sc.nextLine();
            
            // Employee object
            Employee employee = new Employee();
            employee.setName(name);
            employee.setContactNum(contactNum);
            employee.setSalary(salary);
            employee.setDepartment(department);

            // display employee entered
            System.out.println("-------------------------------");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNum());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());
        } else if (userChoice == 's') {
            System.out.println("Type student's name, contact number, program, and year level. Press Enter after every input.");
            
            // this is required to move to the next cursor after the char scanner input
            sc.nextLine();
            String name = sc.nextLine();                                         
            String contactNum = sc.nextLine();
            String program = sc.nextLine();        
            int yearLevel = sc.nextInt();
            
            System.out.println("Name: " + name);
            System.out.println("Contact number: " + contactNum);
            System.out.println("Program: " + program);
            System.out.println("Year level: " + yearLevel);

            // set student object
            Student student = new Student();
            student.setName(name);
            student.setContactNum(contactNum);
            student.setProgram(program);
            student.setYearLevel(yearLevel);

            // display employee entered
            System.out.println("-------------------------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContactNum());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year level: " + student.getYearLevel());
            
            
        } else if (userChoice == 'f') {
            
        }
    }
}

class Person {
    private String name;
    private String contactNum;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getContactNum() {
        return contactNum;
    }    
} // end of Person class

class Student extends Person{
    private String program;
    private int yearLevel;

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getYearLevel() {
        return yearLevel;
    }    
} // end of Student class

class Employee extends Person{
    private double salary;
    private String department;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

class Faculty {
    private boolean status;

    public boolean isRegular(boolean status){
        return true;
    }
}


