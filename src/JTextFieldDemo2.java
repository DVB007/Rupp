import java.awt.*;
import javax.swing.*;

class JTextFieldDemo2 extends JFrame {
    JTextField jtf;

    JTextFieldDemo2() {
        super("Text Field Demo");
        setLayout(new FlowLayout());
        setSize(400, 250);
        // Add text field to content pane
        jtf = new JTextField(15);
        add(jtf);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf.setToolTipText("Input a value here.");
    }
    public static void main(String args[]){
        new JTextFieldDemo();
    }
}