import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SpinnerDemo {
    public static void main(String[] args) {

        JFrame jf = new JFrame("It Spins");
        jf.setLayout(new FlowLayout());

        // Create a JSpinner using one of the pre-defined 
        JSpinner dates = new JSpinner(new SpinnerDateModel( ));
        jf.add(dates);

        // Create a JSPinner using a SpinnerListModel. 
        String[] data = { "One", "Two", "Three" };
        JSpinner js = new JSpinner(new SpinnerListModel(data));
        jf.add(js);

        jf.setBounds(100, 100, 450, 380);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}