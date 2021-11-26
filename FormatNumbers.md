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