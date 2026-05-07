import javax.swing.*;
import java.awt.event.*;

class JTabbedPaneDemo extends JFrame {

    JTabbedPaneDemo() {
        super("Swing JTabbedPane Demo");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities", new CitiesPanel());
        jtp.addTab("Colors", new ColorsPanel());
        jtp.addTab("Flavors", new FlavorsPanel());
        add(jtp);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new JTabbedPaneDemo();
    }
}
class CitiesPanel extends JPanel implements ActionListener {
    JButton b1, b2, b3, b4;

    public CitiesPanel(){
        b1 = new JButton("New York");
        add(b1);
        b2 = new JButton("London");
        add(b2);
        b3 = new JButton("Hong Kong");
        add(b3);
        b4 = new JButton("Tokyo");
        add(b4);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
            System.exit(0);
        }
    }
}
class ColorsPanel extends JPanel {
    public ColorsPanel() {
        JCheckBox cb1 = new JCheckBox("Red");
        add(cb1);
        JCheckBox cb2 = new JCheckBox("Green");
        add(cb2);
        JCheckBox cb3 = new JCheckBox("Blue");
        add(cb3);
    }
}
class FlavorsPanel extends JPanel {
    public FlavorsPanel() {
        JComboBox jcb = new JComboBox();
        jcb.addItem("Vanilla");
        jcb.addItem("Chocolate");
        jcb.addItem("Strawberry");
        add(jcb);
    }
}