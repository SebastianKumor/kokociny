package okinko;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javaModel.Stav;
import javaModel.DobreSuciastky;
import javaModel.ZleSuciastky;
import javaModel.Suciastky;


public class HlavneOkno extends JFrame{
	
	private JFrame frame;
	private Stav stav = new Stav();
	private Stav stav2= new Stav();
	private Stav stav3 = new Stav();
	private Stav stav4 = new Stav();
	

	//private JButton Quit = new JButton("Vypni Program");
	//private JTextField textField;

	/*
	public boolean getSchvalene(Stav stav)
	{
		return stav.getSchvalene();
		
	}
	
	public void setSchvalene(Stav stav, boolean b)
	{
		stav.setSchvalene(b);
	}
	
	public boolean getUspesnaKontrola(Stav stav2)
	{
		return stav2.getUspesnaKontrola();
	}
	
	public void setUspesnaKontrola(Stav stav2, boolean c)
	{
		stav2.setUspesnaKontrola(c);
	}
	public boolean getKomponentyKupene(Stav stav3)
	{
		return stav3.getKomponentyKupene();
	}
	
	public void setKomponentyKupene(Stav stav3, boolean d)
	{
		stav3.setKomponentyKupene(d);
	}
	*/
	/*
	public Integer getCena(){
	      return cena;
	    }
	*/
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

	public HlavneOkno() { 
		okno();
	}
	
	private void okno() {
		
	frame = new JFrame();
	frame.getContentPane().setLayout(new GridLayout(6,6));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,500);

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
	
	final JPanel nakup = new JPanel();
	frame.getContentPane().add(nakup, "Nakup suciastok");
	nakup.setVisible(true);

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
	
	 
	final JButton bProjektujem = new JButton("Projektujem");
	projektant.add(bProjektujem);
	bProjektujem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				
				if(!stav.getSchvalene()){	
					projektant.setVisible(false);;
				};
				System.out.println("Dokoncite projektovanie");
		}
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
				System.out.println("Dokoncite realizaciu");
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
				System.out.println("Dokoncite zavedenie do prevadzky");
		}
	});
	
	final JButton bZapojeny = new JButton("Projekt bol uvedeny do prevadzky"); // vsetko musi byt true aby islo
	prevadzka.add(bZapojeny);
	bZapojeny.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				 stav4.setHotovyProjekt(true);
				 System.out.println("Stav 4 sa zmenil");
		}
	});

	final JButton bDobreSuciastky = new JButton("Dobre Suciastky"); 
	nakup.add(bDobreSuciastky);
	bDobreSuciastky.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				// System.out.println("Dobre suciastky");
		}
	});
	
	final JButton bZleSuciastky = new JButton("Zle Suciastky"); 
	nakup.add(bZleSuciastky);
	bZleSuciastky.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			//	 System.out.println(cena);
		}
	});
	
	}
}