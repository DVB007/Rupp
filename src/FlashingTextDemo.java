import javax.swing.*;

class FlashingTextDemo extends JFrame implements Runnable {
    JLabel jlblText = new JLabel("Move!", JLabel.CENTER);

    FlashingTextDemo(){
        super("Multithreaded Program");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jlblText);

        setVisible(true);
        new Thread(this).start();
    }
    public void run() {
        try {
            while (true) {
                if (jlblText.getText() == null)
                    jlblText.setText("Stop!");
                else
                    jlblText.setText(null);
                Thread.sleep(300);
            }
        } catch (InterruptedException ex) { }
    }
    public static void main(String[] args){
        new FlashingTextDemo();
    }
}