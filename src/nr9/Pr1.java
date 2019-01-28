package nr9;


//import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class Pr1 extends JApplet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g)
	{
		g.drawRect(50, 50, 100, 100);
		g.drawOval(50, 50, 100, 100);
		
//		g.setColor(Color.CYAN);
		g.drawRect(150, 150, 100, 100);
		g.drawOval(150, 150, 100, 100);
	}
}
