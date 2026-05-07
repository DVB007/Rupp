import javax.swing.*;
import java.awt.*;

class HelloFrame extends JFrame {
    public static void main(String[] args) {
        new HelloFrame();
    }
    HelloFrame()  {
        //setSize(200, 100);
        setTitle("Hello World!");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        //int x = d.width/2-(this.getWidth()/2);
        //int y = d.height/2-(this.getHeight()/2);

        //setLocation(x, y);
        int x = d.width;
        int y = d.height;
        setSize(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setLocationRelativeTo(null);
        setVisible(true);
    }
}