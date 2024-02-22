import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Dialog_example extends JFrame implements ActionListener{
    JButton b;
    JLabel l;
    Container c; 
    public Dialog_example(){
        setTitle("Dialog Box");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=this.getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("Submit");
        b.addActionListener(this);
        c.add(b);
        
        l = new JLabel(" ");
        c.add(l);
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Dialog_example();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String s = JOptionPane.showInputDialog("Enter your name:");
   l.setText(s);
    JOptionPane.showMessageDialog(c, "Hello There");
    }
}

