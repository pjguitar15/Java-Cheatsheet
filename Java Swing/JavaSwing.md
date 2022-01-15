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
    JLabel imageLabel = new JLabel();
    ImageIcon ii = new ImageIcon(getClass().getResource("images/login2.jpg")); // get img url
    Image img = ii.getImage();
    imageLabel.setSize(400, 500);
    Image imgScale = img.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    imageLabel.setIcon(scaledIcon);
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
        BorderFactory.createEmptyBorder(5, 7, 5, 5))); // Top, Left, Bottom, Right
```

## Change cursor on Button Mouse Hover

```java
loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // loginButton is variable
JTextField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // this works too
```

## Submit on Key Press

```java
// Events > Key > keyPressed
jbutton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("Enter works");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

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

## Combo Box
```java
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("One");
        comboBox.addItem("Two");
        comboBox.addItem("Three");
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedItem().equals("One")) {
                    System.out.println("One is selected!");
                }
            }
        });
```

## JTextArea and JScrollPane
```java
JTextArea textArea = new JTextArea(8, 18); // rows, columns
JScrollPane scrollPane = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
add(scrollPane);
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

## JMenu
```java
JMenuBar mainBar = new JMenuBar();
JMenu menu1 = new JMenu("File");
JMenuItem menuItem = new JMenuItem("menu item");

setJMenuBar(mainBar);
mainBar.add(menu1);
menu1.add(menuItem);
```

## JCheckBox
```java
JCheckBox checkBox = new JCheckBox("This is a checkbox", false);
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


## Remove Button Box on Text when clicked
> Makes Java Swing Look Good
```java
    button.setFocusPainted(false);
```

## Mouse Listener
> All implemented methods
```java
        jbutton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
```


## Bootstrap Buttons
* Primary: #007BFF, #0069D9
* Secondary: #6C757D, #5A6268(text-light)
* Success: #28A745, #218838
* Danger: #DC3545, #C82333(text-light)
* Warning: #FFC107, #E0A800
* Info: #17A2B8, #138496
* Light: #F8F9FA, #E2E6EA
* Dark: #343A40(text-light), #23272B(text-light)
* Dark Text: #212529
```java        
        JButton primary = new JButton("Primary");
        primary.setPreferredSize(new Dimension(100, 28));
        primary.setCursor(new Cursor(Cursor.HAND_CURSOR));
        primary.setFont(new Font("Helvetica Neue", Font.BOLD, 12));
        primary.setBackground(Color.decode("#007BFF"));
        primary.setForeground(Color.WHITE);
        primary.setBorder(null);
        primary.setFocusPainted(false);
        primary.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                primary.setBackground(Color.decode("#0069D9"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                primary.setBackground(Color.decode("#007BFF"));
            }
        });
```

## Rounded Textfield
> Overrides a class https://github.com/pjguitar15/Java-Cheatsheet/blob/main/Java%20Swing/RoundedCornerBorder.java
```java
    JTextField textField = new JTextField("Enter your username");
    textField.setPreferredSize(new Dimension(250, 32));
    textField.setBorder(new RoundedCornerBorder());
    textField.setForeground(Color.decode("#6C757D"));
    textField.setFont(new Font("Open Sans", Font.PLAIN, 13));
```

## Bootstrap Textfield
> Bootstrap default border color is #CED4DA but it's a bit too light
```java
    JTextField textField = new JTextField("Enter your username");
    textField.setPreferredSize(new Dimension(250, 32));
    textField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
    textField.setForeground(Color.decode("#6C757D"));
    textField.setFont(new Font("Open Sans", Font.PLAIN, 13));
```
