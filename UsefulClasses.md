## Format to Dollar amount
> NumberFormat is abstract. It cannot be instantiated. Here's how you do it.
```java
    import java.text.NumberFormat;
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(1234567.891); // returns $1,234,567,89    
```

## Format to Percentage
> Formats decimal value to its percentage amount
```java
    import java.text.NumberFormat;
    NumberFormat percent = NumberFormat.getPercentInstance();
    String result = percent.format(0.1); // returns 10%
```

## DecimalFormat
> Allows custom formatting
```java
    import java.text.DecimalFormat;
    DecimalFormat decimalFormat = new DecimalFormat("P###,###.00");
    System.out.println(decimalFormat.format(1000000)); // prints P1,000,000.00
```

## Iterator
> Iterate through a list
```java
    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());

    // loop through items. it will serve as the index
    while(it.hasNext()) {
      System.out.println(it.next());
    }
```

## Show Message Dialog
```java
JOptionPane.showMessageDialog(null, "Warning message", "Enter title", JOptionPane.WARNING_MESSAGE);
JOptionPane.showMessageDialog(null, "Error message", "Enter title", JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null, "Information message", "Enter title", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null, "Question message", "Enter title", JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "Plain message", "Enter title", JOptionPane.PLAIN_MESSAGE);
```

## Input Dialog
```java
JOptionPane.showInputDialog("Anyone there?");
```

## Confirm Dialog
> 0 = yes, 1 = no, 2 = cancel
```java
int input = JOptionPane.showConfirmDialog(null, "Do you like bacon?");
```

## Generate Random String
> This method basically generates a random index from 0 to the SALTCHARS length
```java
    public static String generateSalt() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String salt = "";
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (Math.random() * SALTCHARS.length()); // generates random number up to String length
            salt += SALTCHARS.charAt(index); // append the taken char to salt string
        }        
        return salt;
    }
```

## Generate Random ID
> Generates a random ID
```java
    import java.util.UUID;
    String uniqueID = UUID.randomUUID().toString();
```
