package rozhranie;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Prevadzka extends JFrame {
	private JButton neuspech = new JButton("Projekt este nebol uvedeny do prevadzky");
	private JButton zapojeny = new JButton("Projekt bol uvedeny do prevadzky");
	
public Prevadzka () {
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Najsamlepsi Gui evah");

	add(neuspech);
	add(zapojeny);

	pack();

	neuspech.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {	
			System.out.println("Tlacitko 1 ide");
			;
		}
	});
	
	zapojeny.addActionListener(new ActionListener() {
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
