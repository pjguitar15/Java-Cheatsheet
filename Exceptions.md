## Custom Exceptions    
```java
// class that extends exception and accepts a string
class EmptyStringException extends Exception {
    public EmptyStringException(String str) {
        super(str);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            // invoke it like a regular method inside try block
            checkIfEmptyString("");
        } catch(EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // method that creates the custom exception condition
    public static void checkIfEmptyString(String str) throws EmptyStringException {
        if (str.isEmpty()) {
            throw new EmptyStringException("Error! String is empty!");
        }
    }
}
```
