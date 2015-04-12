package rozhranie;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class HlavneOkno extends JFrame{
	
	private JFrame frame;
	private JPanel hlavneOkno;
	private JPanel projektant;
	private JPanel kontrola;
	private JPanel realizacia;
	private JPanel prevadzka;
	//private JButton Quit = new JButton("Vypni Program");
	//private JTextField textField;

	
	
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
	frame.getContentPane().setLayout(new GridLayout(5,5));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,500);
	//frame.setBounds(300,300,500,500);

	final JPanel hlavneMenu = new JPanel();
	frame.getContentPane().add(hlavneMenu, "Electricus");
	//hlavneMenu.setLayout(null);
	hlavneMenu.setVisible(true);
	
	final JPanel projektant = new JPanel();
	frame.getContentPane().add(projektant, "Projektant");
	
	//projektant.setLayout(null);
	projektant.setVisible(false);
	
	final JPanel kontrolor = new JPanel();
	frame.getContentPane().add(kontrolor, "Kontrolor");
	
	//kontrolor.setLayout(null);
	kontrolor.setVisible(false);
	
	final JPanel realizacia = new JPanel();
	frame.getContentPane().add(realizacia, "Realizacia");

	//realizacia.setLayout(null);
	realizacia.setVisible(false);
	
	final JPanel prevadzka = new JPanel ();
	frame.getContentPane().add(prevadzka, "Uvedenie do prevadzky");
	
	//prevadzka.setLayout(null);
	prevadzka.setVisible(false);
	
	
	
	
	JButton bProjektant = new JButton("Projektant");
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
	
	JButton bKontrolor = new JButton("Kontrolor");
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
	
	
	JButton bRealizator = new JButton("Realizator");
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
	
	
	JButton bInstalater = new JButton("Instalater");
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
	
	 
	JButton bProjektujem = new JButton("Projektujem");
	projektant.add(bProjektujem);
	 
	JButton bPhotovy = new JButton("Projekt Hotovy");
	projektant.add(bPhotovy);

	JButton bKontrolaN = new JButton("Projekt kontrolou nepresiel");
	kontrolor.add(bKontrolaN);
	
	JButton bKontrolaA = new JButton("Projekt kontrolou presiel");
	kontrolor.add(bKontrolaA);
	
	JButton bZacala = new JButton("Realizacia Prebieha");
	realizacia.add(bZacala);
	
	JButton bHotovo = new JButton("Projekt je zrealizovany");
	realizacia.add(bHotovo);

	JButton bNeuspech = new JButton("Projekt este nebol uvedeny do prevadzky");
	prevadzka.add(bNeuspech);
	
	JButton bZapojeny = new JButton("Projekt bol uvedeny do prevadzky");
	prevadzka.add(bZapojeny);
	


	}
}
