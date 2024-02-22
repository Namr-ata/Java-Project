
import java.awt.Color;
import java.awt.Container;
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
 class Frame extends JFrame{
     Container c;
     JLabel l1;
     JPasswordField value;
    public Frame(){
        setSize(300,300);
        
      setTitle("password field example");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.red);
    
    setLayout(null);
          value = new JPasswordField();   
          l1=new JLabel("Password:"); 
            l1.setBounds(20,100, 80,30);    
         value.setBounds(100,100,100,30);
         c.add(l1);
         c.add(value);
        setVisible(true);
        
    }

}
public class Password {
    public static void main(String[]args){
       new Frame(); 
    }
}
