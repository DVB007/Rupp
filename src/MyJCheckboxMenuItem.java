// Demonstrates the checkbox menu items
// and radio button menu items

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class MyJCheckboxMenuItem extends JFrame {

    MyJCheckboxMenuItem(){
        // 1. Set title and set size for frame
        super("Swing JCheckBox Menu Demo");
        setSize(450, 390);

        // 2. Add a menu bar and add it to the applet.
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new BevelBorder(BevelBorder.RAISED));
        // menuBar.setBorderPainted(true);
        add(menuBar, BorderLayout.NORTH);

        // 3. Create and add the File menu and its menu items
        JMenu fileMenu = new JMenu("File", true);
        menuBar.add(fileMenu);

        // 4. Create the Edit menu and its menu items.
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);

        // 5. Create the Options menu, submenus, and their items.
        JMenu optionsMenu = new JMenu("Options");
        menuBar.add(optionsMenu);

        // 6. Create and add the Fonts options menu to
        // the Options menu.
        JMenu fontsOptionsMenu = new JMenu("Fonts");
        optionsMenu.add(fontsOptionsMenu);

        // 7. Create radio button menu items and add them
        // to the Fonts option menu.
        JRadioButtonMenuItem rbItem;
        ButtonGroup group = new ButtonGroup();
        String[] rbLabels = {"Dialog", "Monospaced", "SansSerif"};
        for (String rbLabel : rbLabels) {
            rbItem = new JRadioButtonMenuItem(rbLabel);
            fontsOptionsMenu.add(rbItem);
            group.add(rbItem);
        }
        // 8. Create and add the Others options menu to the
        // Options menu.
        JMenu advancedOptionsMenu = new JMenu("Others");
        optionsMenu.add(advancedOptionsMenu);

        // 9. Create and add the checkbox menu items to the
        // Others options menu.
        JCheckBoxMenuItem cbItem;
        String[] cbLabels = { "Load Images", "Enable Java", "Enable JavaScript"};

        for (String cbLabel : cbLabels) {
            cbItem = new JCheckBoxMenuItem(cbLabel);
            advancedOptionsMenu.add(cbItem);
        }
        setVisible(true);
    }
    public static void main(String[] args){
        new MyJCheckboxMenuItem();
    }
}