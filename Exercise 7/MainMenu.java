import java.awt.Color;
import java.awt.Font;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame{
    
    MainMenu(){

        JLabel imageLabel = new JLabel();
        ImageIcon treeImage = new ImageIcon("tree.gif");
        imageLabel.setIcon(treeImage);
        this.add(imageLabel);

        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Arial", Font.BOLD, 20));

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);
        this.add(button);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
    }

    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {
        
            new ColorMenu();
            dispose();
        }
    }
}
