## ConnectionProvider Class
> make sure that you don't use Connection as class name
```java
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
```
