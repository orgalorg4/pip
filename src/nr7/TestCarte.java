package nr7;

class Carte{
	String nume_Carte;
	String nume_Autor;
	String nume_Editura;
	
	public Carte(String nume_Carte, String nume_Autor, String nume_Editura) {
		this.nume_Carte = nume_Carte;
		this.nume_Autor = nume_Autor;
		this.nume_Editura = nume_Editura;
	}
	public String getNume_Carte() {
		return nume_Carte;
	}
	public void setNume_Carte(String nume_Carte) {
		this.nume_Carte = nume_Carte;
	}
	public String getNume_Autor() {
		return nume_Autor;
	}
	public void setNume_Autor(String nume_Autor) {
		this.nume_Autor = nume_Autor;
	}
	public String getNume_Editura() {
		return nume_Editura;
	}
	public void setNume_Editura(String nume_Editura) {
		this.nume_Editura = nume_Editura;
	}

	public String getBookinfo()
	{
		String info = ("Nume carte: "+ getNume_Carte()+ 
				"; Nume Autor: "+getNume_Autor()+"; Nume Editura: "+getNume_Editura());
		return info;
	}
}

public class TestCarte {
	public static void main(String[] args)
	{
		Carte [] vct = new Carte[5];
		for(int i=0;i<5;i++)
			vct[i]=new Carte("Carte"+i, "Autor_"+i, "Editura_"+i);
		
		for(int i=0;i<vct.length;i++)
		{
			System.out.println(vct[i].getBookinfo());
		}
		vct[0].setNume_Carte("CarteNoua");
		vct[0].setNume_Autor("AutorNou");
		vct[0].setNume_Editura("Editura 'Nou'");
		System.out.println("*****");
		System.out.println(vct[0].getBookinfo());
	}
}

