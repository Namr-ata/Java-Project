
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;

class Myframe extends JFrame{
    Container c;
    JLabel l1; 
    JTextField t1;
    public Myframe(){
    setSize(600,600);
    setTitle("Unit2GuI");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.CYAN);
   
    l1=new JLabel("Name");
     l1.setBounds(100,150,80,30);
     Font f =new Font("Arial",Font.ITALIC,18);
     l1.setFont(f);
    c.add(l1);
  t1=new JTextField();
  t1.setBounds(190,150,100,30);
  //t1.setFeildTable(false);
  c.add(t1);
    setVisible(true);
    }
    
}
public class Example{
public static void main(String []args){
    new Myframe();
    
}
}