package nr7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pr1 extends JApplet{

	private static final long serialVersionUID = 1L;

	JButton trimite = new JButton("Deseneaza");
	JLabel et1 = new JLabel("Introduceti caracterul: ");
	JTextField caracter = new JTextField(5);
	JLabel et2 = new JLabel("Introduceti valoarea: ");
	JTextField valoare = new JTextField(5);
	JTextArea afisare = new JTextArea(5, 10);




	ActionListener eTrimite = new ActionListener(){

		
		public void actionPerformed(ActionEvent e){
			String ch = caracter.getText();
			int val = Integer.parseInt(valoare.getText());
			String Continut = "";
			if(val<=10 && val>0){
				for(int i=1; i<=val; i++){
					int spatii = (val - i);
					for(int k=0; k<spatii; k++){
						Continut+=" "; // pun spatii in stanga
					}
					for(int j=0; j<i; j++){
						Continut += ch+" ";		//umplere primu brad
					}
					for(int k=0; k<spatii*3; k++){
						Continut+=" ";		//pun spatii in mijloc
					}
					for(int j=0; j<i; j++){
						Continut += ch+" ";		//umplere al doilea brad
					}
					for(int k=0; k<spatii; k++){
						Continut+=" ";		//pun spatii in dreapta
					}
					Continut += "\n";
				}
			}else{
				Continut = "Numar mai mare ca 10. ";
			}

			afisare.setText(Continut);
		}
	};


	public void init(){

		trimite.addActionListener(eTrimite);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(et1);
		cp.add(caracter);
		cp.add(et2);
		cp.add(valoare);
		cp.add(trimite);
		cp.add(afisare);
	}
}