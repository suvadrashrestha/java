package Gui;
import javax.swing.*;
public class SwingDemo {
    SwingDemo(){
        // create  new jframe container
        JFrame jfrm= new JFrame("A Simple Swing Application");
        // give the frame an initial size;
        jfrm.setSize(275,100);
        // terminate the program when the user closes the application;
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create a text-based label
        JLabel jlab= new JLabel("Swing means powerful Guis");
        // add label to the content panel
        jfrm.add(jlab);
        // display the frame
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run (){
                new SwingDemo();
            }
        });
    }
    
}
