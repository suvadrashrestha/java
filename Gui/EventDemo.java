package Gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EventDemo {
    JLabel jlab;
    EventDemo(){
        // create a new JFrame container
        JFrame jfrm= new JFrame("An event Example");
        // specify flowlayout for the layout member
        jfrm.setLayout(new FlowLayout());
        // give the frame an initial size
        jfrm.setSize(220,90);
        // terminate the program when the user closes application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make two buttons

        JButton jbtAlpha= new JButton("Alpha");
        JButton jbtBeta= new JButton("Beta");
        //add action listener for alpha
        jbtAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                jlab.setText("Alpha was pressed");
            }
        });

        //add action listener for beta
        jbtBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                jlab.setText("Beta was pressed");
            }
        });

        jfrm.add(jbtAlpha);
        jfrm.add(jbtBeta);
        jlab = new JLabel("press a button ");
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                 new EventDemo();
            }
        });
    }
    
}
