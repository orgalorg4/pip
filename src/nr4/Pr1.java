package nr4;

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

	private static final long serialVersionUID = 1L;
		JLabel etin = new JLabel("Introduceti valori:");
		JTextField tin = new JTextField(15);
		JButton b1 = new JButton("Calculeaza");
		JLabel etrez = new JLabel("Rezultat:");
		JTextArea trez = new JTextArea(3,10);
		

		public void init()
		{
			b1.addActionListener(act);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			c.add(etin);
			c.add(tin);
			c.add(b1);
			c.add(etrez);
			c.add(trez);
		}
		ActionListener act = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String sir=tin.getText()+" ";
				int val[] = new int[5];
				int k=0;
				for(int i=0;i<sir.length();i++)
				{
					int j=i;
					while(!sir.substring(j, j+1).equals(" "))j++;
					val[k++]=Integer.parseInt(sir.substring(i, j));
					i+=j-i;
				}
				int min =val[0],max=val[0],suma = 0;
				double med = 0;
				for(int i = 0; i<val.length;i++)
				{
					if(val[i]<min)
					{
						min = val[i];
					}
					if(val[i]>max)
					{
						max= val[i];
					}
					suma += val[i];
					
				}
				med = (double)suma/val.length;
				trez.setText("Cea mai mare valoare introdusa este: "+max+"\ncea mai mica valoare introdusa este: "+min+"\niar media numerelor introduse este: "+med);
			}
		};
}

