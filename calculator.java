import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class calculator extends JFrame implements ActionListener
{
  //JFrame f;
  JTextField t;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bsub,badd,bdec,bclr,bmul,beq,bdel;
  double a=0,b=0,result=0;
  int operator=0;
  calculator()
  {
    super("Simple Calculator");
    t=new JTextField();
    b1=new JButton("1");
    b1.setForeground(Color.MAGENTA);
    b2=new JButton("2");
    b2.setForeground(Color.MAGENTA);
    b3=new JButton("3");
    b3.setForeground(Color.MAGENTA);
    b4=new JButton("4");
    b4.setForeground(Color.MAGENTA);
    b5=new JButton("5");
    b5.setForeground(Color.MAGENTA);
    b6=new JButton("6");
    b6.setForeground(Color.MAGENTA);
    b7=new JButton("7");
    b7.setForeground(Color.MAGENTA);
    b8=new JButton("8");
    b8.setForeground(Color.MAGENTA);
    b9=new JButton("9");
    b9.setForeground(Color.MAGENTA);
    b0=new JButton("0");
    b0.setForeground(Color.MAGENTA);
    badd=new JButton("+");
    badd.setBackground(Color.LIGHT_GRAY);
    badd.setForeground(Color.RED);
    bsub=new JButton("-");
    bsub.setBackground(Color.LIGHT_GRAY);
    bsub.setForeground(Color.RED);
    bmul=new JButton("*");
    bmul.setBackground(Color.LIGHT_GRAY);
    bmul.setForeground(Color.RED);
    bdiv=new JButton("/");
    bdiv.setBackground(Color.LIGHT_GRAY);
    bdiv.setForeground(Color.RED);
    bdec=new JButton(".");
    bdec.setBackground(Color.LIGHT_GRAY);
    bdec.setForeground(Color.RED);
    beq=new JButton("=");
    beq.setBackground(Color.LIGHT_GRAY);
    beq.setForeground(Color.RED);
    bdel=new JButton("DELETE");
    bdel.setBackground(Color.GRAY);
    bdel.setForeground(Color.BLACK);
    bclr=new JButton("CLEAR");
    bclr.setBackground(Color.GRAY);
    bclr.setForeground(Color.BLACK);
    t.setBounds(30,40,280,30);
    b7.setBounds(40,100,50,40);
    b8.setBounds(110,100,50,40);
    b9.setBounds(180,100,50,40);
    bdiv.setBounds(250,100,50,40);
    b4.setBounds(40,170,50,40);
    b5.setBounds(110,170,50,40);
    b6.setBounds(180,170,50,40);
    bmul.setBounds(250,170,50,40);
    b1.setBounds(40,240,50,40);
    b2.setBounds(110,240,50,40);
    b3.setBounds(180,240,50,40);
    bsub.setBounds(250,240,50,40);
    bdec.setBounds(40,310,50,40);
    b0.setBounds(110,310,50,40);
    beq.setBounds(180,310,50,40);
    badd.setBounds(250,310,50,40);
    bdel.setBounds(60,380,100,40);
    bclr.setBounds(180,380,100,40);
    add(t);
    add(b7);
    add(b8);
    add(b9);
    add(bdiv);
    add(b4);
    add(b5);
    add(b6);
    add(bmul);
    add(b1);
    add(b2);
    add(b3);
    add(bsub);
    add(bdec);
    add(b0);
    add(beq);
    add(badd);
    add(bdel);
    add(bclr);
    setLayout(null);
    setVisible(true);
    setSize(350,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    badd.addActionListener(this);
    bdiv.addActionListener(this);
    bmul.addActionListener(this);
    bsub.addActionListener(this);
    bdec.addActionListener(this);
    bdel.addActionListener(this);
    bclr.addActionListener(this);
    beq.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    t.setText(t.getText().concat("1"));
    if(ae.getSource()==b2)
    t.setText(t.getText().concat("2"));
    if(ae.getSource()==b3)
    t.setText(t.getText().concat("3"));
    if(ae.getSource()==b4)
    t.setText(t.getText().concat("4"));
    if(ae.getSource()==b5)
    t.setText(t.getText().concat("5"));
    if(ae.getSource()==b6)
    t.setText(t.getText().concat("6"));
    if(ae.getSource()==b7)
    t.setText(t.getText().concat("7"));
    if(ae.getSource()==b8)
    t.setText(t.getText().concat("8"));
    if(ae.getSource()==b9)
    t.setText(t.getText().concat("9"));
    if(ae.getSource()==b0)
    t.setText(t.getText().concat("0"));
    if(ae.getSource()==bdec)
    t.setText(t.getText().concat("."));
    if(ae.getSource()==badd)
    {
      a=Double.parseDouble(t.getText());
      operator=1;
      t.setText(" ");
    }
    if(ae.getSource()==bsub)
    {
      a=Double.parseDouble(t.getText());
      operator=2;
      t.setText(" ");
    }
    if(ae.getSource()==bmul)
    {
      a=Double.parseDouble(t.getText());
      operator=3;
      t.setText(" ");
    }
    if(ae.getSource()==bdiv)
    {
      a=Double.parseDouble(t.getText());
      operator=4;
      t.setText(" ");
    }
    if(ae.getSource()==beq)
    {
      b=Double.parseDouble(t.getText());
      switch(operator)
      {
        case 1: result=(a+b);
                break;
        case 2: result=(a-b);
                break;
        case 3: result=(a*b);
                break;
        case 4: result=(a/b);
                break;
        default:result=0;
                break; 
      }
      t.setText(" "+result);
    }
    if(ae.getSource()==bclr)
    t.setText(" ");
    if(ae.getSource()==bdel)
    {
      String s=t.getText();
      t.setText(" ");
      for(int i=0;i<s.length()-1;i++)
      t.setText(t.getText()+s.charAt(i));
    }
  }
  public static void main(String args[])
  {
    new calculator();
  }
}
    
