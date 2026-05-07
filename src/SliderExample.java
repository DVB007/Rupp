import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Box;
import javax.swing.event.*;
import javax.swing.border.*;

class SliderExample extends JPanel{
    static JFrame myFrame;

    JLabel slider5Value;

    public SliderExample() {
        Box horizBox = Box.createHorizontalBox();
        JSlider slider1 = new JSlider(JSlider.VERTICAL,0,50,25);
        slider1.setPaintTicks(true);
        slider1.setMajorTickSpacing(10);
        slider1.setMinorTickSpacing(2);
        slider1.setSnapToTicks(true);

        horizBox.add(slider1);
        horizBox.add(horizBox.createHorizontalStrut(15));

        JSlider slider2 = new JSlider (JSlider.VERTICAL, 0,50,25);
        slider2.setPaintTicks(true);
        slider2.setMinorTickSpacing(5);

        horizBox.add(slider2);
        horizBox.add(horizBox.createHorizontalStrut(15));

        JSlider slider3 = new JSlider (JSlider.VERTICAL, 0,50,25);
        slider3.setPaintTicks(true);
        slider3.setMajorTickSpacing(10);

        horizBox.add(slider3);
        horizBox.add(horizBox.createHorizontalStrut(15));

        JSlider slider4 = new JSlider(JSlider.VERTICAL, 0,50,25);
        slider4.setBorder(LineBorder.createBlackLineBorder());

        horizBox.add(slider4);
        horizBox.add(horizBox.createHorizontalStrut(15));

        JSlider slider5 = new JSlider(JSlider.VERTICAL,0,50,25);
        slider5.setBorder(LineBorder.createBlackLineBorder());
        slider5.setMajorTickSpacing(10);
        slider5.setPaintLabels(true);

        horizBox.add(slider5);
        horizBox.add(horizBox.createHorizontalStrut(15));

        slider5Value = new JLabel("Slider5 value = 25");
        horizBox.add(slider5Value);
        slider5.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent event){
                slider5Value.setText("Slider5 value = "
                        +((JSlider)event.getSource()).getValue());
            }
        });
        setLayout(new BorderLayout());
        add(horizBox,"Center");
    }
    public static void main(String[] args){
        myFrame = new JFrame("Slider Example");
        SliderExample app = new SliderExample();
        myFrame.add("Center",app);
        myFrame.setBounds(100, 100, 350,300);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}