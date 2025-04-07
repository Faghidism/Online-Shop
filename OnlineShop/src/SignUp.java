import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    // FRAME LABLE SIGNUP

    public class SignUp {


        JFrame sign_Up_menu = new JFrame("Online Shopping");
        {

            //FRAME

            sign_Up_menu.setSize(700, 750);                                // Size frame asli
            sign_Up_menu.setLayout(null);                                              // ghasd taghire frame
            sign_Up_menu.setVisible(true);                                             // baraye namayesh frame asli
            sign_Up_menu.setResizable(false);
            sign_Up_menu.getContentPane().setBackground(Color.ORANGE);
            sign_Up_menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            //LABLE

            JLabel signup_Label = new JLabel("PLEASE ENTER YOUR NAME AND PASSWORD");
            signup_Label.setFont(new Font("MV BOLI", Font.PLAIN, 17));
            signup_Label.setBounds(140, 200, 1000, 50);
            sign_Up_menu.add(signup_Label);

            //Field Lable name va password

            JLabel name_In = new JLabel("Name :");
            name_In.setBounds(200,330,200,20);
            name_In.setFont(new Font("MV BOLI",Font.BOLD,10));
            sign_Up_menu.add(name_In);

            JTextField name_in = new JTextField();
            name_in.setBounds(280,330,150,20);
            sign_Up_menu.add(name_in);

            JLabel pass_In = new JLabel("Password :");
            pass_In.setBounds(200,360,200,20);
            pass_In.setFont(new Font("MV BOLI",Font.BOLD,10));
            sign_Up_menu.add(pass_In);

            JTextField pass_in = new JTextField();
            pass_in.setBounds(280,360,150,20);
            sign_Up_menu.add(pass_in);

            //BUTTONS

            JButton Back_Button = new JButton("Back");
            sign_Up_menu.add(Back_Button);
            Back_Button.setBounds(300, 450, 100, 40);

            JButton Exit_Button = new JButton("Exit");
            sign_Up_menu.add(Exit_Button);
            Exit_Button.setBounds(300,500, 100,40);

            JButton Submit_Button = new JButton("Submit");
            sign_Up_menu.add(Submit_Button);
            Submit_Button.setBounds(300,400,100,40);

            //BUTTONS ACTION LISTENERS

            Back_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == Back_Button){
                        sign_Up_menu.dispose();
                        new MainFrame();

                    }
                }
            });

            Exit_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == Exit_Button){
                        sign_Up_menu.dispose();
                    }
                }
            });

            Submit_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == Submit_Button){
                        String name = name_in.getText();
                        String password = pass_in.getText();
                        sign_Up_menu.dispose();
                        new SignIn();
                    }
                }
            });


        }

    }