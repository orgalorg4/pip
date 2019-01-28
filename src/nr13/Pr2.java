package nr13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2 {
	public static void main(String [] args) throws IOException
	{
		int [] locuri = new int[10];
		BufferedReader citire = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduceti numele: ");
//		String nume = citire.readLine();
		System.out.println("Alegeti nr locului in avion. 1-5-BUSINESS sau 6-10-ECONOMIC: ");
		final String BUSINESS = "BUSINESS";
		final String ECONOMIC = "ECONOMIC";
		int optiune = Integer.parseInt(citire.readLine());
		if(optiune > 0 && optiune < 6){
			if(locuri[optiune-1] == 0)
			{
				System.out.println("Rezervare efectuata. Ati rezervat locul cu numarul "+optiune+" la clasa "+BUSINESS);
			}
		}
		else if(optiune >= 6 && optiune <11)
		{
			

if(locuri[optiune-1] == 0)
			{
				System.out.println("Rezervare efectuata. Ati rezervat locul cu numarul "+optiune+" la clasa "+ECONOMIC);
			}
		}
		else{
				System.out.println("Rezervare neefectuata.");
		}
}
}
