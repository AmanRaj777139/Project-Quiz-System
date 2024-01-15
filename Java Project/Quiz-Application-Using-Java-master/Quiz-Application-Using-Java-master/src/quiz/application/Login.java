package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    JButton rules, back;
    JTextField tfname;
    
    Login() {


        getContentPane().setBackground(Color.getHSBColor(308,61,93));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1100, 300);
        add(image);
        
        JLabel heading = new JLabel("Quiz Portal");

        heading.setBounds(300, 300, 800, 145);
        heading.setFont(new Font("Algerian", Font.BOLD, 70));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(350, 420, 400, 35);
        name.setFont(new Font("Algerian", Font.BOLD, 39));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(390, 470, 250, 25);
        tfname.setFont(new Font("Algerian", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(410, 500, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(600, 500, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(1200, 700);
        setLocation(200, 100);

        ImageIcon background_image = new ImageIcon("icons/bg.jpg");

        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image , JLabel.CENTER);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
