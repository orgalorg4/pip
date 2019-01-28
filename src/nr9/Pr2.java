package nr9;

abstract class Parinte{
	Parinte()
	{
		System.out.println("1");
		print();
	}
	abstract void print();

}
class Derivata extends Parinte{
	int a = 5;
	void print() {
		System.out.println(a);
	}

}
public class Pr2 {
	public static void main(String[] args)
	{
		Derivata d1 = new Derivata(); //prima data se apeleaza clasa parinte si a=0, iar dupa clasa derivata cu a =5;
		d1.print();
	}
}

/*
 * prima data se apeleaza clasa parinte si a=0, iar dupa clasa derivata cu a =5;
 * 1 e din Parinte
*/
