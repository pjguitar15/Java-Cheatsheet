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

## Custom Exceptions    
```java
    // custom empty string exception
class EmptyStringException extends Exception {
    public EmptyStringException(String str) {
        super(str);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            checkIfEmptyString("");
        } catch(EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // throw Empty String Exception
    public static void checkIfEmptyString(String str) throws EmptyStringException {
        if (str.isEmpty()) {
            throw new EmptyStringException("Error! String is empty!");
        }
    }
}
```
