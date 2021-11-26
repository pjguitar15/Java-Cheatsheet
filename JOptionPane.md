## JOptionPane
```java
JOptionPane.showMessageDialog(null, "Warning! This dialog will be an alert", "Enter title", JOptionPane.WARNING_MESSAGE);
JOptionPane.showMessageDialog(null, "Error! This dialog shows error message", "Enter title", JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null, "Hello! This is an information message", "Enter title", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null, "Question?", "Enter title", JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "This is a plain message without an icon", "Enter title", JOptionPane.PLAIN_MESSAGE);

JOptionPane.showInputDialog("Anyone there?");
int input = JOptionPane.showConfirmDialog(null, "Do you like bacon?");
// 0=yes, 1=no, 2=cancel
System.out.println(input);
```
