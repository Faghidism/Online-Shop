import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    //FRAME LABLE SIGNIN

    public class SignIn {


        JFrame sign_in_menu = new JFrame("Online Shopping");
        {

            //FRAME

            sign_in_menu.setSize(700, 750);                                // Size frame asli
            sign_in_menu.setLayout(null);                                              // ghasd taghire frame
            sign_in_menu.setVisible(true);                                             // baraye namayesh frame asli
            sign_in_menu.setResizable(false);
            sign_in_menu.getContentPane().setBackground(Color.red);
            sign_in_menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            //LABLE

            JLabel signin_Label = new JLabel("PLEASE ENTER YOUR NAME AND PASSWORD");
            signin_Label.setBounds(130, 200, 1000, 50);
            signin_Label.setFont(new Font("MV BOLI", Font.PLAIN, 20));
            sign_in_menu.add(signin_Label);

            //Field Lable name va password

            JLabel name_In = new JLabel("Name :");
            name_In.setBounds(200,330,200,20);
            name_In.setFont(new Font("MV BOLI",Font.BOLD,10));
            sign_in_menu.add(name_In);

            JTextField name_in = new JTextField();
            name_in.setBounds(280,330,150,20);
            sign_in_menu.add(name_in);

            JLabel pass_In = new JLabel("Password :");
            pass_In.setBounds(200,360,200,20);
            pass_In.setFont(new Font("MV BOLI",Font.BOLD,10));
            sign_in_menu.add(pass_In);

            JPasswordField pass_in = new JPasswordField();
            pass_in.setBounds(280,360,150,20);
            sign_in_menu.add(pass_in);

            //BUTTONS

            JButton Enter_Button = new JButton("Enter");
            sign_in_menu.add(Enter_Button);
            Enter_Button.setBounds(300,450,100,40);

            JButton Back_Button = new JButton("Back");
            sign_in_menu.add(Back_Button);
            Back_Button.setBounds(300, 500, 100, 40);

            JButton Exit_Button = new JButton("Exit");
            sign_in_menu.add(Exit_Button);
            Exit_Button.setBounds(300,550, 100,40);

            // BUTTONS ACTION LISTENERS

            Enter_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == Enter_Button){
                        String name = name_in.getText();
                        String password = pass_in.getText();
                        sign_in_menu.dispose();
                        new Shop();

                    }
                }
            });
            Back_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == Back_Button) {
                        sign_in_menu.dispose();
                        new MainFrame();
                    }
                }
            });

            Exit_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == Exit_Button){
                        sign_in_menu.dispose();
                    }
                }
            });

        }

    }