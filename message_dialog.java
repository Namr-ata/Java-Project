import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;


public class message_dialog  extends JFrame implements ActionListener{
    

    JButton b;
    JLabel l;
    Container c; 
    public message_dialog(){
        setTitle("Dialog Box");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=this.getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("Submit");
        b.addActionListener((ActionListener) this);
        c.add(b);
        
        l = new JLabel(" ");
        c.add(l);
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        message_dialog messagedialog = new message_dialog();
    }

    public void actionPerformed(ActionEvent e) {
      
//    JOptionPane.showMessageDialog(c, "Hello there", "Question", JOptionPane.QUESTION_MESSAGE);
    int a = JOptionPane.showConfirmDialog(c, "Do you wish to exit?","Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION);
    if(a == JOptionPane.YES_OPTION)
    {
        System.exit(1);
    }
    if(a == JOptionPane.NO_OPTION)
    {
    }
    if(a == JOptionPane.CANCEL_OPTION)
    {
       
    }
    }

  
}
