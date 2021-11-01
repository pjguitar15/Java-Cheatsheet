// Connection Class
// Class name shouldn't be Connection. Better use ConnectionProvider instead.
// Right click Libraries, Add JDBC Library
/**
How to download JDBC Driver
1. Go to dev.mysql.com/downloads/connector/j/
2. You can check services tab by doing ctrl + 5
3. Import jar file 
**/

//=====================================================================================
// CREATE DATA TO DATABASE

import java.sql.*; // don't forget this

// without static gives error
public static Connection getCon(){
  try {    
    Class.forName("com.mysql.jdbc.Driver"); // JDBC driver class found in properties
    // create connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbName", "root", "password"); // insert localhost url    
    return con;
  } catch(Exception e) {
    System.out.println(e);
    return null;
  }
}

// Call Connection Function
// Insert data to Database
try {
  // initialize connection object
  Connection con = ConnectionProvider.getCon();
  // Statement allows writing SQL Queries
  Statement st = con.createStatement();
  // "+studentID+" this is like a String Template Literal in Javascript
  st.executeUpdate("INSERT INTO studentTBL (id, name) VALUES('"+studentID+"', '"+name+"')");  
  
  // Try this too
  PreparedStatement ps = con.prepareStatement("INSERT INTO studentTBL (id, name) VALUES('"+studentID+"', '"+name+"')");
  ps.executeUpdate();
  
  // Try this another variation too
  PreparedStatement ps = con.prepareStatement("INSERT INTO studentTBL (id, name) VALUES(?, ?)");
  ps.setString(1, studentID);                                          
  ps.setString(2, name); 
  ps.executeUpdate();
  
  // add more actions here
} catch(Exception) {
  // add more actions here
}

//======================================================================================================
// DISPLAY DATA FROM DATABASE TO A JTABLE

// Create a method that returns a student object arraylist
public ArrayList<Student> studentListsMethod(){
        ArrayList<Student> studentList = new ArrayList();
        String query1 = "SELECT * FROM students";
        Connection conn = ConnectionProvider.getCon();
        try {
            Statement st = conn.createStatement();
            // store results to Result set
            ResultSet rs = st.executeQuery(query1);

            // loop through query result by row
            while (rs.next()) { // rs.next() returns boolean value
                // initialize object
                Student student = new Student(rs.getInt("student_id"), rs.getString("studentName"), rs.getString("studentCourse"), rs.getString("studentYear"));
                // add object to array list
                studentList.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return studentList;
    }

// Create user class that will do setters and getters
public class Student {
    private int id;
    private String studentName, studentCourse, studentYear;
    // Constructor
    public Student(int id, String studentName, String studentCourse, String studentYear){
        this.id = id;
        this.studentName = studentName;
        this.studentCourse = studentCourse;
        this.studentYear = studentYear;
    }
    
    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public String getStudentYear() {
        return studentYear;
    }
    
}

// Display to JTable
    public void displayDataToTable(){
        // take user list data
        ArrayList<Student> list = studentListsMethod();
        // initialize table object to allow data entry
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        // initialize array with length equal to column length
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getStudentName();
            row[2] = list.get(i).getStudentCourse();
            row[3] = list.get(i).getStudentYear();
            model.addRow(row);            
        }
    }

// Refresh table data
private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // initialize table model object    
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        // this method empties the contents of the table
        model.setRowCount(0);
        displayDataToTable();
    }  

// ============= LOG IN ==================
String uName = userField.getText();
String pw = passwordField.getText();  
boolean hasAccess = false;  
try {
    Connection conn = ConnectionProvider.getConn();
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT username, password FROM users");    
    while (rs.next()) {
        if (rs.getString(1).equals(uName) && rs.getString(2).equals(pw)) {
            hasAccess = true;
        }           
    }

    if (hasAccess == true) {
        // login action here
    }else{
        // login failed action here
    }    

} catch (Exception e) {
    System.out.println(e);
}

// Another login variation
Connection conn = ConnectionProvider.getConn();
PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
ps.setString(1, username);
ps.setString(2, password);
ResultSet rs = ps.executeQuery();

// if result is returned then,
if(rs.next()){
  // action here
}else{
  // login failed action here
}