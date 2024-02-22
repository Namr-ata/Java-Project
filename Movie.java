import java.sql.*;  
import java.awt.Container;
import java.awt.FlowLayout;
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
public class Movie extends JFrame implements ActionListener {
    JFrame jf;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3,l4;
    JButton b1;
    public Movie(){
        jf=new JFrame("movie rentral system");
        l1=new JLabel("name");
        l2=new JLabel("genre");
        l3=new JLabel("language");
        l4=new JLabel("length");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        t4=new JTextField(10);
        b1=new JButton("submit");
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(l3);
        jf.add(t3);
        jf.add(l4);
        jf.add(t4);
        jf.add(b1);
        jf.setSize(500, 700);
        jf.setLayout(new FlowLayout());
        b1.addActionListener(this);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent ae){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","");  
//here java is database name, root is username and password is empty  
Statement stmt=con.createStatement(); 
System.out.println("connection created");
String sql="insert into movies(name,genre,language,length)values(?,?,?,?);";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,t1.getText());
ps.setString(2,t2.getText());
ps.setString(3,t3.getText());
ps.setString(4,t4.getText());
ps.executeUpdate();
System.out.println("inserted  sucessfully");
con.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
    public static void main(String [] args){
        new Movie();
    }
    
}
