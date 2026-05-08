import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ប្តូរពី Frame មក JFrame
class MyMenu extends JFrame implements ActionListener {
    JMenuBar mbar;
    JMenu file, edit, comp;
    JMenuItem open, close, exit;
    JMenuItem copy, cut, paste;
    JMenuItem fib, fact, sumofseries, qequation;

    MyMenu() {
        // កំណត់ចំណងជើងបង្អួច
        super("Swing Menu Demo");
        setSize(400, 380);
        setLayout(new FlowLayout());

        // បិទកម្មវិធីទាំងស្រុងពេលចុចប៊ូតុង X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // បង្កើត MenuBar
        mbar = new JMenuBar();

        // បង្កើត JMenu
        file = new JMenu("File");
        edit = new JMenu("Edit");
        comp = new JMenu("Compute");

        // បន្ថែម Item ទៅក្នុង File
        file.add(open = new JMenuItem("Open"));
        file.add(close = new JMenuItem("Close"));
        file.addSeparator(); // បន្ទាត់ខណ្ឌ
        file.add(exit = new JMenuItem("Exit"));

        // បន្ថែម Item ទៅក្នុង Edit
        edit.add(copy = new JMenuItem("Copy"));
        edit.add(cut = new JMenuItem("Cut"));
        edit.addSeparator();
        edit.add(paste = new JMenuItem("Paste"));

        // បន្ថែម Item ទៅក្នុង Compute
        comp.add(fib = new JMenuItem("Fibonacci"));
        comp.add(fact = new JMenuItem("Factorial"));
        comp.add(sumofseries = new JMenuItem("Sum of Series number"));
        comp.add(qequation = new JMenuItem("Quadratic Equation"));

        // ដាក់ Menu ចូលក្នុង MenuBar
        mbar.add(file);
        mbar.add(edit);
        mbar.add(comp);

        // កំណត់ MenuBar ទៅក្នុង Frame
        setJMenuBar(mbar);

        // ចាប់យកព្រឹត្តិការណ៍ (Event)
        exit.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        // ប្រើ SwingUtilities ដើម្បីដំណើរការ GUI ឲ្យមានសុវត្ថិភាព
        SwingUtilities.invokeLater(MyMenu::new);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0);
        }
    }
}
