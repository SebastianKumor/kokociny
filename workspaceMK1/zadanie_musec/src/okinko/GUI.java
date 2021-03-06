
package okinko;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/*
public class GUI extends JFrame {
	
	public GUI() {
		
		initUI();
		
	} 

	private void initUI() {
		
		JButton quitButton = new JButton("Quit");
		
		quitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		//createLayout(quitButton);
		setLayout(new FlowLayout());
		setTitle("Najsamlepsi Gui");
		setSize(300,200);
		setLocationRelativeTo(null);
		quitButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		quitButton.setHorizontalTextPosition(AbstractButton.LEADING);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	/*
	private void createLayout(JComponent...arg){
		
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		gl.setAutoCreateContainerGaps(true);
		
		gl.setHorizontalGroup(gl.createSequentialGroup()
				.addComponent(arg[0])
				);
		
		gl.setVerticalGroup(gl.createSequentialGroup()
				.addComponent(arg[0])
				);
	}
	*/
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				GUI ex = new GUI();
				ex.setVisible(true);
			}
		});
	}
}
*/

public class GUI extends JFrame {
	private JButton quitButton = new JButton("Quit");
	//private JTextField zliObri = new JTextField(3);
	//private JTextField plachiObri = new JTextField(3);
	//private JLabel statocniRytieriOzn = new JLabel("Statocni rytieri");
	//private JTextArea vypis = new JTextArea(20, 20);
	//private JScrollPane scrollPane = new JScrollPane(vypis, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

public GUI () {
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Najsamlepsi Gui evah");

	add(quitButton);

	pack();

	quitButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}
	});
}
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			GUI ex = new GUI();
			ex.setVisible(true);
		}
	});
}
}
