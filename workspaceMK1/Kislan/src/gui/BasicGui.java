 package gui;
import main.Hodnoty;
import main.simulacia;
import senzors.Senzor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Basic GUI.
 *
 * creates textareas for listing the changes
 * buttons for human interaction
 * @author      Matus Kislan
 *
 */
public class BasicGui extends JFrame {

    private JTextArea textArea;
    private JTextArea vypis;

    /**
     *
     * @param  sim object of class simulacia
     *           needed for executing methods
     *
     * @param  pole arraylist of sensors
     *
     * @param  hodnota object of class Hodnoty
     *                 need for values and methods of that class
     *
     */
    public BasicGui(final simulacia sim, final ArrayList<Senzor> pole,final Hodnoty hodnota){

        setSize(1000,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Nautilus System Report");

        textArea = new JTextArea(20, 50);
        vypis = new JTextArea(20,20);
        JPanel top_panel = new JPanel();
        JPanel bot_panel = new JPanel();
        vypis.setEditable(false);
        textArea.setEditable(false);

        setLayout(new BorderLayout());
        top_panel.setPreferredSize(new Dimension(1000,500));
        top_panel.setLayout(new GridLayout(1, 2));

        add(top_panel,BorderLayout.NORTH);
        add(bot_panel,BorderLayout.SOUTH);

        top_panel.add(new JScrollPane(textArea));
        top_panel.add(new JScrollPane(vypis));

        bot_panel.setPreferredSize(new Dimension(1000, 50));
        bot_panel.setLayout(new GridLayout(0, 2));

        final JButton button = new JButton("Repair submarine");
        final JButton button1 = new JButton("Repair all sensors");

        bot_panel.add(button);
        bot_panel.add(button1);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sim.button_repairsub(hodnota);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                message("Submarine repaired");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sim.button_repairsensors(pole);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                message("All sensors repaired");

            }
        });
        validate();

    }


    /**
     *  method which writes about simulation of submarine
     *
     *  @param smak
     *      string value , which contains message what happened
     */
   public void setappend(String smak){

          textArea.append(smak);
    }
    /**
     *  method which writes status of submarine
     *
     *  @param smak
     *      string value , which contains status + sensors + alarm caused
     */
   public void setText(String smak){

        vypis.setText(smak);
    }

    /**
     *  method which will write at the end of simulation
     */
   public void end(){
        textArea.setFont(new Font("monospaced",Font.BOLD,24));
        textArea.setText("Submarine exploded!!!");
    }
    /**
     *  method which creates dialog window
     *
     *  @param smak
     *      string value , which contains message to be shown
     */
    public void message(String smak){

        JOptionPane.showMessageDialog(frame, smak);

    }Component frame;



}