package nr14;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;
 public class Pr1 extends JApplet{
	private static final long serialVersionUID = 1L;

	public void paint(Graphics s){
	s.setColor(Color.BLACK);
	s.fillOval(200, 200, 160, 160);
	s.setColor(Color.WHITE);
	s.fillOval(240, 200, 80,80);
	s.setColor(Color.BLACK);
	s.drawOval(260, 200,40,40);
	s.drawLine(280,200,280,280);
		 }
	 }

