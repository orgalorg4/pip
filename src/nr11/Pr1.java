package nr11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Pr1 extends JApplet {
	private static final long serialVersionUID = 1L;
	
	JLabel et1 = new JLabel("Latura 1: ");
	JLabel et2 = new JLabel("Latura 2: ");
	JLabel et3 = new JLabel("Latura 3: ");
	JTextField text1 = new JTextField(15);
	JTextField text2 = new JTextField(15);
	JTextField text3 = new JTextField(15);

	JButton bt1 = new JButton("Calculeaza: ");

	public void init()
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(et1);
		c.add(text1);
		c.add(et2);
		c.add(text2);
		c.add(et3);
		c.add(text3);
		c.add(bt1);
		bt1.addActionListener(act);
	}
	ActionListener act = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			double l1 = Double.parseDouble(text1.getText());
			double l2 = Double.parseDouble(text2.getText());
			double l3 = Double.parseDouble(text3.getText());
			if(	(l1*l1) == (l2*l2)+ (l3*l3) )
			{
				getAppletContext().showStatus("Triunghi dreptunghic cu perimetrul "+(l1+l2+l3)+"si suprafata "+(l2*l3)/2);
			}
			else if(	(l2*l2) == (l1*l1)+ (l3*l3) )
			{
				getAppletContext().showStatus("Triunghi dreptunghic cu perimetrul "+(l1+l2+l3)+"si suprafata "+(l1*l3)/2);
			}
			else if(	(l3*l3) == (l1*l1)+ (l2*l2) )
			{
				getAppletContext().showStatus("Triunghi dreptunghic cu perimetrul "+(l1+l2+l3)+"si suprafata "+(l1*l2)/2);
			}
			else
			{
				getAppletContext().showStatus("Triunghi oarecare.");
			}
		}
	};
}
