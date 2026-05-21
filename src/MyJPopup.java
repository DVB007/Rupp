// Demonstrates the Swing pop-up menus

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJPopup extends JFrame {

    JPopupMenu popupMenu;
    JMenuItem saveItem, cutItem, copyItem, pasteItem, helpItem;
    JTextArea textArea;

    MyJPopup(){
        super("Swing JPopup Menu Demo");
        setSize(550, 300);

        // 1. For frame closing.
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        // 2. Create and add the text area to the frame.
        textArea = new JTextArea("Click the mouse right button inside "
                + "\nthe frame.");
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 24));
        add(textArea);

        // 3. Create a pop-up menu.
        popupMenu = new JPopupMenu("Test Popup Menu");

        // 4. Create menu items and add them to the pop-up menu.
        // Also add some separators as shown in the code.
        saveItem = new JMenuItem("Save");
        popupMenu.add(saveItem);
        popupMenu.addSeparator();
        cutItem = new JMenuItem("Cut");
        popupMenu.add(cutItem);

        copyItem = new JMenuItem("Copy");
        popupMenu.add(copyItem);

        pasteItem = new JMenuItem("Paste");
        popupMenu.add(pasteItem);
        popupMenu.addSeparator();
        helpItem = new JMenuItem("Help");
        popupMenu.add(helpItem);

        // 5. Add the mouse listener to the content pane.
        PopupMenuListener pml = new PopupMenuListener();
        textArea.addMouseListener(pml);
        setVisible(true);
    }
    // 6. Mouse listener class.
    class PopupMenuListener extends MouseAdapter {
        public void mousePressed(MouseEvent me){
            showPopup(me);
        }
        public void mouseReleased(MouseEvent me){
            showPopup(me);
        }
        private void showPopup(MouseEvent me){
            if (me.isPopupTrigger()){
                popupMenu.show(me.getComponent(),me.getX(),me.getY());
            }
        }
    }
    // 7. The main method
    public static void main(String[] args){
        new MyJPopup();
    }
}