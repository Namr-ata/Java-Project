import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PrTable  extends JFrame{
    JTable table;
    JTextField t1,t2,t3;
   // JLabel l1,l2,l3;
    JButton b1,b2,b3;
    public PrTable()
    {
        setTitle("TableProject");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    Object[][] data={{1,"Namrata",20},{2,"Devkota",20}};
    String[] colname={"Roll","Name","Age"};
    DefaultTableModel model=new DefaultTableModel(data,colname);
    table=new JTable(model);
   // add(new JScrollPane(table));
    setLayout(new GridLayout(3,1));
     JPanel panel=new JPanel();
     add(new JScrollPane(table));
     add(new JPanel());
     add(panel);
     t1=new JTextField();
     t2=new JTextField();
     t3=new JTextField();
     b1=new JButton("Add");
     b2=new JButton("Update");
     b3=new JButton("Delete");
     panel.setLayout(new GridLayout(3,3));
     panel.add(new JLabel("Roll No"));
     panel.add(t1);
     panel.add(b1);
     panel.add(new JLabel("Name"));
     panel.add(t2);
     panel.add(b2);
     panel.add(new JLabel("Age"));
     panel.add(t3);
     panel.add(b3);
    setVisible(true);
    b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             if(t1.getText().toString().isEmpty()||t2.getText().toString().isEmpty()||t3.getText().toString().isEmpty())
             {
                 JOptionPane.showMessageDialog(null,"Please fill all the fields","Error",JOptionPane.ERROR_MESSAGE);
             }
             else
             {
                int roll=Integer.parseInt( t1.getText().toString());
             String name=t2.getText().toString();
             int age=Integer.parseInt( t3.getText().toString());
             Object[] newrow={roll,name,age};
             model.addRow(newrow);
             t1.setText(null);
             t2.setText(null);
             t3.setText(null);
            }
            }
            
        });
    
     b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             if(t1.getText().toString().isEmpty()||t2.getText().toString().isEmpty()||t3.getText().toString().isEmpty())
             {
                 JOptionPane.showMessageDialog(null,"Please fill all the fields","Error",JOptionPane.ERROR_MESSAGE);
             }
             else
             {
                int roll=Integer.parseInt( t1.getText().toString());
                 String name=t2.getText().toString();
                 int age=Integer.parseInt( t3.getText().toString());
                 int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            if ((int) model.getValueAt(i, 0) == roll) {
                // Update the values in the row
                model.setValueAt(name, i, 1);
                model.setValueAt(age, i, 2);
                break; // Stop searching after finding the matching row
            }
        }
                 
            }
            }
     });
    {
        
    }
    }
    
    public static void main(String[] args) {
        
        
        
        new PrTable();
    }
}