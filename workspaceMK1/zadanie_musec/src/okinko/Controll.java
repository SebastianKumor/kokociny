package okinko;

import java.awt.*;
import java.awt.event.*;
import java.io.OutputStream;

import javax.swing.*;

import javaModel.*;

public class Controll extends HlavneOkno implements Objekty { // logicka cast
																// GUI

	public static void bProjektN() { //
		HlavneOkno projN = new HlavneOkno();

		projN.setVisible(false);
		if (Suciastky.getPocet() != 0) {
			System.out.println("Dokoncite projektovanie");
		} else {
			System.out.println("Dokoncite projektovanie");
			System.out.println("Zadajte pocet suciastok");
		}
	}

	public static void bProjektD() {
		HlavneOkno projD = new HlavneOkno();
		if (Suciastky.getPocet() != 0) {
			stav.setSchvalene(true);
			projD.setVisible(false);
			System.out.println("Stav sa zmenil");
		} else {
			System.out.println("Zadajte pocet suciastok");// ukazovat aktualny
									// stav dakde
		}
	}

	public static void bKontrolaN() {
		HlavneOkno kontrN = new HlavneOkno();

		if (!stav.getSchvalene()) {
			//kontrN.setVisible(false);
			System.out.println("Projektovanie je nedokoncene");
		} else {
			//kontrN.setVisible(false);
			System.out.println("Skontrolujte novu verziu");
		}
		kontrN.setVisible(false);
	}

	public static void bKontrolaP() {
		HlavneOkno kontrP = new HlavneOkno();

		if (!stav.getSchvalene()) {
			kontrP.setVisible(false);
			System.out.println("Projektovanie je nedokoncene");
		} else {
			stav2.setUspesnaKontrola(true);
			kontrP.setVisible(false);
			System.out.println("Stav 2 sa zmenil");
		}
	}

	public static void bRzacala() {
		HlavneOkno realN = new HlavneOkno();

		if (!stav.getSchvalene()) {
			realN.setVisible(false);
			System.out.println("Projektovanie je nedokoncene");
		}
		if (!stav2.getUspesnaKontrola()) {
			System.out.println("Neuspesna Kontrola");
			realN.setVisible(false);
		} else {
			System.out.println("Dokoncite Realizaciu");
			realN.setVisible(false);
		}
	}

	public static void bRskoncila() {
		HlavneOkno realD = new HlavneOkno();

		if (!stav.getSchvalene()) {
			realD.setVisible(false);
			System.out.println("Projektovanie je nedokoncene");
		}
		if (!stav2.getUspesnaKontrola()) {
			System.out.println("Neuspesna Kontrola");
			realD.setVisible(false);
		} else {
			stav3.setRealizacia(true);
			realD.setVisible(false);
			System.out.println("Stav 3 sa zmenil");
		}
	}

	public static void bPrevadzkaN() {
		HlavneOkno prevN = new HlavneOkno();

		if (!stav.getSchvalene()) {
			prevN.setVisible(false);
			System.out.println("Projektovanie je nedokoncene");
		}
		if (!stav2.getUspesnaKontrola()) {
			System.out.println("Neuspesna Kontrola");
			prevN.setVisible(false);
		}
		if (!stav3.getRealizacia()) {
			System.out.println("Dokoncite realizaciu");
			prevN.setVisible(false);
		} else {
			System.out.println("Uvedte projekt do prevazky");
			prevN.setVisible(false);
		}

	}

	public static void bPrevadzkaD() {
		HlavneOkno prevD = new HlavneOkno();

		if (!stav.getSchvalene()) {
			prevD.setVisible(false);
			System.out.println("Projektovanie je nedokoncene");
		}
		if (!stav2.getUspesnaKontrola()) {
			System.out.println("Neuspesna Kontrola");
			prevD.setVisible(false);
		}
		if (!stav3.getRealizacia()) {
			System.out.println("Dokoncite realizaciu");
			prevD.setVisible(false);
		} else {
			stav4.setHotovyProjekt(true);
			prevD.setVisible(false);
			System.out.println("Stav 4 sa zmenil");
			// konzola.setText("Projekt bol dokonceny");
		}
	}

	public static void ratajSuc(String text) {
		int Integris = Integer.parseInt(text);
		pocetSuciastok.setPocet(Integris);
	}
}
