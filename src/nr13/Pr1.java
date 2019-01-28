package nr13;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pr1 extends JApplet {
	private static final long serialVersionUID = 1L;

	public void init()
	{
		JFrame obiect = new JFrame();
		String s1= JOptionPane.showInputDialog(obiect,"Introduceti numarul: ");
		String inversat = new StringBuilder(s1).reverse().toString(); // se inverseaza
		if(s1.length() != 5)
		{
			JOptionPane.showMessageDialog(obiect,"Numarul trebuie sa aiba 5 cifre");
		}
		else
		{
			int nr1 = Integer.parseInt(s1);
			int inv = Integer.parseInt(inversat); 
			if(nr1 != inv)
			{
				JOptionPane.showMessageDialog(obiect,"Numarul nu este palindrom");

			}
			else
			{
				JOptionPane.showMessageDialog(obiect,"Numarul este palindrom");
			}
		}
	}
}
