import javax.swing.*;
import java.awt.event.*;

class graphic implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton b;
    public graphic()
    {
        f=new JFrame("ashwini");
        t=new JTextField();
        b=new JButton("submit");
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setBounds(100,100,100,50);
        b.setBounds(120,200,80,50);
        f.add(t);
        f.add(b);
        b.addActionListener(this);
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        t.setText("welcome");
    }
    public static void main (String[]argh)
    {
        new graphic();
        
    }
   
}