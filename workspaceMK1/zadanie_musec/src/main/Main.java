package main;

import java.awt.EventQueue;
import okinko.*;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				HlavneOkno guic = new HlavneOkno();
				guic.frame.setVisible(true);
			}
		});
	}
}
