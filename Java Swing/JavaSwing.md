## Resize Image

```java
ImageIcon ii = new ImageIcon(getClass().getResource("/Image/test.JPG")); // get img url
Image image = ii.getImage().getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH); // get width and height
ii = new ImageIcon(image); // reassign image
jLabel.setIcon(ii); // set to jLabel
```

## TextField Placeholder Effect

```java
// Events > focusGained
if (userField.getText().equals("Enter Username")) {
            userField.setText("");
        }

// Events > focusLost
if (userField.getText().equals("")) {
            userField.setText("Enter Username");
        }
```

## Removes focus on text fields

```java
getContentPane().requestFocusInWindow();
```

## Add padding to textfield

```java
userField.setBorder(BorderFactory.createCompoundBorder(
        userField.getBorder(),
        BorderFactory.createEmptyBorder(5, 10, 5, 5))); // Top, Left, Bottom, Right
```

## Change cursor on Button Mouse Hover

```java
loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // loginButton is variable
```

## Submit on Key Press

```java
// Events > Key > keyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Enter works");
        }
```

## Disable Window Maximize

```java
this.setResizable(false);
```

## JOptionPane

```java
JOptionPane.showMessageDialog(null, "Warning! This dialog will be an alert", "Enter title", JOptionPane.WARNING_MESSAGE);
JOptionPane.showMessageDialog(null, "Error! This dialog shows error message", "Enter title", JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null, "Hello! This is an information message", "Enter title", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null, "Question?", "Enter title", JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "This is a plain message without an icon", "Enter title", JOptionPane.PLAIN_MESSAGE);
```
