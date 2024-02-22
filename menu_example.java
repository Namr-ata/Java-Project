import java.awt.FlowLayout;
import javax.swing.*;

public class menu_example {
    public static void main (String[] args) {
        JFrame jf = new JFrame ("Menu bar example");
        jf.setSize(500,500);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
//        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        JMenuBar menubar = new JMenuBar();
        menubar.setBounds(0,0,80,50);
        jf.add(menubar);
        
        JMenu file = new JMenu("File");
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("SaveAs");
        file.add(i1);
        file.add(i2);
        file.add(i3);
        menubar.add(file);
        
        JMenu edit = new JMenu("Edit");
        menubar.add(edit);
        JMenuItem j1 = new JMenuItem("Cut");
        JMenuItem j2 = new JMenuItem("Copy");
        edit.add(j1);
        edit.add(j2);
        
        
        jf.setVisible(true);
    }
}