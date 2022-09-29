package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        
        this.setTitle("Prvi JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("https://github.com/markor87/GUISwing/blob/master/src/java.png?raw=true");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(163, 128, 234));

}
}
