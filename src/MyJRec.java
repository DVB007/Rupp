import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJRec extends JFrame implements ActionListener {
    JLabel lb1, lb2, lb3, lb4;
    JTextField tf1, tf2, tf3;
    JButton bt1, bt2, bt3, bt4;
    JTextArea ta;
    JRadioButton male, female;
    ButtonGroup bg = new ButtonGroup();

    MyJRec(){
        super("Student Record");
        setSize(400, 380);
        setLayout(new FlowLayout());
        lb1 = new JLabel("ID : ");
        lb2 = new JLabel("NAME : ");
        lb3 = new JLabel("SEX : ");
        lb4 = new JLabel("SCORE : ");
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);
        bt1 = new JButton("ADD");
        bt2 = new JButton("DEL");
        bt3 = new JButton("UPDATE");
        bt4 = new JButton("CLEAR");
        ta = new JTextArea(5, 30);
        male = new JRadioButton("Male", true);
        female = new JRadioButton("Female", false);
        bg.add(male); bg.add(female);
        add(lb1); add(tf1);
        add(lb2); add(tf2);
        add(lb3); add(male); add(female);
        add(lb4); add(tf3);
        add(bt1); add(bt2); add(bt3); add(bt4);
        add(ta);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt1.addActionListener(this);
        bt4.addActionListener(this);
    }
    public static void main(String[] args){
        new MyJRec();
    }
    public void actionPerformed(ActionEvent ae){
        String sex = "";
        if (male.isSelected() == true)
            sex = "Male";
        else sex = "Female";
        if (ae.getSource() == bt1){
            ta.append(tf1.getText() + ", " + tf2.getText() + ", " +
                    sex + ", " + tf3.getText()+"\n");
        }
        if (ae.getSource() == bt4){
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
    }
}