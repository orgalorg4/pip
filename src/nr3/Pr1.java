package nr3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pr1 extends JApplet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel etraza = new JLabel("Raza cerc: ");
	JButton b1 = new JButton("Calculeaza");
	JLabel etrez = new JLabel("Rezultat");
	JTextField traza = new JTextField(15);
	JTextArea trez =new JTextArea ("",3,10);
	
	public void init()
	{
		b1.addActionListener(act);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		c.add(etraza);
		c.add(traza);
		c.add(b1);
		c.add(etrez);
		c.add(trez);
		trez.setEditable(false);
	}
	ActionListener act = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			double raza = Double.parseDouble(traza.getText());
			double diametru = 2 * raza;
			double circumferinta = 2*3.14*raza;
			double aria = 3.14 * Math.pow(raza, 2);
			trez.setText("Cercul are diametrul: "+diametru + ",\ncircumferinta "+circumferinta+"\nsi suprafata "+aria);			
		}
	}; 	}


