import javax.swing.*;
import java.awt.*;

class HelloJFrame2 extends JFrame {

    // HelloFrame constructor
    HelloJFrame2(){
        setTitle("Hello, World!");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Hello, World!");
        panel1.add(label1);
        label1.setToolTipText("This is a label");

        // Create an icon
        ImageIcon ii = new ImageIcon("src/owl.png");

        Image image = ii.getImage();
        Image newImg = image.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH);

        ii = new ImageIcon(newImg);
        // Create a label
        JLabel jl = new JLabel("The United States", ii, JLabel.CENTER);
        jl.setToolTipText("Of America");
        panel1.add(jl);
        add(panel1);
        setVisible(true);
    }
    public static void main(String[] args){
        new HelloJFrame2();
    }
}