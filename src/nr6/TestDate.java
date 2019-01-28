package nr6; //pr2

class Data{
	int zi;
	int luna;
	int an;
	public Data(int zi, int luna, int an) {
		if(luna >=1 && luna<=12)
		{
			this.luna = luna;
		}
		else{
			System.out.println("Luna nu corespunde.");
		}		
		if(getLuna() == 1 || getLuna() == 3 || getLuna() == 5 || getLuna() == 7 || getLuna() == 8 || getLuna() == 10 ||
				getLuna() == 12){
			if(zi >=1 && zi<=31)
			{
				this.zi = zi;
			}
			else{
				System.out.println("Ziua nu corespunde cu luna.");
			}
		}
		else if(getLuna() == 4 || getLuna() == 6 || getLuna() == 9 || getLuna() == 11)
		{
			if(zi >=1 && zi<=30)
			{
				this.zi = zi;
			}
			else{
				System.out.println("Ziua nu corespunde cu luna.");
			}
		}
		else {
			if(zi >=1 && zi<=28)
			{
				this.zi = zi;
			}
			else{
				System.out.println("Ziua nu corespunde cu luna.");
			}
		}


		if(an >=1950 && luna<=2017)
		{
			this.an = an;
		}
		else{
			System.out.println("Anul nu corespunde.");
		}
	}
	public int getZi() {
		return zi;
	}
	public void setZi(int zi) {
		System.out.println("Ziua introdusa:"+zi);
		if(getLuna() == 1 || getLuna() == 3 || getLuna() == 5 || getLuna() == 7 || getLuna() == 8 || getLuna() == 10 ||  getLuna() == 12){
			if(zi >=1 && zi<=31)
			{
				this.zi = zi;
			}
			else{
				System.out.println("Ziua nu corespunde cu luna.");
			}
		}
		else if(getLuna() == 4 || getLuna() == 6 || getLuna() == 9 || getLuna() == 11)
		{
			if(zi >=1 && zi<=30)
			{
				this.zi = zi;

			}
			else{
				System.out.println("Ziua nu corespunde cu luna.");
			}
		}
		else {
			if(zi >=1 && zi<=28)
			{
				this.zi = zi;

			}
			else{
				System.out.println("Ziua nu corespunde cu luna.");
			}
		}
	}
	public int getLuna() {
		return luna;
	}
	public void setLuna(int luna) {
		System.out.println("Luna introdusa: "+luna);
		if(luna >=1 && luna<=12)
		{
			this.luna = luna;

		}
		else{
			System.out.println("Luna nu corespunde.");
		}
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		System.out.println("Anul introdus: "+an);
		if(an >=1950 && an<=2017)
		{
			this.an = an;

		}
		else{
			System.out.println("Anul nu corespunde.");
		}
	}
	public void afisare()
	{
		System.out.println("Data este: "+getZi()+"/"+getLuna()+"/"+getAn());
	}

}
public class TestDate{
	public static void  main(String[] args)
	{
		Data a = new Data(1,1,1970);
		a.afisare();
		a.setLuna(12);
		a.setZi(20);
		a.setAn(2017);
		a.afisare();
		a.setAn(2020);
		a.afisare();
		
	}
}

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
