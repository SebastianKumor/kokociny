package okinko;

import java.awt.*;
import java.awt.event.*;
import java.io.OutputStream;

import javax.swing.*;

import javaModel.*;


public class HlavneOkno extends JFrame{
	
	private JFrame frame;
	private Stav stav = new Stav();
	private Stav stav2= new Stav();
	private Stav stav3 = new Stav();
	private Stav stav4 = new Stav();
	private Suciastky pocetSuciastok = new Suciastky();
	private DobreSuciastky fajneSuc = new DobreSuciastky();
	private ZleSuciastky nanicSuc = new ZleSuciastky();
	
	
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
	
	public void okno() {
		
	frame = new JFrame();
	frame.getContentPane().setLayout(new GridLayout(5,3));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(350,600);

	final JPanel hlavneMenu = new JPanel();
	frame.getContentPane().add(hlavneMenu, "Electricus");
	hlavneMenu.setVisible(true);

	final JPanel projektant = new JPanel();
	frame.getContentPane().add(projektant, "Projektant");
	projektant.setVisible(false);
	
	final JPanel kontrolor = new JPanel();
	frame.getContentPane().add(kontrolor, "Kontrolor");
	kontrolor.setVisible(false);
	
	final JPanel realizacia = new JPanel();
	frame.getContentPane().add(realizacia, "Realizacia");
	realizacia.setVisible(false);
	
	final JPanel prevadzka = new JPanel ();
	frame.getContentPane().add(prevadzka, "Uvedenie do prevadzky");
	prevadzka.setVisible(false);

	
//-----------------------------------------------------------------------------------------------------------------	

	final JButton bProjektant = new JButton("Projektant");
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
	

	final JButton bKontrolor = new JButton("Kontrolor");
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
	
	
	final JButton bRealizator = new JButton("Realizator");
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
	
	
	final JButton bInstalater = new JButton("Instalater");
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
	
	final JTextArea konzola = new JTextArea(3,25);
	hlavneMenu.add(konzola);
	konzola.setVisible(true);
    konzola.setFont(new Font("monospaced",Font.BOLD,16));
    konzola.setEditable(false);
    

	final JTextField pocSuciastok = new JTextField("Zadajte pocet potrebnych suciastok");
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
	
	final JTextArea labelatko = new JTextArea(2,5);
	projektant.add(labelatko);
	labelatko.setText("Zadajte kvalitu suciastok");
	labelatko.setEditable(false);
	
	final JButton najtop = new JButton("1.Trieda");
	projektant.add(najtop);
	najtop.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			//String dSuc = Integer.toString(fajneSuc.Cena);
		//	fajneSuc.setCena(pocetSuciastok.Pocet);
			konzola.setText(Integer.toString(fajneSuc.Cena));
			
		}
	});
	
	
	final JButton horsie = new JButton("2.Trieda");
	projektant.add(horsie);
	horsie.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				 
				 //zlesuciastky
		}
	});
	
	final JButton bProjektujem = new JButton("Projektujem");
	projektant.add(bProjektujem);
	bProjektujem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				
				if(!stav.getSchvalene()){	
					projektant.setVisible(false);;
				};
				konzola.setText("Dokoncite projektovanie");		}
	});
	
	
	final JButton bPhotovy = new JButton("Projekt Hotovy");
	projektant.add(bPhotovy);
	bPhotovy.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				 stav.setSchvalene(true);
				 System.out.println("Stav sa zmenil");
		}
	});
	 
	
	final JButton bKontrolaN = new JButton("Projekt kontrolou nepresiel");
	kontrolor.add(bKontrolaN);
	bKontrolaN.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				konzola.setText("Napravte projektovanie");
			/*
				if(!stav.getSchvalene()){
					bKontrolaN.setEnabled(false);
				}
				System.out.println("Projektovanie je nedokoncene");
				
				if(!stav2.getUspesnaKontrola()){
					System.out.println("Neuspesna Kontrola");
					bKontrolaN.setEnabled(false);
				}
				*/
		}
	});
	
	final JButton bKontrolaA = new JButton("Projekt kontrolou presiel"); // disabled pokial schvalene nepojde 
	kontrolor.add(bKontrolaA);
	bKontrolaA.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			
			/*if(!stav.getSchvalene()){
				bKontrolaA.setEnabled(false);
			}
			if(!stav2.getUspesnaKontrola()){
				System.out.println("Neuspesna Kontrola");
				bKontrolaA.setEnabled(false);
			}
			*/
		
				//bKontrolaA.setEnabled(true);
				 stav2.setUspesnaKontrola(true);
				 System.out.println("Stav 2 sa zmenil");
			
		}
	});
	
	final JButton bZacala = new JButton("Realizacia Prebieha");
	realizacia.add(bZacala);
	bZacala.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				
				if(!stav3.getKomponentyKupene()){	
					realizacia.setVisible(false);;
				};
				konzola.setText("Dokoncite realizaciu");
		}
	});
	
	final JButton bHotovo = new JButton("Projekt je zrealizovany"); // disabled pokial dva stavy nebudu true
	realizacia.add(bHotovo);
	bHotovo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				 stav3.setKomponentyKupene(true);
				 System.out.println("Stav 3 sa zmenil");
		}
	});

	final JButton bNeuspech = new JButton("Projekt este nebol uvedeny do prevadzky"); // bude disabled pokial nebudu 3 stavy pred nim true
	prevadzka.add(bNeuspech);
	bNeuspech.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				if(!stav4.getHotovyProjekt()){	
					prevadzka.setVisible(false);
				};
				konzola.setText("Dokoncite zavedenie do prevadzky");
		}
	});
	
	final JButton bZapojeny = new JButton("Projekt bol uvedeny do prevadzky"); // vsetko musi byt true aby islo
	prevadzka.add(bZapojeny);
	bZapojeny.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				 stav4.setHotovyProjekt(true);
				 System.out.println("Stav 4 sa zmenil");
				 konzola.setText("Projekt bol dokonceny");
		}
	});

	}
}
