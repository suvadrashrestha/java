package Gui;

import javax.swing.*;
import java.awt.FlowLayout;

public class JLabelDemo {
    public JLabelDemo(){
    // set up the jframe
    JFrame jfrm= new JFrame("JLabelDemo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(360, 210);
    //create an icon
    ImageIcon ii= new ImageIcon("hourglass.png");
    //create a label;
    JLabel jl= new JLabel("Hour glass",ii,JLabel.CENTER);
    //add the label to the content pane
    jfrm.add(jl);
    //display the frame
    jfrm.setVisible(true);
    }
public static void main(String[] args) {
    // create the frame on the event dispatching thread
    SwingUtilities.invokeLater(new Runnable() {
        public void run(){
            new JLabelDemo();
        }
    });
}

}
