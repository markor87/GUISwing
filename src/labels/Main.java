package labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("C:\\Users\\marko.radovanovic\\IdeaProjects\\GUISwing\\src\\java.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);

        JLabel label = new JLabel();
        label.setText("Pa ja lomim ovaj kod");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(255,0,0));
        label.setFont(new Font("MV Boli",Font.BOLD,30));
        label.setIconTextGap(35);
        label.setBackground(new Color(133, 141, 136));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,100,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label); //mora pre frame.pack
        frame.pack();
    }
}
