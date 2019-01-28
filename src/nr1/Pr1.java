/*
 * Numarul 1.
1.Sa se scrie un applet ce calculeaza distanta dintre 2 puncte 
date prin coordonatele (x1,y1) si (x2,y2) ,introduse in campuri 
de text etichetate .
Applet ul are si un buton etichetat " calculeaza distanta " care 
prin apasare va determina afisarea in bara de stare a appletului a 
mesajului " distanta dintre puncte este ... " .
 Distanta = sqrt ((y1-y2)^2 + (x1-x2)^2).
 */

package nr1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pr1 extends JApplet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel etx1 = new JLabel("x1");
	JLabel ety1 = new JLabel("y1");
	JLabel etx2 = new JLabel("x2");
	JLabel ety2 = new JLabel("y2");
	
	JTextField tx1 = new JTextField(6);
	JTextField ty1 = new JTextField(6);
	JTextField tx2 = new JTextField(6);
	JTextField ty2 = new JTextField(6);
	
	JButton b1 = new JButton("calculeaza distanta");
	
	class myAction implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			int x1=Integer.parseInt(tx1.getText());
			int y1=Integer.parseInt(ty1.getText());
			int x2=Integer.parseInt(tx2.getText());
			int y2=Integer.parseInt(ty2.getText());
			double result=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
			getAppletContext().showStatus("distanta dintre puncte este:"+result);
		}
		}
	myAction al = new myAction();
		public void init(){
			b1.addActionListener(al);
			Container cp = getContentPane();
			cp.setLayout(new FlowLayout());
			
			cp.add(etx1);
			cp.add(tx1);
			
			cp.add(ety1);
			cp.add(ty1);
			
			cp.add(etx2);
			cp.add(tx2);

			cp.add(ety2);
			cp.add(ty2);
			
			cp.add(b1);
		}

}
