package nr10;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Pr1 extends JApplet{

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g)
	{
		g.drawRect(50, 50, 100, 50);
		g.drawRect(150,100,100,50);
		g.drawLine(50, 75, 150, 125);
		g.drawLine(150, 75, 250, 125);
	}
}


