import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame {

    MainFrame() {

        // Frame asli


        JFrame f = new JFrame("Online Shopping");

        f.setSize(700,750 );                                 // Size frame asli
        f.setLayout(null);                                              // ghasd taghire frame
        f.setVisible(true);                                             // baraye namayesh frame asli
        f.setResizable(false);
        f.getContentPane().setBackground(Color.GREEN);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Lable

        JLabel Frame_Label = new JLabel("WELCOME TO OUR SHOP");
        Frame_Label.setFont(new Font("a",Font.BOLD, 30));
        Frame_Label.setBounds(160, 200, 1000, 50);
        f.add(Frame_Label);

        // button singin va signup

        JButton sing_in_button = new JButton("SignIn");                         // bottun sing in
        f.add(sing_in_button);                                                       // add kardan be frame
        sing_in_button.setBounds(280, 330, 150, 60);               // mokhtasat bottun singin

        JButton sing_up_button = new JButton("SignUp");
        f.add(sing_up_button);                                                       // add kardan be frame
        sing_up_button.setBounds(280, 400, 150, 60);               // mokhtasat bottun singup

        JButton Exit_button = new JButton("Exit");
        f.add(Exit_button);
        Exit_button.setBounds(280, 470, 150, 60);


        // action listener button ha


        sing_in_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == sing_in_button) {
                    f.dispose();
                    new SignIn();
                }
            }
        });

        sing_up_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == sing_up_button){
                    f.dispose();
                    new SignUp();
                }

            }
        });

        Exit_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Exit_button){
                    f.dispose();
                }
            }
        });
    }
    }