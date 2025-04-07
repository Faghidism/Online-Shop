import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;


public class Shop implements Serializable{

        // Frame asli shop


        JFrame f = new JFrame("Online Shopping");

        {
                f.setSize(700, 750);
                f.setLayout(null);
                f.setVisible(true);
                f.setResizable(false);
                f.getContentPane().
                        setBackground(Color.pink);
                f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


                // image ha

                Container oi = f.getContentPane();
                JLabel lableone = new JLabel();
                lableone.setIcon(new ImageIcon("T-shirt.png"));
                lableone.setBounds(410, 150, 128,128);
                oi.add(lableone);

                Container op = f.getContentPane();
                JLabel labletwo = new JLabel();
                labletwo.setIcon(new ImageIcon("jeans.png"));
                labletwo.setBounds(100, 150, 128,128);
                op.add(labletwo);

                Container ou = f.getContentPane();
                JLabel lableth = new JLabel();
                lableth.setIcon(new ImageIcon("hat.png"));
                lableth.setBounds(120, 300, 128,128);
                ou.add(lableth);

                Container oj = f.getContentPane();
                JLabel lablety = new JLabel();
                lablety.setIcon(new ImageIcon("skirt.png"));
                lablety.setBounds(120, 500, 128,128);
                oj.add(lablety);

                Container og = f.getContentPane();
                JLabel lablekj = new JLabel();
                lablekj.setIcon(new ImageIcon("gloves.png"));
                lablekj.setBounds(400, 300, 128,128);
                og.add(lablekj);

                Container on = f.getContentPane();
                JLabel labledg = new JLabel();
                labledg.setIcon(new ImageIcon("scarf.png"));
                Dimension size = labledg.getPreferredSize();
                labledg.setBounds(400, 500, 128,128);
                on.add(labledg);


                // label ha


                JLabel e = new JLabel("Choose and set your order");
                e.setBounds(50, 40, 1000, 50);
                e.setFont(new Font("hg", Font.PLAIN, 30));
                f.add(e);

                JTextArea j = new JTextArea();
                j.setBounds(550, 40, 100, 120);
                j.setBackground(Color.orange);
                j.setEditable(false);
                f.add(j);

                JCheckBox a = new JCheckBox("Jeans");
                a.setBounds(100, 250, 150, 20);
                a.setBackground(Color.pink);
                JLabel ap = new JLabel("Price =  100$");
                ap.setBounds(120, 270, 150, 20);
                JLabel am = new JLabel("amountJ : ");
                f.add(a);
                f.add(ap);

                JCheckBox b = new JCheckBox("T-Shirt");
                b.setBounds(400, 250, 150, 20);
                b.setBackground(Color.pink);
                JLabel bp = new JLabel("Price =  75$");
                bp.setBounds(420, 270, 150, 20);
                f.add(b);
                f.add(bp);

                JCheckBox c = new JCheckBox("Hat");
                c.setBounds(100, 430, 150, 20);
                c.setBackground(Color.pink);
                JLabel cp = new JLabel("Price =  50$");
                cp.setBounds(120, 450, 150, 20);
                f.add(c);
                f.add(cp);

                JCheckBox d = new JCheckBox("Gloves");
                d.setBounds(400, 430, 150, 20);
                d.setBackground(Color.pink);
                JLabel dp = new JLabel("Price =  65$");
                dp.setBounds(420, 450, 150, 20);
                f.add(d);
                f.add(dp);

                JCheckBox g = new JCheckBox("Skirt");
                g.setBounds(100, 610, 150, 20);
                g.setBackground(Color.pink);
                JLabel gp = new JLabel("Price =  85$");
                gp.setBounds(120, 630, 150, 20);
                f.add(g);
                f.add(gp);

                JCheckBox h = new JCheckBox("Scarf");
                h.setBounds(400, 610, 150, 20);
                h.setBackground(Color.pink);
                JLabel hp = new JLabel("Price =  55$");
                hp.setBounds(420, 630, 150, 20);
                f.add(h);
                f.add(hp);

                // button ha

                JButton i = new JButton("Place Order");
                i.setBounds(550, 180, 100, 30);
                i.setFont(new Font("ssa", Font.BOLD, 10));
                f.add(i);

                JButton k = new JButton("Back");
                k.setBounds(550, 220, 100, 30);
                k.setFont(new Font("dsd", Font.BOLD, 10));
                f.add(k);

                // action listener ha


                k.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                if (e.getSource() == k) {
                                        f.dispose();
                                        new SignIn();
                                }
                        }
                });

                i.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                if (e.getSource() == i) {
                                }
                        }
                });
        }
}