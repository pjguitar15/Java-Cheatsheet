// Frame
setExtendedState(JFrame.MAXIMIZED_BOTH); // makes window full screen
this.setTitle("Enter title here"); // change window title
setVisible(false); // closes window
System.exit(0); // stops the application 
this.setLocationRelativeTo(null); // center window
new home().setVisible(true); // opens a new window
this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE); // change default close operation to dispose instead of exit application

// Display data to JTable


// Events
jTextField1.getText(); // gets text String value
equals("admin"); // connected by dot notation to check whether value is equal to admin
(String)jComboBox1.getSelectedItem(); // get text from combo box. use casting to get desired data type

// JOptionPane
JOptionPane.showMessageDialog(null, "Message here");