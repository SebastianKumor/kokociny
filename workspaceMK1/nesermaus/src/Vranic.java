import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StretOkno extends JFrame {
	private Stret stret = new Stret();
	private JButton start = new JButton("Start");
	private JButton bojovnik = new JButton("Pridaj Bojovnika");
	private JButton zmaz = new JButton("Zmaz");
	private JTextField zliObri = new JTextField(3);
	private JTextField plachiObri = new JTextField(3);
	private JTextField statocniRytieri = new JTextField(3);
	private JLabel zliObriOzn = new JLabel("Zli obri");
	private JLabel plachiObriOzn = new JLabel("Plachi obri");
	private JLabel statocniRytieriOzn = new JLabel("Statocni rytieri");
	private JTextArea vypis = new JTextArea(20, 20);
	private JScrollPane scrollPane = new JScrollPane(vypis, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	public StretOkno() {
		// atribÃºty sÃº inicializovanÃ© priamo na mieste deklarÃ¡cie
		
		//setSize(500,500); // met=oda pack() zavolanÃ¡ niÅ¾Å¡ie zabezpeÄ�Ã­ optimÃ¡lnu veÄ¾kosÅ¥ okna vzhÄ¾adom na pridanÃ© komponenty
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // inak sa okno len skryje - platÃ­ aj WindowConstants.EXIT_ON_CLOSE
		setTitle("Stret");
		
		//setLayout(new BorderLayout());
		//vypis.setLineWrap(true);
		
		add(zliObriOzn);
		add(zliObri,BorderLayout.NORTH);
		add(plachiObriOzn);
		add(plachiObri,BorderLayout.NORTH);
		add(statocniRytieriOzn);
		add(statocniRytieri,BorderLayout.NORTH);
		add(start,BorderLayout.EAST);
		add(bojovnik,BorderLayout.WEST);
		add(zmaz,BorderLayout.SOUTH);
	    add(scrollPane);

		pack();

		/* PrijÃ­maÄ� implementovanÃ½ pomenovanou vnÃºtornou triedou
		class Boj implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				stret.vytvorBojovnikov(20, 30, 10);
				System.out.println(stret.stret());				
			}

		}
		
		start.addActionListener(new Boj());
		*/
		// V skutoÄ�nosti triedu potrebujeme len pre jednu inÅ¡tanciu, ktorÃº moÅ¾no urobiÅ¥ na mieste (anonymnÃ¡ trieda)
		start.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						vypis.append(stret.stret());
					}
				}
		);
		
		bojovnik.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						stret.vytvorBojovnikov(Integer.parseInt(zliObri.getText()),
								Integer.parseInt(plachiObri.getText()),
								Integer.parseInt(statocniRytieri.getText()));
					}
				}
		);
		
		zmaz.addActionListener(
				new ActionListener() {
		    public void actionPerformed(ActionEvent e){
		        vypis.setText("");
		        //textfield.setText(null); //or use this
		    }
		}
				);
		

		/* Pre netrpezlivÃ½ch (preberieme na Ä�alÅ¡ej prednÃ¡Å¡ke): namiesto anonymnej triedy moÅ¾no pouÅ¾iÅ¥ tzv. lambda vÃ½raz
		//start.addActionListener((ActionEvent e) -> { // lambda vÃ½raz s uvedenÃ­m typu
 		start.addActionListener(e -> { // lambda vÃ½raz s odvodenÃ­m typu z kontextu
				stret.vytvorBojovnikov(	Integer.parseInt(zliObri.getText()),
										Integer.parseInt(plachiObri.getText()),
										Integer.parseInt(statocniRytieri.getText()));
				vypis.append(stret.stret());
			}
		);
		*/

		/* TieÅ¾ pre netrpezlivÃ½ch eÅ¡te Ä�alÅ¡ia moÅ¾nosÅ¥: implementÃ¡cia odkazom na metÃ³du (method reference)
	    ActionListener a = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stret.vytvorBojovnikov(	Integer.parseInt(zliObri.getText()),
										Integer.parseInt(plachiObri.getText()),
										Integer.parseInt(statocniRytieri.getText()));
				vypis.append(stret.stret());
			}
		};

   		start.addActionListener(a::actionPerformed);
		*/

	}
		
}