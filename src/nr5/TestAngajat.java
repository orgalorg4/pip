package nr5; //pr2

class Angajat {
	private String nume;
	private String prenume;
	private double salariu;
	
	public Angajat(String nume, String prenume, double salariu) {

		this.nume = nume;
		this.prenume = prenume;
		this.salariu = salariu;
	}
	public String getNume() {
		return nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public double getSalariu() {
		return salariu;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setSalariu(double salariu) {
		if(salariu <0.0)
		{
			this.salariu=0.0;
		}
		else
		{
			this.salariu = salariu;
		}

	}

}
public class TestAngajat {
	public static void main(String [] args)
	{
	Angajat a = new Angajat("Popescu","Ion",1000.0);
	Angajat b = new Angajat("Muncitoru","Gheorghe",2000.0);
	double venit1 = a.getSalariu()*12;
	double venit2 = b.getSalariu()*12;
	
	System.out.println("Venit anual pentru primul angajat este: "+venit1);
	System.out.println("Venit anual pentru al doilea angajat este: "+venit2);
	
	a.setSalariu(a.getSalariu()*1.1);
	b.setSalariu(b.getSalariu()*1.1);
	
	System.out.println("Venitul anual pentru primul angajat, dupa o crestere cu 10%/luna este: "+a.getSalariu()*12);
	System.out.println("Venitul anual pentru al doilea angajat, dupa o crestere cu 10%/luna este: "+b.getSalariu()*12);


	}
}

