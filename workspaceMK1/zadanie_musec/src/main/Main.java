package main;

import gui.*;

import java.awt.EventQueue;
/** trieda obsahujuca metodu main
 * @author Matus Mucha */

public class Main { //Main 
	/** Metoda Main vola GUI
	 * @param args metoda main*/

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				HlavneOkno guic = new HlavneOkno(); // vola gui
				guic.frame.setVisible(true);
			}
		});
	}
}