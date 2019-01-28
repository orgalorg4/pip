/*
 * 2. Scrieti un program ce afiseaza valorile intregi 
 * echivalente pt urmatoarele caractere Unicode : A,B,C,a,b,c,0,1,2,$,*,+,/

 */


package nr1;

public class Pr2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] sir={'A','B','C','a','b','c','0','1','2','$','*','+','/','ņ'};
		for (int i = 0; i < sir.length; i++)
		{
			System.out.println(sir[i] +" valoarea intreaga "+ (int)(sir[i]));
		}
	}

}
