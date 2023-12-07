
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
class Calculator1 extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton ba,bs,bm,bd,beq,br;
    JComboBox cb;
    Container c;
    public Calculator1(){
    setSize(400,400);
    setTitle("calculator");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    c=this.getContentPane();
    c.setLayout(null);
   c.setBackground(Color.MAGENTA);
    
     l1=new JLabel("First NUmber");
     l1.setBounds(20,50,80,30);
      c.add(l1);
      t1=new JTextField();
     t1.setBounds(100,50,40,30);
     c.add(t1);
     
     l2=new JLabel("second number");
     l2.setBounds(200,50,130,30);
      c.add(l2);
      t2=new JTextField();
     t2.setBounds(290,50,40,30);
     c.add(t2);
     
     ba=new JButton("+");  
    ba.setBounds(20,100,50,30);  
    c.add(ba);
    ba.addActionListener(this);
    
    
     bs=new JButton("-");  
    bs.setBounds(80,100,50,30);  
    c.add(bs);
    bs.addActionListener(this);
    
    
     bm=new JButton("*");  
    bm.setBounds(130,100,50,30);  
    c.add(bm);
    bm.addActionListener(this);
   
     bd=new JButton("/");  
    bd.setBounds(180,100,50,30);  
    c.add(bd);
    bd.addActionListener(this);
    
      br=new JButton("reset");  
    br.setBounds(20,150,80,30);  
    c.add(br);
    br.addActionListener(this);
//     beq=new JButton("=");  
//       beq.setBounds(230,100,50,30);  
//    c.add(beq);
    //beq.addActionListener(this);
     
    l3=new JLabel();
     l3.setBounds(230,200,80,30);
      c.add(l3);
      
     setVisible(true);
}
  public void actionPerformed(ActionEvent e){
//        int a=Integer.parseInt(t1.getText());
//        int b=Integer.parseInt(t2.getText());
//       int c=a+b;
//       int s=a-b;
//       int m=a*b;
//      int   d=a/b;
      try{
        if (e.getSource()==ba){
            int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
       int c=a+b;
       
             l3.setText("res="+c);
        }
         if (e.getSource()==bs){
            int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
       int s=a-b;
       
             l3.setText("res="+s);
        }
          if (e.getSource()==bm){
            int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int m=a*b;
       
             l3.setText("res="+m);
        }
         if (e.getSource()==bd){
            int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int d=a/b;
       
             l3.setText("res="+d);
        }  
         if (e.getSource()==br){
         t1.setText("");
         t2.setText("");
         l3.setText("");
        }  
      }
      catch(NumberFormatException e1){
          l3.setText("Input integer only");
      }
      catch(ArithmeticException e2){
          l3.setText("Divide by zero");
      }
    }

}
public class Example2 {
    public static void main(String []args){
    new Calculator1();
    }
      
}
