// gridbag
    this.setLayout(new GridBagLayout());
    GridBagConstraints gcon = new GridBagConstraints();

    // gridbag margin
    gcon.insets = new Insets(5, 5, 5, 5); // top, left, bottom, right

    // contraints for button1
    JButton button1 = new JButton("Button1");
    gcon.gridx = 0;
    gcon.gridy = 0;
    gcon.gridheight = 4; // needs to adjust all the components height
    gcon.fill = GridBagConstraints.VERTICAL;
    this.add(button1, gcon);

    // contraints for button2
    JButton button2 = new JButton("Button2");
    gcon.gridx = 1;
    gcon.gridy = 1;
    gcon.gridheight = 1;
    this.add(button2, gcon);

    // contraints for button3
    JButton button3 = new JButton("Button3");
    gcon.gridx = 2;
    gcon.gridy = 2;
    gcon.gridheight = 1;
    this.add(button3, gcon);

    // contraints for button4
    JButton button4 = new JButton("Button4");
    gcon.gridx = 3;
    gcon.gridy = 3;
    gcon.gridheight = 1;
    this.add(button4, gcon);

    // contraints for button5
    JButton button5 = new JButton("Button5");
    gcon.gridx = 1;
    gcon.gridy = 4;
    gcon.gridwidth = 3;
    gcon.gridheight = 1;
    gcon.fill = GridBagConstraints.HORIZONTAL; // should set x properly to work
    this.add(button5, gcon);
