package rozhranie;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Kontrolor extends JFrame {
	private JButton kontrolaN = new JButton("Projekt kontrolou nepresiel");
	private JButton kontrolaA = new JButton("Projekt kontrolou presiel");
	
public Kontrolor () {
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Najsamlepsi Gui evah");

	add(kontrolaN);
	add(kontrolaA);

	pack();

	kontrolaN.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {	
			System.out.println("Tlacitko 1 ide");
			;
		}
	});
	
	kontrolaA.addActionListener(new ActionListener() {
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
