import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JButtonDemo extends JFrame implements ActionListener {
    JTextField jtf;
    JButton jb1, jb2, jb3, jb4;

    JButtonDemo() {
        super("JButton Demo");
        setLayout(new FlowLayout());
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon france = new ImageIcon("france.gif");
        jb1 = new JButton("FRANCE", france);
        jb1.addActionListener(this);
        add(jb1);
        ImageIcon germany = new ImageIcon("germany.gif");
        jb2 = new JButton("GERMANY", germany);
        jb2.addActionListener(this);
        add(jb2);
        ImageIcon italy = new ImageIcon("italy.gif");
        jb3 = new JButton("ITALY", italy);
        jb3.addActionListener(this);
        add(jb3);
        ImageIcon japan = new ImageIcon("japan.gif");
        jb4 = new JButton("JAPAN", japan);
        jb4.addActionListener(this);
        add(jb4);
        jtf = new JTextField(15);
        add(jtf);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jb1){
            jtf.setText(jb1.getText());
        }
        if (ae.getSource() == jb2){
            jtf.setText(jb2.getText());
        }
        if (ae.getSource() == jb3){
            jtf.setText(jb3.getText());
        }
        if (ae.getSource() == jb4){
            jtf.setText(jb4.getText());
        }
    }
    public static void main(String args[]){
        new JButtonDemo();
    }
}