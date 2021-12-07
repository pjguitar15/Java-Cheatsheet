## ConnectionProvider Class
> make sure that you don't use Connection as class name
```java
  public static Connection getCon(){
    try {    
      Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC driver class found in properties
      // create connection
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbName", "root", "password"); // insert localhost url    
      return conn;
    } catch(Exception e) {
      System.out.println(e);
      return null;
    }
  }
```
