package okinko;

import java.awt.*;
import java.awt.event.*;
import java.io.OutputStream;

import javax.swing.*;

import javaModel.*;

public class HlavneOkno extends JFrame implements Objekty { // GUI

	public JFrame frame;
	
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

	public void okno(){
		// Jednotlive panely zamestnanii
		final JPanel hlavneMenu = new JPanel();
		final JPanel projektant = new JPanel();
		final JPanel kontrolor = new JPanel();
		final JPanel realizacia = new JPanel();
		final JPanel prevadzka = new JPanel();
		// Jednotilive tlacidla
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
		final JTextField pocSuciastok = new JTextField("       ");
		// Text Area
		final JTextArea konzola = new JTextArea(3, 25);
				
		final JLabel aktStav = new JLabel();
		final JLabel kvalita = new JLabel("Zadajte kvalitu suciastok: ");
		final JLabel pocet = new JLabel("Zadajte pocet potrebnych suciastok: ");

//=======================================================================================================================================
		frame = new JFrame();
		frame.getContentPane().setLayout(new GridLayout(5, 4));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 600);

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
				// este to dakde vypis
			}
		});

		projektant.add(kvalita);
		
		projektant.add(najtop); // dobre suciastky cena
		najtop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int vysledok = fajneSuc.setCena(Suciastky.getPocet());
				konzola.setText("Cena: " + Integer.toString(vysledok));// sucet
																		// fajneSuc.Cena
			}
		});

		projektant.add(horsie); // zle suciastky cena
		horsie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int vysledok = nanicSuc.setCena(Suciastky.getPocet());
				konzola.setText("Cena: " + Integer.toString(vysledok));
			}
		});

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
