## ConnectionProvider Class
> make sure that you don't use Connection as class name
```java
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
  public static Connection getCon(){
    try {    
      Class.forName("com.mysql.cj.jdbc.Driver"); 
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbName", "root", "password");  
      return conn;
    } catch(Exception e) {
      System.out.println(e);
      return null;
    }
  }
}  
```

## Read
> takes values from DB
```java
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Connection.ConnectionProvider; // this is the class we created

String query1 = "SELECT * FROM users";
Connection conn = ConnectionProvider.getCon();
try {
    assert conn != null;
    Statement st = conn.createStatement();
    // store results to Result set
    ResultSet rs = st.executeQuery(query1);

    // loop through query result by row
    while (rs.next()) { // rs.next() returns boolean value
        System.out.println(rs.getString("name"));
        System.out.println(rs.getString("username"));
        System.out.println(rs.getString("password"));
        System.out.println("-------------------------------");
    }
} catch (SQLException ex) {
    System.out.println(ex.getMessage());
}
```

## Write
> variation 1
```java 
  Connection con = ConnectionProvider.getCon();  
  Statement st = con.createStatement();
  // "+studentID+" this is like a String Template Literal in Javascript
  st.executeUpdate("INSERT INTO studentTBL (id, name) VALUES('"+studentID+"', '"+name+"')");  
```

## Write
> variation 2
```java 
  Connection con = ConnectionProvider.getCon();  
  PreparedStatement ps = con.prepareStatement("INSERT INTO studentTBL (id, name) VALUES('"+studentID+"', '"+name+"')");
  ps.executeUpdate();
```

## Write
> variation 3
```java 
  Connection con = ConnectionProvider.getCon();  
  PreparedStatement ps = con.prepareStatement("INSERT INTO studentTBL (id, name) VALUES(?, ?)");
  ps.setString(1, studentID);                                          
  ps.setString(2, name); 
  ps.executeUpdate();
```
