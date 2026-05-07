import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComboBoxDemo2 extends JFrame implements ItemListener {
    JLabel jl;
    ImageIcon france, germany, italy, japan;

    JComboBoxDemo2() {
        super("JComboBox Demo");
        setSize(400, 350);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a combo box and add it
        // to the panel
        JComboBox jc = new JComboBox();
        jc.addItem("US");
        jc.addItem("France2");
        jc.addItem("Germany");
        jc.addItem("Italy");
        jc.addItem("Japan");
        jc.addItemListener(this);
        add(jc);

      /*
        Vector v = new Vector();
        v.addElement("US");
        v.addElement("France");
        v.addElement("Germany");
        v.addElement("Italy");
        v.addElement("Japan");
        JComboBox jc = new JComboBox(v);
        add(jc);
      */

        // Create label
        jl = new JLabel(new ImageIcon("src/owl.png"));
        add(jl);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie) {
        String s = (String)ie.getItem();
        jl.setIcon(new ImageIcon(s + ".gif"));
    }
    public static void main(String args[]){
        new JComboBoxDemo2();
    }
}