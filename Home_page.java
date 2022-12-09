import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.event.*;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Scanner;
public class home_page extends JFrame implements ActionListener
{
    JMenuBar mb,mb1;
    JFrame j;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    JMenuItem a,b,c,d,e,f,g,h,i,j1,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    JMenuItem a1,bb,c1,d1,e1,f1,g1,h1,i1,k1,l1,m1,n1,o1,p1,q1;
    home_page() {
      j = new JFrame("CREAM CENTRE");
      j.setVisible(true);
      j.setLayout(null);
      j.setBounds(250, 90, 800, 500);
      j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      mb = new JMenuBar();
      mb.setBounds(200,0,620,18);
      j.add(mb);

      mb1 = new JMenuBar();
      mb1.setBounds(200,38,620,18);
      j.add(mb1);

      JMenu starters = new JMenu("STARTERS");
      starters.setBounds(200,0,40,10);
      mb.add(starters);

      a = new JMenuItem("VEG CRISPY");
      starters.add(a);

      b = new JMenuItem("VEG MANCHURIAN DRY");
      starters.add(b);

      c = new JMenuItem("PANEER MACHURIAN");
      starters.add(c);

      d = new JMenuItem("PANEER CHILLY");
      starters.add(d);

      e = new JMenuItem("GOBI MANCHURIAN");
      starters.add(e);

      f = new JMenuItem("PANEER CRISPY");
      starters.add(f);

      JMenu main = new JMenu("MAIN COURSE");
      main.setBounds(241,0,60,10);
      mb.add(main);

      g = new JMenuItem("PUNJABI CHOLE MASALA");
      main.add(g);

      h = new JMenuItem("SUM ALOO PUNJABI");
      main.add(h);

      i = new JMenuItem("VEG HARIYALI");
      main.add(i);

      j1 = new JMenuItem("VEG KADHAI");
      main.add(j1);

      k = new JMenuItem("PANEER MATAR");
      main.add(k);

      l = new JMenuItem("PANEER BUTTER MASALA");
      main.add(l);

      JMenu sand = new JMenu("SANDWICHES");
      main.setBounds(302,0,50,10);
      mb.add(sand);

      m = new JMenuItem("BREAD AND BUTTER");
      sand.add(m);

      n = new JMenuItem("LOADED VEGGIE SANDWICH");
      sand.add(n);

      o = new JMenuItem("LOADED VEGGIE CHEESE SANDWICH");
      sand.add(o);

      p = new JMenuItem("VEGGIE MAYO SANDWICH");
      sand.add(p);

      q = new JMenuItem("ONLY CHEESE SANDWICH");
      sand.add(q);

      r = new JMenuItem("CHEESE CHILLY TOAST");
      sand.add(r);

      JMenu soup = new JMenu("SOUP");
      main.setBounds(302,0,50,10);
      mb.add(soup);

      s = new JMenuItem("TOMATO SOUP");
      soup.add(s);

      t = new JMenuItem("MANCHOW SOUP");
      soup.add(t);

      u = new JMenuItem("MANCHOW TOMATO SOUP");
      soup.add(u);

      v = new JMenuItem("SPICY SOUP");
      soup.add(v);

      JMenu pt = new JMenu("PASTA");
      main.setBounds(302,0,50,10);
      mb.add(pt);

      s = new JMenuItem("HOT PINK PASTA");
      pt.add(s);

      t = new JMenuItem("HOT WHITE PASTA");
      pt.add(t);

      u = new JMenuItem("HOT RED PASTA");
      pt.add(u);

      v = new JMenuItem("SPHEGATTI PASTA");
      pt.add(v);

      w = new JMenuItem("MAGGI PASTA");
      pt.add(w);

      x = new JMenuItem("PASTA CUBE");
      pt.add(x);
// chinese

      JMenu ch = new JMenu("CHINESE");
      main.setBounds(302,0,50,10);
      mb.add(ch);

      y = new JMenuItem("FRIED RICE");
      ch.add(y);

      z = new JMenuItem("HAKKA NOODLES");
      ch.add(z);

      a1 = new JMenuItem("SCHEZWAN NOODLES");
      ch.add(a1);

      bb = new JMenuItem("SCHEZWAN FRIED RICE");
      ch.add(bb);

      c1 = new JMenuItem("TRIPLE FRIED RICE");
      ch.add(c1);

      d1 = new JMenuItem("THAI NOODLES");
      ch.add(d1);
// mexican
      JMenu mx = new JMenu("MEXICAN");
      main.setBounds(302,0,50,10);
      mb1.add(mx);

      e1 = new JMenuItem("TACOS");
      mx.add(e1);

      f1 = new JMenuItem("BURRITO BOWL");
      mx.add(f1);

      g1 = new JMenuItem("QUASEDILLA");
      mx.add(g1);

      h1 = new JMenuItem("BIG NACHOS");
      mx.add(h1);

      i1 = new JMenuItem("SMALL NACHOS");
      mx.add(i1);

      k1 = new JMenuItem("LEBANESE BURITO");
      mx.add(k1);
// PIZZA
      JMenu pz = new JMenu("PIZZA");
      main.setBounds(302,0,80,10);
      mb1.add(pz);

      l1 = new JMenuItem("MARGHAERITA");
      pz.add(l1);

      m1 = new JMenuItem("OLIVIN IT PIZZA");
      pz.add(m1);

      n1 = new JMenuItem("PEPPY PANEER");
      pz.add(n1);

      o1 = new JMenuItem("THIN CRUST VENDURE PIZZA");
      pz.add(o1);

      p1 = new JMenuItem("BLACK HOLE PIZZA");
      pz.add(p1);

      q1 = new JMenuItem("CHEESE CORN CAPSICUM");
      pz.add(q1);

      //DESSERTS
      JMenu ds = new JMenu("DESSERTS");
      main.setBounds(302,0,50,10);
      mb1.add(ds);

      y = new JMenuItem("BROWNIE");
      ds.add(y);

      z = new JMenuItem("GULAB JAMUN");
      ds.add(z);

      a1 = new JMenuItem("RED VELVET CHEESECAKE");
      ds.add(a1);

      bb = new JMenuItem("RASMALAI PASTRY");
      ds.add(bb);

      c1 = new JMenuItem("BROWNIE CHEESE JAR CAKE");
      ds.add(c1);

      d1 = new JMenuItem("BLACK FOREST JAR CAKE");
      ds.add(d1);
      // mocktails

      JMenu mk = new JMenu("MOCKTAILS");
      mb1.add(mk);

      y = new JMenuItem("STRAWBERRY MOCKTAIL");
      mk.add(y);

      z = new JMenuItem("RED PURPLE MOCKTAIL");
      mk.add(z);

      a1 = new JMenuItem("PINK CLASSCIO");
      mk.add(a1);

      bb = new JMenuItem("SALT AND MINT");
      mk.add(bb);

      c1 = new JMenuItem("SWEET SOUR");
      mk.add(c1);

      d1 = new JMenuItem("PEPPER MINT");
      mk.add(d1);

      // milkshakes
      JMenu mks = new JMenu("MILKSHAKES");
      mb1.add(mks);

      y = new JMenuItem("BANANA MILKSHAKE");
      mks.add(y);

      z = new JMenuItem("OREO MILKSHAKE");
      mks.add(z);

      a1 = new JMenuItem("CHOCOLATE MILKSHAKE");
      mks.add(a1);

      bb = new JMenuItem("VANILLA MILKSHAKE");
      mks.add(bb);

      c1 = new JMenuItem("STRAWBERRY MILKSHAKE");
      mks.add(c1);

      d1 = new JMenuItem("CHIKU MILKSHAKE");
      mks.add(d1);

      JMenu ju = new JMenu("JUICES");
      mb1.add(ju);

      y = new JMenuItem("ORANGE JUICE");
      ju.add(y);

      z = new JMenuItem("MOSAMBI JUICE");
      ju.add(z);

      a1 = new JMenuItem("WATERMELON JUICE");
      ju.add(a1);

      bb = new JMenuItem("APPLE JUICE");
      ju.add(bb);

      c1 = new JMenuItem("PINEAPPLE JUICE");
      ju.add(c1);

      d1 = new JMenuItem("KIWI JUICE");
      ju.add(d1);

      JPanel p = new JPanel();
      p.setBounds(0, 0, 200, 800);
      p.setBackground(Color.gray);
      j.add(p);

      JLabel l = new JLabel("CREAM");
      JLabel l2 = new JLabel("CENTER");
      l.setBounds(50, 140, 80, 100);
      l2.setBounds(75, 160, 80, 100);
      p.add(l);
      p.add(l2);

      JLabel l1 = new JLabel("SELECT CATEGORIES TO PLACE ORDER:");
      j.add(l1);
      l1.setBounds(220, 150, 250, 30);

      b1 = new JButton("STARTERS");
      j.add(b1);
      b1.setBounds(220, 210, 100, 30);

      b2 = new JButton("MAIN COURSE");
      j.add(b2);
      b2.setBounds(340, 210, 120, 30);

      b3 = new JButton("SANDWICHES");
      j.add(b3);
      b3.setBounds(480, 210, 120, 30);

      b4 = new JButton("SOUP");
      j.add(b4);
      b4.setBounds(620, 210, 80, 30);

      b5 = new JButton("PASTA");
      j.add(b5);
      b5.setBounds(220, 270, 100, 30);

      b6 = new JButton("CHINESE");
      j.add(b6);
      b6.setBounds(340, 270, 120, 30);

      b7 = new JButton("MEXICAN");
      j.add(b7);
      b7.setBounds(480, 270, 120, 30);

      b8 = new JButton("PIZZA");
      j.add(b8);
      b8.setBounds(620, 270, 80, 30);

      b9 = new JButton("DESSERTS");
      j.add(b9);
      b9.setBounds(220, 330, 100, 30);

      b10 = new JButton("MOCKTAILS");
      j.add(b10);
      b10.setBounds(340, 330, 120, 30);

      b11 = new JButton("MILKSHAKES");
      j.add(b11);
      b11.setBounds(480, 330, 120, 30);

      b12 = new JButton("JUICES");
      j.add(b12);
      b12.setBounds(620, 330, 80, 30);

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
