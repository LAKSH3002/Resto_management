import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class starters extends JFrame implements ActionListener
{
    JFrame j;
    JComboBox cb;
    JButton b,b1;

    starters() {
        j = new JFrame("CREAM CENTRE");
        j.setVisible(true);
        j.setLayout(null);
        j.setBounds(250, 90, 750, 500);
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

         b = new JButton("<< BACK TO HOME");
        b.setBounds(210,430,180,20);
        j.add(b);

         b1 = new JButton("PLACE ORDER >> ");
        j.add(b1);
        b1.setBounds(550,430,180,20);

        b1.addActionListener(this);
        b.addActionListener(this);

        JLabel l16 = new JLabel("ADD ONS:");
        j.add(l16);
        l16.setBounds(600,20,55,20);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            home_page h = new home_page();
            h.setVisible(true);
            dispose();
        }
    }
    public static void main(String[] args)
    {
        starters s = new starters();
    }
}
