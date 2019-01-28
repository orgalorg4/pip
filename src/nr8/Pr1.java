package nr8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pr1 extends JApplet {
	private static final long serialVersionUID = 1L;
	
	JLabel nt = new JLabel("Nota test:");
	JLabel np = new JLabel("Nota practica:");
	JLabel nl = new JLabel("Nota laborator:");
	JLabel nte = new JLabel("Nota teme:");
	JTextField text1 = new JTextField("",15);
	JTextField text2 = new JTextField("",15);
	JTextField text3 = new JTextField("",15);
	JTextField text4 = new JTextField("",15);

	JButton bt1 = new JButton("Calculeaza");
	JTextField text5 = new JTextField("",15);
	
	public void init()
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(nt);
		c.add(text1);
		c.add(np);
		c.add(text2);
		c.add(nl);
		c.add(text3);
		c.add(nte);		
		c.add(text4);
		c.add(bt1);
		c.add(text5);
		bt1.addActionListener(act);

	}





	ActionListener act = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			double nt = Double.parseDouble(text1.getText());
			double np = Double.parseDouble(text2.getText());
			double nl = Double.parseDouble(text3.getText());
			double nte = Double.parseDouble(text4.getText());
			double med = 0;
			med = 0.5*(0.5*(nt+np))+0.5*(0.5*(nl+nte));
			text5.setText("Media la Pip este: "+med);

		}
	};
}


//public class Pr1 {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
