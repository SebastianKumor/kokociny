package okinko;

import java.awt.*;
import java.awt.event.*;
import java.io.OutputStream;

import javax.swing.*;

import javaModel.*;


public class HlavneOkno extends JFrame implements Objekty{
	
	public JFrame frame;
	// Panely
	final JPanel hlavneMenu = new JPanel();
	final JPanel projektant = new JPanel();
	final JPanel kontrolor = new JPanel();
	final JPanel realizacia = new JPanel();
	final JPanel prevadzka = new JPanel ();
//Buttony
	final JButton bProjektant = new JButton("Projektant");
	final JButton bKontrolor = new JButton("Kontrolor");
	final JButton bRealizator = new JButton("Realizator");
	final JButton bInstalater = new JButton("Instalater");
	final JButton najtop = new JButton("1.Trieda");
	final JButton horsie = new JButton("2.Trieda");
	final JButton bProjektujem = new JButton("Projektujem"); // tlacidlo projektujem
	final JButton bPhotovy = new JButton("Projekt Hotovy"); // tlacidlo dokoncenia projektovania 
	final JButton bKontrolaN = new JButton("Projekt kontrolou nepresiel"); // tlacidlo neuspesnej kontroly
	final JButton bKontrolaA = new JButton("Projekt kontrolou presiel"); // tlacidlo dokoncenia kontroly
	final JButton bZacala = new JButton("Realizacia Prebieha"); // tlacidlo realizacie projektu
	final JButton bHotovo = new JButton("Projekt je zrealizovany"); // disabled pokial dva stavy nebudu true
	final JButton bNeuspech = new JButton("Projekt este nebol uvedeny do prevadzky"); // bude disabled pokial nebudu 3 stavy pred nim true
	final JButton bZapojeny = new JButton("Projekt bol uvedeny do prevadzky"); // vsetko musi byt true aby islo

//Text Field
	final JTextField pocSuciastok = new JTextField("Zadajte pocet potrebnych suciastok");
//Text Area
	final JTextArea konzola = new JTextArea(3,25);
	final JTextArea labelatko = new JTextArea(2,5);


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() 
			{
				HlavneOkno guic = new HlavneOkno();
				guic.frame.setVisible(true);
			}
		});
	}
	
	public abstract class JTextAreaOutputStream extends OutputStream
	{
	    private final JTextArea konzola;

	    public JTextAreaOutputStream (JTextArea destination, JTextArea konzola)
	    {
	        if (destination == null)
	            throw new IllegalArgumentException ("Destination is null");

	        this.konzola = konzola;
	    }
	}

	public HlavneOkno() { 
		okno();
	}
	
	public void okno() { // daj vsetky objekty von 
		
	frame = new JFrame();
	frame.getContentPane().setLayout(new GridLayout(5,3));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(350,600);

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

	
//-----------------------------------------------------------------------------------------------------------------	

	hlavneMenu.add(bProjektant);
	bProjektant.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event)
		{
			kontrolor.setVisible(false);
			realizacia.setVisible(false);
			prevadzka.setVisible(false);
			projektant.setVisible(true);
		}
	});
	
	hlavneMenu.add(bKontrolor);
	bKontrolor.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event)
		{
			kontrolor.setVisible(true);
			realizacia.setVisible(false);
			prevadzka.setVisible(false);
			projektant.setVisible(false);
		}
	});
	
	
	hlavneMenu.add(bRealizator);
	bRealizator.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event)
		{
			kontrolor.setVisible(false);
			realizacia.setVisible(true);
			prevadzka.setVisible(false);
			projektant.setVisible(false);
		
		}
	});
	
	
	hlavneMenu.add(bInstalater);
	bInstalater.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event)
		{
			kontrolor.setVisible(false);
			realizacia.setVisible(false);
			prevadzka.setVisible(true);
			projektant.setVisible(false);
		}
	});
	
	hlavneMenu.add(konzola);
	konzola.setVisible(true);
    konzola.setFont(new Font("monospaced",Font.BOLD,16));
    konzola.setEditable(false);
    

	projektant.add(pocSuciastok);
	pocSuciastok.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent textBox)
		{	
			String text = pocSuciastok.getText();
			int Integris = Integer.parseInt(text); 
			pocetSuciastok.setPocet(Integris);
			 // este to dakde vypis
		}
	});
	
	projektant.add(labelatko);
	labelatko.setText("Zadajte kvalitu suciastok");
	labelatko.setEditable(false);
	
		
	projektant.add(najtop);
	najtop.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			//String dSuc = Integer.toString(fajneSuc.Cena);
			//int result = fajneSuc.Cena*pocetSuciastok.Pocet;
			int vysledok = fajneSuc.setCena(pocetSuciastok.Pocet);
			konzola.setText(Integer.toString(vysledok));/// sucet  fajneSuc.Cena
			
		}
	});
	
	
	projektant.add(horsie);
	horsie.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				 
				 //zlesuciastky
		}
	});
	
	projektant.add(bProjektujem);
	bProjektujem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				
				if(!stav.getSchvalene()){	
					projektant.setVisible(false);
				}
				else{
				projektant.setVisible(false);
				konzola.setText("Dokoncite projektovanie");		
				}
			}
	});
	
	
	projektant.add(bPhotovy);
	bPhotovy.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			if(pocetSuciastok.Pocet!=0)	 { 
			stav.setSchvalene(true);
			projektant.setVisible(false);
			System.out.println("Stav sa zmenil");
			}
			else{
			konzola.setText("Zadajte pocet suciastok");// ukazovat aktualny stav dakde
			}
		}
	});
	 
	
	kontrolor.add(bKontrolaN);
	bKontrolaN.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				//konzola.setText("Napravte projektovanie");
			
		}
	});
	
	kontrolor.add(bKontrolaA);
	bKontrolaA.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			Metody.bKontrolaP();
		}
	});
	
	realizacia.add(bZacala);
	bZacala.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			Metody.bRzacala();
		}
	});
	
	realizacia.add(bHotovo);
	bHotovo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			Metody.bRskoncila();
		}
	});

	prevadzka.add(bNeuspech);
	bNeuspech.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			Metody.bPrevadzkaN();
		}
	});
	
	prevadzka.add(bZapojeny);
	bZapojeny.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			Metody.bPrevadzkaD();
			
		}
	});

	}
}
