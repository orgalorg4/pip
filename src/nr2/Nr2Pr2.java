/*
 * aplet cu 2 zone de text in care vor fi introduse 2 valori intregi
 * numar 1 si numar 2. Zonele vor fi etichetate. Apletul va avea un 
 * buton numit "compara" la apasarea caruia sa va afisa sub forma 
 * unei etichete mesajul: "valoarea maxima este numar 1/2, sau introduceti
 * numar 1 si/sau 2 daca una sau ambele valori nu au fost introduse.
 */

package nr2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Nr2Pr2 extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel etnr1 = new JLabel("Numar1");
	JLabel etnr2 = new JLabel("Numar2");

	JTextField tnr1 = new JTextField(5); 
	JTextField tnr2 = new JTextField(5); 

	JButton b1 = new JButton("Compara");
	JLabel rez = new JLabel();

	public void init()
	{

		b1.addActionListener(al);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(etnr1);
		c.add(tnr1);
		c.add(etnr2);
		c.add(tnr2);
		c.add(b1);
		c.add(rez);
	}

	ActionListener al = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			String s1 = tnr1.getText();
			String s2 = tnr2.getText();
			if(s1.isEmpty() || s2.isEmpty())
			{
				rez.setText("Introduceti nr 1 si (sau) nr 2");
			}
			else
			{
				int nr1 = Integer.parseInt(s1);
				int nr2 = Integer.parseInt(s2);
				if(nr1 >= nr2)
				{
					rez.setText("Nr1 > Nr2");
				}
				else
				{
					rez.setText("Nr1 < Nr2");
				}
			}
		}
	};
}
