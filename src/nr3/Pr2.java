package nr3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2 {
	public static void main(String[] args) throws IOException
	{
		double a[][] = new double [2][12];
		String loc1,loc2;
		//Citire Localitati
		BufferedReader citire = new BufferedReader(new InputStreamReader(System.in)); //crearea obiect citire de la tastatura 
		System.out.println("nume localitatea 1 : ");
		loc1 =citire.readLine(); //citire propriu zisa
		System.out.println("nume localitatea 2 : ");
		loc2 = citire.readLine();
		
		//Citire valori de temperatura lunare. citire matrice a
		for(int i=0;i<2;i++) // 2 = localitati
		{
			System.out.println("Introduceti temperaturile pentru localitatea1 "+loc1+" si pentru localitatea2 "+loc2);
			for(int j=0;j<12;j++) // 12= luni
			{
				System.out.println("valoarea pt luna "+(j+1));
				a[i][j] = Double.parseDouble(citire.readLine()); // citire temperatura pt fiecare luna
			}
		}
		double min1 = a[0][0]; //min pentru loc1
		double max1 = a[0][0];
		double s1 = 0;
		
		for(int j=0;j<12;j++)
		{
			if(a[0][j]<min1)
			{
				min1=a[0][j];
			}
			if(a[0][j]>max1)
			{
				max1 = a[0][j];
			}
			s1 += a[0][j];
		}
		double media1 = s1/12;
		System.out.println("Localitatea "+loc1+" are minimul "+min1+", maximul "+max1+" si media "+media1);
		
		double min2 = a[1][0]; //min loc2
		double max2 = a[1][0];
		double s2= 0;
		for(int j=0;j<12;j++)
		{
		if(a[1][j]<min2)
		{
			min2 = a[1][j];
		}
		if(a[1][j]>max2)
		{
			max2 = a[1][j];
		}
		s2 += a[1][j];
	}
	double media2 = s2/12;
	System.out.println("Localitatea "+loc2+" are minimul "+min2+", maximul "+max2+" si media "+media2);
		
	}
}
//
//public class Pr2 {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
