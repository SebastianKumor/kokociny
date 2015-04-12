package rozhranie;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Realizacia extends JFrame {
	private JButton zacala = new JButton("Realizacia Prebieha");
	private JButton hotovo = new JButton("Projekt je zrealizovany");
	
public Realizacia () {
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Najsamlepsi Gui evah");

	add(zacala);
	add(hotovo);

	pack();

	zacala.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {	
			System.out.println("Tlacitko 1 ide");
			;
		}
	});
	
	hotovo.addActionListener(new ActionListener() {
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
