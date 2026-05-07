import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SplitPaneTest {
    public static void main(String args[]) {
        JFrame frame = new JFrame("JSplitPane");
        JButton b1 = new JButton("One");
        JButton b2 = new JButton("Two");
        JSplitPane jsp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, b1, b2);
        b1 = new JButton("Three");
        b2 = new JButton("Four");
        JSplitPane jsp2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, false, b1, b2);
        JSplitPane jsp3 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, jsp1, jsp2);
        jsp3.setOneTouchExpandable(true);
        frame.add(jsp3, BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}