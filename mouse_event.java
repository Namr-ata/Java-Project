/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.*;


public class mouse_event extends JFrame implements MouseListener{
    
    Container c;
    JLabel l1;
    JTextArea ta;
    
    public mouse_event(){
        setTitle("Example");
        setSize(500,500);
        c= this.getContentPane();
        c.setLayout(null);
        l1 = new JLabel("Example");
        l1.setBounds(20,20,60,80);
        c.add(l1);
        l1.addMouseListener(this);
        ta = new JTextArea();
        ta.setBounds(80, 20, 150, 80);
        
        c.add(ta);
        setVisible(true);
    }
    public static void main(String[] main){
       new mouse_event();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ta.setText("Mouse is clicked");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText("Mouse is pressed");}

    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText("Mouse is released.");}

    @Override
    public void mouseEntered(MouseEvent e) {
        ta.setBackground(Color.red);
       ta.setText("Mouse is enterred.");   }

    @Override
    public void mouseExited(MouseEvent e) {
        ta.setBackground(Color.blue);
         ta.setText("Mouse is exited."); }
}

