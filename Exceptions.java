## Create custom error
```java
    throw new ArithmeticException("Access denied - You must be at least 18 years old.");    
```

## Example
```java
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
```

