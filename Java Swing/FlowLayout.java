package practice;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyBorderLayout extends JFrame {

    MyBorderLayout() {       
        this.setSize(700, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Flow Layout");
        
        // sets to center, 400 width margin, 50 height margin
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 400, 50));
        
        
        Button b1 = new Button("HI");
        b1.setPreferredSize(new Dimension(100, 30));
        this.add(b1);
        Button b2 = new Button("HI");
        b2.setPreferredSize(new Dimension(100, 30));
        this.add(b2);
        Button b3 = new Button("HI");
        b3.setPreferredSize(new Dimension(100, 30));
        this.add(b3);
        Button b4 = new Button("HI");
        b4.setPreferredSize(new Dimension(100, 30));
        this.add(b4);
   
        
        this.setVisible(true);
    }

}
