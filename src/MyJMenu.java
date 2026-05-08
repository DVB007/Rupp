// Demonstrates the Swing menus, submenus and menu items

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class MyJMenu extends JFrame implements ActionListener{
    JMenuItem whatIsNewMI;

    MyJMenu(){
        super("Swing JMenu Demo");
        setSize(450, 390);

        // 2. Add a menu bar to the JFrame.
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new BevelBorder(BevelBorder.RAISED));
        menuBar.setBorderPainted(true);
        add(menuBar, BorderLayout.NORTH);

        // 3. Add the File menu and its menu items
        JMenu fileMenu = new JMenu("File", true);
        menuBar.add(fileMenu);

        // 4. Add the submenus to the File menu
        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JMenuItem("Save As"));
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem("Exit"));

        // 5. Add the Edit menu and its menu items.
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);

        // 6. Add the submenus to the edit menu.
        editMenu.add(new JMenuItem("Undo"));
        editMenu.addSeparator();
        editMenu.add(new JMenuItem("Cut"));
        editMenu.add(new JMenuItem("Copy"));
        editMenu.add(new JMenuItem("Paste"));

        // 7. Create and add the Options menu and submenus
        // and their items.
        JMenu optionsMenu = new JMenu("Options");
        menuBar.add(optionsMenu);

        // 8. Add the submenus to the Options menu.
        JMenu bookMarksMenu = new JMenu("Book Marks");
        optionsMenu.add(bookMarksMenu);

        // 9. Add the submenus to the bookmark menu.
        JMenuItem addMI = new JMenuItem("Add Alt-K");
        bookMarksMenu.add(addMI);
        JMenuItem editMI = new JMenuItem("Edit Alt-B");
        bookMarksMenu.add(editMI);
        JMenu guideMenu = new JMenu("Guide");
        bookMarksMenu.add(guideMenu);

        // 10. Add the submenus to the Guide menu.
        whatIsNewMI = new JMenuItem("What's New");
        whatIsNewMI.setMnemonic('N');
        guideMenu.add(whatIsNewMI);
        JMenuItem whatIsCoolMI = new JMenuItem("What's Cool");
        whatIsCoolMI.setMnemonic('C');
        guideMenu.add(whatIsCoolMI);

        // 11. Finally, add two more submenus to the Options menu.
        JMenuItem javaConsoleMI = new JMenuItem("Java Console");
        optionsMenu.add(javaConsoleMI);
        JMenuItem addressBookMI = new JMenuItem("Address Book");
        optionsMenu.add(addressBookMI);
        setVisible(true);
        whatIsNewMI.addActionListener(this);
    }
    public static void main(String[] args){
        new MyJMenu();
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == whatIsNewMI){
            JFrame fr = new JFrame("My Frame");
            fr.setSize(300, 250);
            JButton bt = new JButton("CLOSE");
            fr.setLayout(new FlowLayout());
            fr.add(bt);
            fr.setLocationRelativeTo(null);
            bt.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    fr.setVisible(false);
                }
            });
            fr.setVisible(true);
        }
    }
}