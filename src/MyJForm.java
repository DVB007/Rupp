import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Delegation Event Model
class MyJForm extends JFrame implements ActionListener {
    // 2
    JLabel lb1, lb2, lb3;
    JTextField tf1, tf2, tf3;
    JButton bt1, bt2, bt3, bt4, bt5;
    ImageIcon icon;

    MyJForm(){
        super("Event Demo");

        // ១. បង្កើត Label ឱ្យមានរូបរាងជាមុនសិន (ដើម្បីកុំឱ្យវា Null)
        lb1 = new JLabel("Input value : ");
        lb2 = new JLabel("Input value : ");
        lb3 = new JLabel("Result : ");

        // ២. បន្ទាប់មកទើបបង្កើត Icon និងដាក់ចូលក្នុង Label
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/image-solid.png"));
        Image scaledImage = originalIcon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);

        lb3.setIcon(icon); // ពេលនេះប្រើបានហើយ ព្រោះ lb3 លែង Null
        setIconImage(icon.getImage());

        // ៣. បន្តបង្កើតគ្រឿងបង្គុំផ្សេងៗទៀតតាមលំដាប់
        setSize(370, 500); // ខ្ញុំបន្ថែមទំហំកម្ពស់បន្តិច ដើម្បីកុំឱ្យបាំងរូបភាព
        setLayout(new FlowLayout());

        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);

        bt1 = new JButton("ADD");
        bt2 = new JButton("SUB");
        bt3 = new JButton("MUL");
        bt4 = new JButton("DIV");
        bt5 = new JButton("CLEAR");

        // ៤. Add ចូលក្នុង Form
        add(lb1); add(tf1);
        add(lb2); add(tf2);
        add(bt1); add(bt2); add(bt3); add(bt4); add(bt5);
        add(lb3); add(tf3);

        setVisible(true);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new MyJForm();
    }
    public void actionPerformed(ActionEvent ae){
        double result=0, val1=0, val2=0;
        if (ae.getSource() == bt1){
            val1 = Double.parseDouble(tf1.getText());
            val2 = Double.parseDouble(tf2.getText());
            result = val1+val2;
            tf3.setText("" + result);
        }
        if (ae.getSource() == bt2){
            val1 = Double.parseDouble(tf1.getText());
            val2 = Double.parseDouble(tf2.getText());
            result = val1-val2;
            tf3.setText("" + result);
        }
        if (ae.getSource() == bt3){
            val1 = Double.parseDouble(tf1.getText());
            val2 = Double.parseDouble(tf2.getText());
            result = val1*val2;
            tf3.setText("" + result);
        }
        if (ae.getSource() == bt4){
            val1 = Double.parseDouble(tf1.getText());
            val2 = Double.parseDouble(tf2.getText());
            result = val1/val2;
            tf3.setText("" + result);
        }
        if (ae.getSource() == bt5){
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
    }
}