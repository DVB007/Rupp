// Demonstrates the Swing menu bar and menus

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class MyJMenuBar extends JFrame {

    MyJMenuBar(){
        super("Swing JMenuBar Demo");
        setSize(450, 390);
        // Create a menu bar with bevel border and
        // add it to the frame.
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new BevelBorder(BevelBorder.RAISED));
        add(menuBar, BorderLayout.NORTH);

        // Create menus for a simple editor
        JMenu fileMenu = new JMenu("File", true);
        JMenu editMenu = new JMenu("Edit");
        JMenu formatMenu = new JMenu("Format");
        JMenu optionsMenu = new JMenu("Options");

        // Add the menus to the menu bar.
        menuBar.add(fileMenu);
        fileMenu.add("Open");
        fileMenu.add("Close");
        fileMenu.addSeparator();
        fileMenu.add("Exit");
        menuBar.add(editMenu);
        editMenu.add("Copy");
        editMenu.add("Cut");
        editMenu.add("Paste");
        menuBar.add(formatMenu);
        formatMenu.add("Bold");
        formatMenu.add("Italic");
        formatMenu.add("Underline");
        menuBar.add(optionsMenu);

        // Get the handle on each menu to the normal and
        // selected icons and the mnemonic (short-cut) key.
        for (int i=0; i< menuBar.getMenuCount(); i++){
            JMenu menu = menuBar.getMenu(i);   // returns the menu
            menu.setIcon(new ImageIcon("red.gif"));

            // Set mnemonic key.
            String text = menu.getText();   // gets the menu label
            menu.setMnemonic(text.charAt(0));  // at first char
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new MyJMenuBar();
    }
}