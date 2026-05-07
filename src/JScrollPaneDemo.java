import java.awt.*;
import javax.swing.*;

class JScrollPaneDemo extends JFrame {

    JScrollPaneDemo(){
        super("Swing JScroll Pane Demo");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Add 400 buttons to a panel
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20, 20));
        int b = 0;
        for(int i = 0; i < 20; i++)
            for(int j = 0; j < 20; j++){
                jp.add(new JButton("Button " + b));
                ++b;
            }

        // Add panel to a scroll pane
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(jp, v, h);

        // Add scroll pane to the frame
        add(jsp, BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main(String args[]){
        new JScrollPaneDemo();
    }
}