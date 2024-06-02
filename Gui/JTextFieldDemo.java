package Gui;

//demonstrate JTextField
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldDemo {
    public JTextFieldDemo() {
        // steup the jFrame
        JFrame jfrm = new JFrame("JTextFieldDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(260, 120);
        // add a text field to content pane
        JTextField jtf = new JTextField(15);
        jfrm.add(jtf);
        // add a label
        JLabel jlab = new JLabel();
        jfrm.add(jlab);
        // handle action events

        jtf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // show text when user presses Enter.
                jlab.setText(jtf.getText());

            }

        });
     // displat the frame
     jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                 new JTextFieldDemo();
            }
        });
    }
}
