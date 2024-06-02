package Gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonDemo implements ActionListener {
    JLabel jlab;

    public JButtonDemo() {
        // setup the frame
        JFrame jfrm = new JFrame("JButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(500, 450);
        // add button to content pane
        ImageIcon hourglass = new ImageIcon("hourglass.png");
        JButton jb = new JButton(hourglass);
        jb.setActionCommand("Hourglass");
        jb.addActionListener(this);
        jfrm.add(jb);
        ImageIcon analog = new ImageIcon("analog.jpg");
        jb = new JButton(analog);
        jb.setActionCommand("Analog Clock");
        jb.addActionListener(this);
        jfrm.add(jb);
        ImageIcon digital = new ImageIcon("digital.jpg");
        jb = new JButton(digital);
        jb.setActionCommand("Digital Clock");
        jb.addActionListener(this);
        jfrm.add(jb);
        ImageIcon stopwatch = new ImageIcon("stopwatch.png");
        jb = new JButton(stopwatch);
        jb.setActionCommand("Stopwatch Clock");
        jb.addActionListener(this);
        jfrm.add(jb);

        // create and add the label to content paene
        jlab = new JLabel("Choose a timepiece");
        jfrm.add(jlab);
        //display the frame
        jfrm.setVisible(true);
    }
        // handle button events 
        public void actionPerformed(ActionEvent ae){
            jlab.setText("You selected"+ae.getActionCommand());
        }
        public static void main(String[] args) {
            // create the frame on the event dispatching thread

            SwingUtilities.invokeLater(new Runnable() {
                public void run(){
                    new JButtonDemo();
                }
            });


        }

       

}


