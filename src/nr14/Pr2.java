package nr14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2 {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int[] ERATOSTENE = {2,3,5,7,11,13,17,19,23,31,37,41,47};
		BufferedReader citire = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduceti numarul 1: ");
		int nr1 = Integer.parseInt(citire.readLine());
		System.out.println("Introduceti numarul 2: ");
		int nr2 = Integer.parseInt(citire.readLine());

		if(nr1 <= 50 && nr2 <=50)
		{
			if(nr1 < nr2)
			{
				int nrprime=0;
				for(int i=nr1+1;i<nr2;i++)
				{
					for(int j=0;j<ERATOSTENE.length;j++)
					{
						if(i == ERATOSTENE[j])
						{
							nrprime++;
						}
					}
				}
				System.out.println("S-au gasit "+nrprime+" numere prime.");
			}
			else{
				System.out.println("Trebuie Nr1>Nr2");
			}	
		}
		else{
			System.out.println("Nr1 sau nr2 sunt mai mari ca 50.");
		}
	}
}
