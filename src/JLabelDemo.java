//Layout like FlowLayout
import java.awt.*;

// for calling UI like JFrame JTextField
import javax.swing.*;

// extends library JFrame to Your class
class JTextFieldDemo extends JFrame {
    // បង្កើត Variable ពីរដាច់ដោយឡែកពីគ្នា
    JTextField jtfID, jtfName;

    JTextFieldDemo() {

        //Set title
        super("Text Field Demo");

        //រៀបចំសមាសភាគក្នុងwindow ( prepare layout in Window )
        setLayout(new FlowLayout());

        //setLayout of window
        setSize(400, 250);

        //create object
        JLabel label1 = new JLabel("ID : ");

        //use object
        add(label1);

        // Add text field to content pane 15 character input in this field
        jtfID = new JTextField(15);

        //Create text field
        add(jtfID);

        // --- ជួរទី ២: Name ---
        JLabel label2 = new JLabel("\nName : ");
        add(label2);
        jtfName = new JTextField(15); // បង្កើត Object សម្រាប់ Name
        add(jtfName);

        //make visible window to Interface for watch
        setVisible(true);

        //for close processing while click button exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Alert message when hover text field
        jtfID.setToolTipText("Input a value here.");
    }
    public static void main(String[] args){
        //process class here
        new JTextFieldDemo();
    }
}