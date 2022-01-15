## CardLayout Example
```java
CardLayout card = new CardLayout();
setLayout(card);

JButton btn1 = new JButton("Button1");
btn1.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
    card.next(getContentPane());
  }
});

JButton btn2 = new JButton("Button2");

btn2.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
    card.next(getContentPane());
  }
});

JButton btn3 = new JButton("Button3");
btn3.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
    card.next(getContentPane());
  }
});

add(btn1);
add(btn2);
add(btn3);
```
