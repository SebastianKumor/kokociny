
package gui;

import java.awt.*;
import java.awt.event.*;
import java.io.OutputStream;

import javax.swing.*;

import javaModel.*;
/** Trieda obsahuje logiku potrebnu na funkciu gui 
 * @author Matus Mucha*/	
public class Controll extends HlavneOkno implements Objekty { // logicka cast gui
									

	/** vypisuje varovanie ze ma byt projektovanie dokoncene pripadne hadze vynimku pri zabudnuti zadania vstupu */
	public static void bProjektN() { 
		
		if (Suciastky.getPocet() != 0) {
			System.out.println("Dokoncite projektovanie");
		} else {
			throw new IllegalArgumentException("Nezadali ste pocet suciastok");  // vynimka v pripade ze nieje zadany pocet suciastok
		}
	}

	/** pri splnenych podmienkach meni prvy stav, pripadne hadze vynimku pri zabudnuti zadania vstupu */
	public static void bProjektD() {
		
		if (Suciastky.getPocet() != 0) {
			stav.setSchvalene(true);
			System.out.println("Projektovanie bolo dokoncene, moze sa zacat dalsia faza zostavovania");
		} else {
			throw new IllegalArgumentException("Nezadali ste pocet suciastok");  // vynimka v pripade ze nieje zadany pocet suciastok
		}
	}
	
	/** pri splneni podmienok vypisuje varovanie nedokocenia predchadzajucej prace pripadne varuje nech dokoncite svoju pracu*/
	public static void bKontrolaN() {

		if (!stav.getSchvalene()) {
			System.out.println("Projektovanie je nedokoncene");
		} else {
			System.out.println("Skontrolujte novu verziu");
		}
	}

	/** pri splneni podmienok vypisuje varovanie nedokoncenia projektovania alebo meni druhy stav na dokonceny*/
	public static void bKontrolaP() {

		if (!stav.getSchvalene()) {
			System.out.println("Projektovanie je nedokoncene");
		} else {
			stav2.setUspesnaKontrola(true);
			System.out.println("Kontrola prebehla uspesne, moze sa zacat dalsia faza zostavovania");
		}
	}
	
	/** pri splneni podmienok vypisuje varovanie ze nieje dokoncena predchadzajuca alebo aktualna cinnost*/
	public static void bRzacala() {

		if (!stav.getSchvalene()) {
			System.out.println("Projektovanie je nedokoncene");
		}
		if (!stav2.getUspesnaKontrola()) {
			System.out.println("Neuspesna Kontrola");
		} else {
			System.out.println("Dokoncite Realizaciu");
		}
	}

	/** pri splneni podmienok vypisuje varovanie ze nieje dokoncena predchadzajuca alebo sa smeni treti stav na splneny*/
	public static void bRskoncila() {

		if (!stav.getSchvalene()) {
			System.out.println("Projektovanie je nedokoncene");
		}
		if (!stav2.getUspesnaKontrola()) {
			System.out.println("Neuspesna Kontrola");
		} else {
			stav3.setRealizacia(true);
			System.out.println("Realizacia bola dokoncena, moze sa zacat dalsia faza zostavovania");
		}
	}

	/** pri splneni podmienok vypisuje varovanie ze nieje dokoncena predchadzajuca alebo aktualna cinnost*/
	public static void bPrevadzkaN() {

		if (!stav.getSchvalene()) {
			System.out.println("Projektovanie je nedokoncene");
		}
		if (!stav2.getUspesnaKontrola()) {
			System.out.println("Neuspesna Kontrola");
		}
		if (!stav3.getRealizacia()) {
			System.out.println("Dokoncite realizaciu");
		} else {
			System.out.println("Uvedte projekt do prevazky");
		}

	}
	/** pri splneni podmienok vypisuje varovanie ze nieje dokoncena predchadzajuca alebo sa smeni stvry stav na splneny*/
	public static void bPrevadzkaD() {

		if (!stav.getSchvalene()) {
			System.out.println("Projektovanie je nedokoncene");
		}
		if (!stav2.getUspesnaKontrola()) {
			System.out.println("Neuspesna Kontrola");
		}
		if (!stav3.getRealizacia()) {
			System.out.println("Dokoncite realizaciu");
		} else {
			stav4.setHotovyProjekt(true);
			System.out.println("Projekt bol uvedeny do prevadzky, vypnite program");
		}
	}
	
	/** Priradenie hodnoty poctu suciastok podla vstupu zamestnanca
	 * @param text retazec obsahujuci pocet suciastok
	 * @return pocet suciastok prekonvertovany zo stringu na int*/
	public static int ratajSuc(String text) {
		int Integris = Integer.parseInt(text);
		pocetSuciastok.setPocet(Integris);
		
		return Integris;
	}
}
