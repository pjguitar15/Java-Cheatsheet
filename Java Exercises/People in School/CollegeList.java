package peopleinschool;

import java.util.Scanner;

/**
 *
 * @author Philcob
 */
public class CollegeList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // take user choice input as character
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        char userChoice = sc.next().toLowerCase().charAt(0);
        
        // moves cursor to next Scanner input. without this there will be issues with Scanner
        sc.nextLine();
        
        if (userChoice == 'e') {
            System.out.println("Type employee's name, contact number, salary, and department. Press Enter after every input.");
            
            String name = sc.nextLine();
            String contactNum = sc.nextLine();
            double salary = sc.nextDouble();

            // prevents Scanner skipping input
            sc.nextLine();
            
            // take department input (last input)
            String department = sc.nextLine();

            // create an instance of Employee object
            Employee employee = new Employee();
            employee.setName(name);
            employee.setContactNum(contactNum);
            employee.setSalary(salary);
            employee.setDepartment(department);

            // display employee information
            System.out.println("-------------------------------");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNum());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());
            
        } else if (userChoice == 's') {
            System.out.println("Type student's name, contact number, program, and year level. Press Enter after every input.");
            
            String name = sc.nextLine();
            String contactNum = sc.nextLine();
            String program = sc.nextLine();
            int yearLevel = sc.nextInt();

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
            System.out.print("Are you regular/tenured faculty member? Y/N: ");
            char response = sc.next().toLowerCase().charAt(0);

            System.out.println("Type employee's name, contact number, salary, and department. Press Enter after every input.");

            // required itong sc.nextLine() para mag move yung Scanner cursor sa String name
            sc.nextLine();
            String name = sc.nextLine();
            String contactNum = sc.nextLine();
            double salary = sc.nextDouble();

            // need this to prevent Scanner skipping input!!!
            sc.nextLine();

            String department = sc.nextLine();
            // Employee object
            Faculty faculty = new Faculty();
            faculty.setName(name);
            faculty.setContactNum(contactNum);
            faculty.setSalary(salary);
            faculty.setDepartment(department);

            if (response == 'y') {
                faculty.isRegular(true);
            } else {
                faculty.isRegular(false);
            }

            // display employee entered
            System.out.println("-------------------------------");
            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContactNum());
            System.out.println("Salary: " + faculty.getSalary());
            System.out.println("Department: " + faculty.getDepartment());

            // Gumamit ako ng ternary operator na ? and :   medyo advanced topic nato pero pwede mo din i-google
            System.out.println("Status: " + (faculty.isStatus() ? "Regular" : "Irregular"));
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
}

class Student extends Person {

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
}

class Employee extends Person {

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

class Faculty extends Employee {

    private boolean status;

    public void isRegular(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

}
