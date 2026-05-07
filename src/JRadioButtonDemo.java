import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JRadioButtonDemo extends JFrame implements ActionListener {
    JTextField tf;

    JRadioButtonDemo() {
        super("Swing JRadio Button Demo");
        setLayout(new FlowLayout());
        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton b1 = new JRadioButton("Java");
        b1.addActionListener(this);
        add(b1);
        JRadioButton b2 = new JRadioButton("VB.NET");
        b2.addActionListener(this);
        add(b2);
        JRadioButton b3 = new JRadioButton("C#");
        b3.addActionListener(this);
        add(b3);

        // Define a button group
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);

        // Create a text field and add it
        // to the frame
        tf = new JTextField(5);
        add(tf);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        tf.setText(ae.getActionCommand());
    }
    public static void main(String args[]){
        new JRadioButtonDemo();
    }
}