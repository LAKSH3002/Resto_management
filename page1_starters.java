package cafe.stages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Integer;

public class starters extends JFrame implements ActionListener
{
    JFrame j;
    JComboBox cb;
    JButton b,b1,pl;
    JTextField t1,t2,t3,t4,t5,t6;
    JTextArea tf;

    JButton b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;

    starters()
    {
        j = new JFrame("CREAM CENTRE");
        j.setVisible(true);
        j.setLayout(null);
        j.setBounds(250, 90, 800, 500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        p.setBounds(0, 0, 200, 500);
        p.setBackground(Color.gray);
        j.add(p);


        JLabel l = new JLabel("CREAM");
        JLabel l2 = new JLabel("CENTER");
        l.setLocation(50,100);
        l2.setBounds(75, 280, 40, 100);
        p.add(l,BorderLayout.NORTH);
        p.add(l2);

        JLabel ll = new JLabel("STARTERS:");
        j.add(ll);
        ll.setBounds(210,20,85,20);

        JLabel l3 = new JLabel("-> VEG CRISPY");
        j.add(l3);
        l3.setBounds(210, 60, 250, 20);

        JLabel l4 = new JLabel("-> VEG MANCHURIAN DRY");
        j.add(l4);
        l4.setBounds(210, 100, 250, 20);

        JLabel l5 = new JLabel("-> PANEER MANCHURIAN");
        j.add(l5);
        l5.setBounds(210, 140, 250, 20);

        JLabel l6 = new JLabel("-> PANEER CHILLY");
        j.add(l6);
        l6.setBounds(210, 180, 250, 20);

        JLabel l7 = new JLabel("-> GOBI MANCHURIAN");
        j.add(l7);
        l7.setBounds(210, 220, 250, 20);

        JLabel l8 = new JLabel("RATES:");
        j.add(l8);
        l8.setBounds(460,20,85,20);

        JLabel l9 = new JLabel("260");
        j.add(l9);
        l9.setBounds(460,60,45,20);

        JLabel l10 = new JLabel("280");
        j.add(l10);
        l10.setBounds(460,100,45,20);

        JLabel l11 = new JLabel("260");
        j.add(l11);
        l11.setBounds(460,140,45,20);

        JLabel l12 = new JLabel("300");
        j.add(l12);
        l12.setBounds(460,180,45,20);

        JLabel l13 = new JLabel("250");
        j.add(l13);
        l13.setBounds(460,220,45,20);

        JLabel l14 = new JLabel("-> PANEER CRISPY");
        j.add(l14);
        l14.setBounds(210, 260, 250, 20);

        JLabel l15 = new JLabel("280");
        j.add(l15);
        l15.setBounds(460,260,45,20);

        JLabel l16 = new JLabel("ADD ONS:");
        j.add(l16);
        l16.setBounds(600,20,85,20);

        t1 = new JTextField();
        t1.setBounds(600,60,100,20);
        t1.setBackground(Color.white);
        j.add(t1);
        t1.setVisible(true);

        t2 = new JTextField();
        t2.setBounds(600,100,100,20);
        t2.setBackground(Color.white);
        j.add(t2);
        t2.setVisible(true);

        t3 = new JTextField();
        t3.setBounds(600,140,100,20);
        t3.setBackground(Color.white);
        j.add(t3);
        t3.setVisible(true);

        t4 = new JTextField();
        t4.setBounds(600,180,100,20);
        t4.setBackground(Color.white);
        j.add(t4);
        t4.setVisible(true);

        t5 = new JTextField();
        t5.setBounds(600,220,100,20);
        t5.setBackground(Color.white);
        j.add(t5);
        t5.setVisible(true);

        t6 = new JTextField();
        t6.setBounds(600,260,100,20);
        t6.setBackground(Color.white);
        j.add(t6);
        t6.setVisible(true);

        JButton b3 = new JButton("+");
        b3.setBounds(700,60,50,20);
        j.add(b3);

        JButton b4 = new JButton("-");
        b4.setBounds(560,60,40,20);
        j.add(b4);

        JButton b5 = new JButton("+");
        b5.setBounds(700,100,50,20);
        j.add(b5);

        JButton b6 = new JButton("-");
        b6.setBounds(560,100,40,20);
        j.add(b6);

        JButton b7 = new JButton("+");
        b7.setBounds(700,140,50,20);
        j.add(b7);

        JButton b8 = new JButton("-");
        b8.setBounds(560,140,40,20);
        j.add(b8);

        JButton b9 = new JButton("+");
        b9.setBounds(700,180,50,20);
        j.add(b9);

        JButton b10 = new JButton("-");
        b10.setBounds(560,180,40,20);
        j.add(b10);

        JButton b11 = new JButton("+");
        b11.setBounds(700,220,50,20);
        j.add(b11);

        JButton b12 = new JButton("-");
        b12.setBounds(560,220,40,20);
        j.add(b12);

        JButton b13 = new JButton("+");
        b13.setBounds(700,260,50,20);
        j.add(b13);

        JButton b14 = new JButton("-");
        b14.setBounds(560,260,40,20);
        j.add(b14);

        b = new JButton("<< BACK TO HOME");
        b.setBounds(210,430,180,20);
        j.add(b);

        b1 = new JButton("PLACE ORDER >> ");
        j.add(b1);
        b1.setBounds(590,430,180,20);

        b1.addActionListener(this);
        b.addActionListener(this);

         pl = new JButton("PLACE ORDER");
        pl.setBounds(280,300,170,20);
        j.add(pl);

        pl.addActionListener(this);

        tf = new JTextArea();
        tf.setBounds(220,330,450,80);
        j.add(tf);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int n1 = Integer.parseInt(t1.getText());

        if(e.getSource()==pl && n1!=0)
        {
//            int n = n1*260 + n2*300 + n3*280;
            tf.setText("STARTERS BILL:"+ String.valueOf(n1*260));
        }

        int n2 = Integer.parseInt(t2.getText());
        if(e.getSource()==pl && n2!=0)
        {
            tf.setText("STARTERS BILL:"+ String.valueOf(n2*300));
        }

        if(e.getSource()==b)
        {
            home_page h = new home_page();
            h.setVisible(true);
            dispose();
        }
        if(e.getSource()==b1)
        {
            placement_page p = new placement_page();
            p.setVisible(true);
            dispose();
        }
    }
    public static void main(String[] args)
    {
        starters s = new starters();
    }
}
