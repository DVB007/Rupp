// Demonstrates the Swing toolbars

import javax.swing.*;
import java.awt.*;

class MyJToolBar extends JFrame {

    // 1. Create some icons for buttons.
    Icon newIcon = new ImageIcon("new.gif");
    Icon openIcon = new ImageIcon("open.gif");
    Icon saveIcon = new ImageIcon("save.gif");
    Icon cutIcon = new ImageIcon("cut.gif");
    Icon copyIcon = new ImageIcon("copy.gif");
    Icon pasteIcon = new ImageIcon("paste.gif");

    MyJToolBar(){
        super("Swing JToolBar Demo");
        setSize(550, 400);

        // 2. Create a toolbar object.
        JToolBar toolBar = new JToolBar();

        // 3. Set the margin between toolbar border and its comps.
        toolBar.setMargin(new Insets(5, 5, 5, 5));

        // 4. Create some toolbar buttons.
        JButton button1 = new JButton(newIcon);
        JButton button2 = new JButton(openIcon);
        JButton button3 = new JButton(saveIcon);
        JButton button4 = new JButton(cutIcon);
        JButton button5 = new JButton(copyIcon);
        JButton button6 = new JButton(pasteIcon);

        button1.setToolTipText("New");
        button2.setToolTipText("Open");
        button3.setToolTipText("Save");
        button4.setToolTipText("Cut");
        button5.setToolTipText("Copy");
        button6.setToolTipText("Paste");
        // 5. Add the buttons to the toolbar with separators.
        toolBar.add(button1);
        toolBar.add(button2);
        toolBar.addSeparator();
        toolBar.add(button3);
        toolBar.addSeparator();
        toolBar.addSeparator();
        toolBar.add(button4);
        toolBar.add(button5);
        toolBar.addSeparator();
        toolBar.add(button6);

        // 6. Make a panel with a label
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Pure JFC", JLabel.CENTER);
        label.setPreferredSize(new Dimension(350, 100));
        label.setBackground(Color.white);
        label.setFont(new Font("Dialog", Font.PLAIN, 40));
        label.setOpaque(true);
        panel.add(label);

        // 7. Add these components to the frame.
        add(toolBar, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main(String[] args){
        new MyJToolBar();
    }
}