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
