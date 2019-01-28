package nr6;

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

	JLabel et1 = new JLabel("Introdu un caracter: ");
	JLabel et2 = new JLabel("Introdu numarul: ");
	JTextField text1 = new JTextField(15);
	JTextField text2 = new JTextField(15);

	JTextArea zona1 = new JTextArea(5,10);
	JButton bt1 = new JButton("Deseneaza");

	public void init()
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(et1);
		c.add(text1);
		c.add(et2);
		c.add(text2);
		c.add(bt1);
		c.add(zona1);
		bt1.addActionListener(act);
	}
	ActionListener act = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			String ch = text1.getText();
			int nr = Integer.parseInt(text2.getText());
			if(nr > 10)
			{
				zona1.setText("Numarul este mai mare ca 10. Introduceti <= 10");
			}
			else
			{
				String afisare = "";

				for(int i=0;i<nr;i++)
				{
					for(int j=0;j<nr;j++)
					{
						afisare =  afisare+ch;	
					}
					afisare = afisare + "\n";
				}
				zona1.setText(afisare);
			}
		}

	};
}
