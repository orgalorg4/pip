package nr11; //pr2

class Autovehicul{
	int viteza;
	double PretCatalog;
	String culoare;
	double getPretVanzare() 
	{
		return PretCatalog;
	}
	public Autovehicul(int viteza, double pretCatalog, String culoare) {

		this.viteza = viteza;
		PretCatalog = pretCatalog;
		this.culoare = culoare;
	}

}
class Camion extends Autovehicul{
	int greutate;
	double getPretVanzare(){
		if(greutate >2000)
		{
			return 0.9*PretCatalog;
		}
		else
			return 0.8*PretCatalog;
	}
	public Camion(int viteza, double pretCatalog, String culoare, int greutate) {
		super(viteza, pretCatalog, culoare);
		this.greutate = greutate;
	}
}
class Ford extends Autovehicul{
	int an_fabricatie;
	int ReducereFabricant;
	double getPretVanzare(){
		return PretCatalog-ReducereFabricant;

	}
	public Ford(int viteza, double pretCatalog, String culoare, int an_fabricatie, int reducereFabricant) {
		super(viteza, pretCatalog, culoare);
		this.an_fabricatie = an_fabricatie;
		ReducereFabricant = reducereFabricant;
	}
}
public class DealerAuto {
	public static void main(String [] args)
	{
		Camion c1 = new Camion(100,1200.0,"verde",4800);
		Camion c2 = new Camion(80,1600.0,"rosu",7500);
		Ford f1 = new Ford(90,1500.0,"alb",2000,10);
		Ford f2 = new Ford(80,1000.0,"alb",2002,10);
		System.out.println("Camionul 1 are: "+"Viteza"+c1.viteza+" Pret Catalog: "+c1.PretCatalog+" Culoare: "+c1.culoare+" Greutate: "+c1.greutate);
		System.out.println("Camionul 2 are: "+"Viteza"+c2.viteza+" Pret Catalog: "+c2.PretCatalog+" Culoare: "+c2.culoare+" Greutate: "+c2.greutate);	
		System.out.println("Ford 1 are: "+"Viteza"+f1.viteza+" Pret Catalog: "+f1.PretCatalog+" Culoare: "+f1.culoare+" An Fabricatie:"+f1.an_fabricatie+" Reducere Fabricant:"+f1.ReducereFabricant);
		System.out.println("Ford 2 are: "+"Viteza"+f2.viteza+" Pret Catalog: "+f2.PretCatalog+" Culoare: "+f2.culoare+" An Fabricatie:"+f2.an_fabricatie+" Reducere Fabricant:"+f2.ReducereFabricant);
		System.out.println("Pret vanzare camion 1: "+c1.getPretVanzare());
		System.out.println("Pret vanzare camion 2: "+c2.getPretVanzare());
		System.out.println("Pret vanzare Ford 1: "+f1.getPretVanzare());
		System.out.println("Pret vanzare Ford 2: "+f2.getPretVanzare());
	}
}
