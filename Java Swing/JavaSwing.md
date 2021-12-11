## JPanel Padding

```java
    JPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // top, left, bottom, right   
```

## Java Action Listener

```java
    import java.awt.event.*;
    submit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Hello World");
      }
    });
```

## Focus Listener

```java
import java.awt.event.*;

    JTextField textField = new JTextField("A TextField");
    textField.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
      displayMessage("Focus gained", e);
    }

    public void focusLost(FocusEvent e) {
      displayMessage("Focus lost", e);
    }  
    }
```

## actionPerformed Method Example

```java
    myButton.addActionListener(this);
    myButton2.addActionListener(this);
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            count += 5;
            System.out.println(count);
        } else if (e.getSource() == myButton2) {
            count += 10;
            System.out.println(count);
        }
    }      
```

## Adjust the frame when new components are added

```java
    this.pack();   
```

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
JTextField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // this works too
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

## Change Panel Background Color

```java
JPanel.setBackground(Color.decode("#1abc9c"));
```

## Positioning using setBounds and setLayout

```java
JFrame.setLayout(null);
// x, y, width, height
JPanel.setBounds(0, 120, 500, 400);
```

## Font on JLabel
```java
JLabel.setFont(new Font("Open Sans", Font.BOLD, 30));
JLabel.setForeground(Color.white);
```

## JDateChooser

```java
    // first step: install library https://toedter.com/jcalendar/
    JDateChooser dateChooser = new JDateChooser();
    dateChooser.getDate();
```

## JCalendar

```java
    // first step: install library https://github.com/DJ-Raven/date-chooser
    JCalendar jc = new JCalendar();
    jc.getDate();
```

## JTable and JScrollPane
> only display table if layout is not null
```java
    String[][] data = {
            {"Kundan Kumar Jha", "4031", "CSE", "asd"},
            {"Anand Jha", "6014", "IT", "asd"}
    };
    // Column Names
    String[] columnNames = {"Name", "Roll Number", "Department", "Password"};
    // Initializing the JTable
    table = new JTable(data, columnNames);
    table.setPreferredScrollableViewportSize(new Dimension(500, 40));
    table.setFillsViewportHeight(true);

    JScrollPane scrollPane = new JScrollPane(table);

    frame.add(scrollPane);
```

## UIManager and SwingUtilities
> Makes Java Swing Look Good
```java
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
        TestFrame tf = new TestFrame();
        tf.setVisible(true);
    }
    });
```
