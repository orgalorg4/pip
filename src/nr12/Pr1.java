package nr12;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pr1 extends JApplet {
	private static final long serialVersionUID = 1L;
	
	JTextField text1 = new JTextField(20);
    JButton b1 = new JButton("Rezultat");
    ButtonGroup g=new ButtonGroup( );
    JRadioButton r1= new JRadioButton ("Convert to inch", false);
    JRadioButton r2 = new JRadioButton ("Convert to cm", true);
    JLabel etrez = new JLabel();

    public void init() {
    	g.add(r1);
    	g.add(r2);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(r1);
        c.add(r2);
        c.add(b1);
        c.add(text1);
        c.add(etrez);
        b1.addActionListener(act);
    }
    ActionListener act = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double conv = Double.parseDouble(text1.getText());
            if(r1.isSelected()) {
                    etrez.setText("= " + conv * 0.39370079 +" in");
                    r1.setSelected(false);
            }


            else if(r2.isSelected()) {
                    etrez.setText("= " + conv * 2.54+" cm");
                    r2.setSelected(false);
            }
            
        }
    };
}
