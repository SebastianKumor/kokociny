package rozhranie;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Projektant extends JFrame {
	private JButton projektujem = new JButton("Projektujem");
	private JButton photovy = new JButton("Projekt Hotovy");
	
public Projektant () {
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Najsamlepsi Gui evah");

	add(photovy);
	add(projektujem);

	pack();

	projektujem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {	
			System.out.println("Tlacitko 1 ide");
			;
		}
	});
	
	photovy.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {	
			System.out.println("Tlacitko 2 ide");
			;
		}
	});
}
/*
public static void Projektant () {
	EventQueue.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			Projektant ex = new Projektant();
			ex.setVisible(true);
		}
	});
	
}
*/
}