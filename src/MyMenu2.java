import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJMenu2 extends JFrame implements ActionListener {
    JMenuBar mbar;
    JMenu file, edit, comp;
    JMenuItem open, close, exit;
    JMenuItem copy, cut, paste;
    JMenuItem fib, fact, sumofseries, qequation;

    MyJMenu2(){
        super("Menu Demo");
        setSize(400, 380);
        setLayout(new FlowLayout());
        mbar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        comp = new JMenu("Compute");
        file.add(open = new JMenuItem("Open"));
        file.add(close = new JMenuItem("Close"));
        file.addSeparator();
        file.add(exit = new JMenuItem("Exit"));
        setJMenuBar(mbar);
        mbar.add(file);
        mbar.add(edit);
        mbar.add(comp);
        edit.add(copy=new JMenuItem("Copy"));
        edit.add(cut=new JMenuItem("Cut"));
        edit.add("-");
        edit.add(paste=new JMenuItem("Paste"));
        comp.add(fib = new JMenuItem("Fibonacci"));
        comp.add(fact = new JMenuItem("Factorial"));
        comp.add(sumofseries = new JMenuItem("Sum of Series number"));

        comp.add(qequation=new JMenuItem("Quadratic Equation"));
        setVisible(true);
        fact.addActionListener(this);
        exit.addActionListener(this);
    }
    public static void main(String[] args){
        new MyJMenu2();
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == fact){
            new MyDialog(this, "Factorial");
        }
        if (ae.getSource() == exit){
            System.exit(0);
        }
    }
}
class MyDialog extends JDialog implements ActionListener {
    JTextField tf1, tf2;
    JLabel lb1, lb2;
    JButton bt1, bt2, bt3;

    MyDialog(Frame fr, String st){
        super(fr, st, false);
        setSize(320, 290);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        lb1 = new JLabel("Input n : ");
        lb2 = new JLabel("Answer : ");
        bt1 = new JButton("Compute");
        bt2 = new JButton("CLEAR");
        bt3 = new JButton("CLOSE");
        add(lb1); add(tf1);
        add(bt1); add(bt2); add(bt3);
        add(lb2); add(tf2);

        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                setVisible(false);
            }
        });
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        long fact = 1;
        int n = 0;
        if (ae.getSource() == bt1){
            n = Integer.parseInt(tf1.getText());
            for (int i=1; i<=n; i++)
                fact = fact * i;
            tf2.setText("" + fact);
        }
        if (ae.getSource() == bt2){
            tf1.setText("");
            tf2.setText("");
        }
        if (ae.getSource() == bt3){
            setVisible(false);
        }
    }
}