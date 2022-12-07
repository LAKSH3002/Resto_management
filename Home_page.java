import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.event.*;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Scanner;
public class home_page extends JFrame implements ActionListener
{
    JFrame j;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    home_page() {
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
      l.setBounds(50, 180, 40, 100);
      l2.setBounds(75, 280, 40, 100);
      p.add(l);
      p.add(l2);

      JLabel l1 = new JLabel("SELECT CATEGORIES:");
      j.add(l1);
      l1.setBounds(220, 10, 150, 30);

      b1 = new JButton("STARTERS");
      j.add(b1);
      b1.setBounds(220, 70, 100, 30);

      b2 = new JButton("MAIN COURSE");
      j.add(b2);
      b2.setBounds(340, 70, 120, 30);

      b3 = new JButton("SANDWICHES");
      j.add(b3);
      b3.setBounds(480, 70, 120, 30);

      b4 = new JButton("SOUP");
      j.add(b4);
      b4.setBounds(620, 70, 80, 30);

      b5 = new JButton("PASTA");
      j.add(b5);
      b5.setBounds(220, 130, 100, 30);

      b6 = new JButton("CHINESE");
      j.add(b6);
      b6.setBounds(340, 130, 120, 30);

      b7 = new JButton("MEXICAN");
      j.add(b7);
      b7.setBounds(480, 130, 120, 30);

      b8 = new JButton("PIZZA");
      j.add(b8);
      b8.setBounds(620, 130, 80, 30);

      b9 = new JButton("DESSERTS");
      j.add(b9);
      b9.setBounds(220, 190, 100, 30);

      b10 = new JButton("MOCKTAILS");
      j.add(b10);
      b10.setBounds(340, 190, 120, 30);

      b11 = new JButton("MILKSHAKES");
      j.add(b11);
      b11.setBounds(480, 190, 120, 30);

      b12 = new JButton("JUICES");
      j.add(b12);
      b12.setBounds(620, 190, 80, 30);

      Date d = new Date();
      int a = d.getDate();


      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      b10.addActionListener(this);
      b11.addActionListener(this);
      b12.addActionListener(this);

    }
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      starters s = new starters();
      s.setVisible(true);
      dispose();
    }
    if(e.getSource()== b2)
    {
    main_course m = new main_course();
    m.setVisible(true);
    dispose();
    }
    if(e.getSource()==b3)
    {
      sandwiches s = new sandwiches();
      s.setVisible(true);
      dispose();
    }
    if(e.getSource()==b4)
    {
      soup s = new soup();
      s.setVisible(true);
      dispose();
    }
    if(e.getSource()== b5)
    {
    pasta p = new pasta();
    p.setVisible(true);
    dispose();
    }
    if(e.getSource()== b6)
    {
    chinese c = new chinese();
    c.setVisible(true);
    dispose();
    }
    if(e.getSource()== b7)
    {
    mexican m = new mexican();
    m.setVisible(true);
    dispose();
    }
    if(e.getSource()== b8)
    {
      pizzas p = new pizzas();
      dispose();
    }
    if(e.getSource()==b9)
    {
     Desserts d = new Desserts();
     d.setVisible(true);
     dispose();
    }
    if(e.getSource()==b10)
    {
      mocktails m1 = new mocktails();
      m1.setVisible(true);
      dispose();
    }
    if(e.getSource()==b11)
    {
      milkshakes m = new milkshakes();
      m.setVisible(true);
      dispose();
    }
    if(e.getSource()==b12)
    {
     juices j = new juices();
     j.setVisible(true);
     dispose();
    }
  }
  public static void main(String[] args)
    {
       home_page h = new home_page();
    }

  }
