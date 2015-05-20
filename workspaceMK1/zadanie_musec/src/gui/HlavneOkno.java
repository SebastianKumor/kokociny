
package gui;

import java.awt.*;
import java.awt.event.*;
import java.io.OutputStream;

import javax.swing.*;

import javaModel.*;
/** Trieda obsahujuca GUI
 * @author Matus Mucha */

public class HlavneOkno extends JFrame implements Objekty { // GUI
	public JFrame frame;
	
	/**Vynimka v pripade nespravneho vystupu */
	public abstract class JTextAreaOutputStream extends OutputStream {
		public JTextAreaOutputStream(JTextArea destination, JTextArea konzola) // vynimka
		{
			if (destination == null)
				throw new IllegalArgumentException("Destination is null");
		}
	}
	
	public HlavneOkno() {
		okno();
	}
	/** Metoda obsahuje graficku cast GUI*/
	public void okno(){
		// Jednotlive panely zamestnanii
		final JPanel hlavneMenu = new JPanel();
		final JPanel projektant = new JPanel();
		final JPanel kontrolor = new JPanel();
		final JPanel realizacia = new JPanel();
		final JPanel prevadzka = new JPanel();
		final JPanel info = new JPanel();
		// Jednot	live tlacidla
		final JButton bProjektant = new JButton("Projektant");
		final JButton bKontrolor = new JButton("Kontrolor"); 
		final JButton bRealizator = new JButton("Realizator"); 
		final JButton bInstalater = new JButton("Instalater"); 
		final JButton najtop = new JButton("1.Trieda"); 
		final JButton horsie = new JButton("2.Trieda"); 
		final JButton bProjektujem = new JButton("Projektujem"); 
		final JButton bPhotovy = new JButton("Projekt Hotovy");
		final JButton bKontrolaN = new JButton("Projekt kontrolou nepresiel"); 															
		final JButton bKontrolaA = new JButton("Projekt kontrolou presiel");	
		final JButton bZacala = new JButton("Realizacia Prebieha"); 
		final JButton bHotovo = new JButton("Projekt je zrealizovany"); 
		final JButton bNeuspech = new JButton("Projekt este nebol uvedeny do prevadzky");
		final JButton bZapojeny = new JButton("Projekt bol uvedeny do prevadzky");
		// Text Field
		final JTextField pocSuciastok = new JTextField("",2);
		// Text Area
		final JTextArea konzola = new JTextArea(3, 25);
		final JTextArea aktCena = new JTextArea(2, 25);

		final JLabel kvalita = new JLabel("Zadajte kvalitu suciastok: ");
		final JLabel pocet = new JLabel("Zadajte pocet potrebnych suciastok: ");
		final JLabel enter = new JLabel("a stlacte Enter");

//=======================================================================================================================================
		frame = new JFrame();
		frame.getContentPane().setLayout(new GridLayout(6, 4));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 600);
		frame.setLocationRelativeTo(null);

		frame.getContentPane().add(hlavneMenu, "Electricus");
		hlavneMenu.setVisible(true);

		frame.getContentPane().add(projektant, "Projektant");
		projektant.setVisible(false);

		frame.getContentPane().add(kontrolor, "Kontrolor");
		kontrolor.setVisible(false);

		frame.getContentPane().add(realizacia, "Realizacia");
		realizacia.setVisible(false);

		frame.getContentPane().add(prevadzka, "Uvedenie do prevadzky");
		prevadzka.setVisible(false);
		
		frame.getContentPane().add(info,"Informacie o projekte");
		info.setVisible(true);
// -----------------------------------------------------------------------------------------------------------------
		hlavneMenu.add(bProjektant); // zvyditelnenie panelu projektanta
		bProjektant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				kontrolor.setVisible(false);
				realizacia.setVisible(false);
				prevadzka.setVisible(false);
				projektant.setVisible(true);
			}
		});

		hlavneMenu.add(bKontrolor);// zvyditelnenie panelu kontrolora
		bKontrolor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				kontrolor.setVisible(true);
				realizacia.setVisible(false);
				prevadzka.setVisible(false);
				projektant.setVisible(false);
			}
		});

		hlavneMenu.add(bRealizator); // zvyditelnenie panelu realizatora
		bRealizator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				kontrolor.setVisible(false);
				realizacia.setVisible(true);
				prevadzka.setVisible(false);
				projektant.setVisible(false);
			}
		});

		hlavneMenu.add(bInstalater); // zvyditelnenie panelu Instalatera
		bInstalater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				kontrolor.setVisible(false);
				realizacia.setVisible(false);
				prevadzka.setVisible(true);
				projektant.setVisible(false);
			}
		});
		
		info.add(aktCena);   // JTextArea vypis Ceny a casu na projekt
		aktCena.setEditable(false);
		aktCena.setFont(new Font("monospaced", Font.BOLD, 15));
		
		
		hlavneMenu.add(konzola); // JTextArea
		konzola.setVisible(true);
		konzola.setFont(new Font("monospaced", Font.BOLD, 16));
		konzola.setEditable(false);
		
		projektant.add(pocet);
		
		projektant.add(pocSuciastok); // JTextField na vstup poctu suciastok
		pocSuciastok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent textBox) {
				String text = pocSuciastok.getText();
				Controll.ratajSuc(text);
				konzola.setText("Zadany pocet je: " + text);
			}
		});
		
		projektant.add(enter);
		projektant.add(kvalita);
		
		projektant.add(najtop); // dobre suciastky cena a cas 
		/** Vypis ceny a casu pre dobre suciastky*/
		najtop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int vysledok = fajneSuc.setCena(Suciastky.getPocet());
				fajneSuc.setCas(Suciastky.getPocet());
				aktCena.setText("Cena: " +  (vysledok) + " �" + "  Cas: " + (Suciastky.getCas()) + " hodin");	
			}
		});

		projektant.add(horsie); // zle suciastky cena a cas 
		/** vypis ceny a casu pre horsie suciastky*/
		horsie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int vysledok = nanicSuc.setCena(Suciastky.getPocet());
				nanicSuc.setCas(Suciastky.getPocet());
				aktCena.setText("Cena: " + Integer.toString(vysledok) + " �" + "  Cas: " +(Suciastky.getCas()) + " hodin");
			}
		});
// ostatne tlacidla
		projektant.add(bProjektujem);
		bProjektujem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Controll.bProjektN();
			}
		});
		
		projektant.add(bPhotovy);
		bPhotovy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Controll.bProjektD();
			}
		});

		kontrolor.add(bKontrolaN);
		bKontrolaN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Controll.bKontrolaN();
			}
		});

		kontrolor.add(bKontrolaA);
		bKontrolaA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Controll.bKontrolaP();
			}
		});

		realizacia.add(bZacala);
		bZacala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Controll.bRzacala();
			}
		});

		realizacia.add(bHotovo);
		bHotovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Controll.bRskoncila();
			}
		});

		prevadzka.add(bNeuspech);
		bNeuspech.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Controll.bPrevadzkaN();
			}
		});

		prevadzka.add(bZapojeny);
		bZapojeny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Controll.bPrevadzkaD();
			}
		});

	}
}