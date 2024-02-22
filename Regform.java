
import java.awt.Color;
import java.awt.*;
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
public class Regform extends JFrame implements ActionListener{
     Container c;
     JLabel l1,l2,l3,dob,adress,l4;
     JTextField t1,t2;
     JRadioButton b1,b2;
     JButton b;
     JPasswordField value;
     JTextArea j,j1;
     JComboBox day,month,year;
     JCheckBox c1;
    public Regform(){
        setSize(700,700);
          setTitle("registration form example");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.GREEN);
    
     l1=new JLabel("Name");
     l1.setBounds(20,20,80,30);
     c.add(l1);
     t1=new JTextField();
  t1.setBounds(100,20,80,30);
  c.add(t1);
  
  l2=new JLabel("Mobile");
     l2.setBounds(20,60,80,30);
     c.add(l2);
     t2=new JTextField();
  t2.setBounds(100,60,80,30);
  c.add(t2);
  l3=new JLabel("Gender");
  l3.setBounds(20,100 ,80 ,30 );
  c.add(l3);
  b1=new JRadioButton("male");
  b2=new JRadioButton("Female");
  b1.setBounds(100,100, 80, 30);
  b2.setBounds(180, 100, 80, 30);
  c.add(b1);
  c.add(b2);
   ButtonGroup bg=new ButtonGroup();
   bg.add(b1);
   bg.add(b2);
     
   dob=new JLabel("Dob");
   dob.setBounds(20,130,80,30);
   c.add(dob);
   
   
   String days[]={"1","2","3","4"};
   String months[]={"jan","feb","mar"};
   String years[]={"2001","2002","2003","2004"};
   day= new JComboBox(days);
   day.setBounds(100,130,80,30);
   c.add(day);
   
  month= new JComboBox(months);
   month.setBounds(180,130,80,30);
   c.add(month);
   
   year= new JComboBox(years);
   year.setBounds(260,130,80,30);
   c.add(year);
    
   adress=new JLabel("adress");
   adress.setBounds(20, 160, 80, 30);
   c.add(adress);
   
   j=new JTextArea();
   j.setBounds(100,160,90,50);
   c.add(j);
   
    c1 = new JCheckBox("I accept all terms and condition");  
        c1.setBounds(20,220, 230,30);  
        c.add(c1);
        
    b=new JButton("submit");  
    b.setBounds(20,260,80,30);  
    c.add(b); 
    b.addActionListener(this);
    
     j1=new JTextArea();
   j1.setBounds(350,20,280,600);
   c.add(j1);
   
   l4=new JLabel("");
     l4.setBounds(20,300,80,30);
     c.add(l4);
  /*value = new JPasswordField();   
          l3=new JLabel("Password:"); 
            l3.setBounds(20,100, 80,30);    
         value.setBounds(100,100,100,30);
         c.add(l3);
         c.add(value);*/
    setVisible(true);
    }
public void actionPerformed(ActionEvent e){
    if(c1.isSelected()){
        l4.setText("registration successful");
        String name=t1.getText();
        String mobile=t2.getText();
        String gen="male";
        if(b2.isSelected())
            gen="female";
        String dob=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
        String adress=j.getText();
        j1.setText("Name="+name+"\n"+"mobile="+mobile+"\nGender="+gen+"\nDOB="+dob+"\nAdress="+adress);
    }
    else{
    l4.setText("please accept term and condition");
    j1.setText("");
    }
}
   public static void main (String [] args){
       new Regform();
   } 
}
