package nr5;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Pr1 extends JApplet{
	
	private static final long serialVersionUID = 1L;
	public void paint (Graphics g)
	{
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100, 100, 200, 200);
		
		g.drawRect(100, 300, 200, 200);
		g.drawOval(100, 300, 200, 200);
		
		g.drawRect(300, 100, 200, 200);
		g.drawOval(300, 100, 200, 200);
		
		g.drawRect(300, 300, 200, 200);
		g.drawOval(300, 300, 200, 200);	
	}
}

