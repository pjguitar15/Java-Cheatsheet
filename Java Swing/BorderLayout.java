// output: https://imgur.com/a/ZSOYwoO
package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyBorderLayout extends JFrame {

    MyBorderLayout() {
        this.setVisible(true);
        this.setTitle("Border Layout");
        // accepts a parameter with pixel as a value that sets margin width and height
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.decode("#0097e6"));
        panel1.setPreferredSize(new Dimension(100, 30));
        this.add(panel1, BorderLayout.NORTH);
        
        JLabel test = new JLabel();
        test.setText("Test");
        panel1.add(test);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.decode("#8c7ae6"));
        panel2.setPreferredSize(new Dimension(100, 100));
        this.add(panel2, BorderLayout.WEST);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.decode("#e1b12c"));
        panel3.setPreferredSize(new Dimension(100, 100));
        this.add(panel3, BorderLayout.EAST);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.decode("#44bd32"));
        panel4.setPreferredSize(new Dimension(100, 30));
        this.add(panel4, BorderLayout.SOUTH);

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.decode("#40739e"));
        panel5.setPreferredSize(new Dimension(100, 100));
        this.add(panel5, BorderLayout.CENTER);

    }

}
