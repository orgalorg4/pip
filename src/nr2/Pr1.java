/*
 * nr 2
 * 1.scrieti codul metodelor de adunare si inmultire a 2 matrici patrate.
 * Puneti aceste metode intr-o clasa numita CalculMatriceal, ce primeste 
 * ca argumente ale constructorului referintele catre 2 masive bidimensionale
 * ce reprezinta matricile de lucru. Aceste referinte initializeaza 2 campuri 
 * de date ale clasei de tip masiv bidim. de intregi
 * Exersati metodele acestei clase
 */

package nr2;

class CalculMatriceal{
	int a[][];
	int b[][];

	CalculMatriceal(int a[][],int b[][]){
		this.a=a;
		this.b=b;
	}
	private void Afisare(int r[][]){
		int n=r.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(r[i][j]+" ");
			System.out.println();
		}

	}
	public void Adunare()
	{
		int n=a.length;
		int c[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		Afisare(c);
	}
	public void Inmultire()
	{
		int n=a.length;
		int c[][] = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					c[i][j]= c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		Afisare(c);
	}
}

public class Pr1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]={{1,2},{1,2}};
		CalculMatriceal cm = new CalculMatriceal(a, a);
		cm.Adunare();
		System.out.print("\n\n");
		cm.Inmultire();
	}

}
