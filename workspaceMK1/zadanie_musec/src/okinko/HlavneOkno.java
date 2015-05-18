package okinko;

import java.awt.*;
import java.awt.event.*;
import java.io.OutputStream;

import javax.swing.*;

import javaModel.*;


public class HlavneOkno extends JFrame implements Objekty{
	
	public JFrame frame;
	
	
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
			int result = fajneSuc.Cena*pocetSuciastok.Pocet;
			konzola.setText(Integer.toString(result));/// sucet  fajneSuc.Cena
			
		}
	});
	
	
	final JButton horsie = new JButton("2.Trieda");
	projektant.add(horsie);
	horsie.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				 
				 //zlesuciastky
		}
	});
	
	final JButton bProjektujem = new JButton("Projektujem"); // tlacidlo projektujem
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
	
	
	final JButton bPhotovy = new JButton("Projekt Hotovy"); // tlacidlo dokoncenia projektovania 
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
	 
	
	final JButton bKontrolaN = new JButton("Projekt kontrolou nepresiel"); // tlacidlo neuspesnej kontroly
	kontrolor.add(bKontrolaN);
	bKontrolaN.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				konzola.setText("Napravte projektovanie");
			
				if(!stav.getSchvalene()){
					kontrolor.setVisible(false);
					System.out.println("Projektovanie je nedokoncene");  
				}
				else{
					System.out.println("Projektovanie je nedokoncene");
					kontrolor.setVisible(false);
				}
		}
	});
	
	final JButton bKontrolaA = new JButton("Projekt kontrolou presiel"); // tlacidlo dokoncenia kontroly
	kontrolor.add(bKontrolaA);
	bKontrolaA.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			
			if(!stav.getSchvalene()){
				kontrolor.setVisible(false);
				System.out.println("Projektovanie je nedokoncene");  
			}
			else{
				 stav2.setUspesnaKontrola(true);
				 kontrolor.setVisible(false);
				 System.out.println("Stav 2 sa zmenil"); // vypisat na aktualny stav
			}
		}
	});
	
	final JButton bZacala = new JButton("Realizacia Prebieha"); // tlacidlo realizacie projektu
	realizacia.add(bZacala);
	bZacala.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				
			if(!stav.getSchvalene()){
				realizacia.setVisible(false);
				System.out.println("Projektovanie je nedokoncene");  
			}
			if(!stav2.getUspesnaKontrola()){
				System.out.println("Neuspesna Kontrola");
				realizacia.setVisible(false);
			}
			else{
				System.out.println("Dokoncite Realizaciu");
				realizacia.setVisible(false);
			}
		}
	});
	
	final JButton bHotovo = new JButton("Projekt je zrealizovany"); // disabled pokial dva stavy nebudu true
	realizacia.add(bHotovo);
	bHotovo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			if(!stav.getSchvalene()){
				realizacia.setVisible(false);
				System.out.println("Projektovanie je nedokoncene");  
			}
			if(!stav2.getUspesnaKontrola()){
				System.out.println("Neuspesna Kontrola");
				realizacia.setVisible(false);
			}
			else{
				 stav3.setRealizacia(true);
				 realizacia.setVisible(false);
				 System.out.println("Stav 3 sa zmenil");
			}
		}
	});

	final JButton bNeuspech = new JButton("Projekt este nebol uvedeny do prevadzky"); // bude disabled pokial nebudu 3 stavy pred nim true
	prevadzka.add(bNeuspech);
	bNeuspech.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			if(!stav.getSchvalene()){
				prevadzka.setVisible(false);
				System.out.println("Projektovanie je nedokoncene");  
			}
			if(!stav2.getUspesnaKontrola()){
				System.out.println("Neuspesna Kontrola");
				prevadzka.setVisible(false);
			}
			if(!stav3.getRealizacia()){
				System.out.println("Dokoncite realizaciu");
				prevadzka.setVisible(false);
			}
			else{
				System.out.println("Uvedte projekt do prevazky");
				prevadzka.setVisible(false);
			}
		}
	});
	
	final JButton bZapojeny = new JButton("Projekt bol uvedeny do prevadzky"); // vsetko musi byt true aby islo
	prevadzka.add(bZapojeny);
	bZapojeny.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			if(!stav.getSchvalene()){
				prevadzka.setVisible(false);
				System.out.println("Projektovanie je nedokoncene");  
			}
			if(!stav2.getUspesnaKontrola()){
				System.out.println("Neuspesna Kontrola");
				prevadzka.setVisible(false);
			}
			if(!stav3.getRealizacia()){
				System.out.println("Dokoncite realizaciu");
				prevadzka.setVisible(false);
			}	
			else{
				 stav4.setHotovyProjekt(true);
				 prevadzka.setVisible(false);
				 System.out.println("Stav 4 sa zmenil");
				 konzola.setText("Projekt bol dokonceny");
			}
		}
	});

	}
}
