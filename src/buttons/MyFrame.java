package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    MyFrame(){

        ImageIcon icon = new ImageIcon("C:\\Users\\marko.radovanovic\\IdeaProjects\\GUISwing\\src\\java.png");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\marko.radovanovic\\IdeaProjects\\GUISwing\\src\\super-mario.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(170, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,300,150);
        button.addActionListener(this);
        button.setText("Ja sam dugme");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        button.setIconTextGap(-5);
        button.setForeground(Color.red);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
//            System.out.println("LOL");
            label.setVisible(true);
        }
    }
}

/*package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("C:\\Users\\marko.radovanovic\\IdeaProjects\\GUISwing\\src\\java.png");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\marko.radovanovic\\IdeaProjects\\GUISwing\\src\\super-mario.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 350, 200);
        button.addActionListener(e -> System.out.println("LOL"));
        button.setText("Ja sam dugme");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        button.setIconTextGap(-5);
        button.setForeground(Color.red);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

}*/
