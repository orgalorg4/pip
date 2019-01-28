package nr4;

public class Pr2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("N\t10*N\t100*N\t1000*N\n");
		int N;
		for(int i = 1;i<=5;i++)
		{
			N=i;
			for(int j=1;j<=4;j++)
			{
				System.out.print(N+"\t");
				N*=10;
			}
			System.out.println();
		}
	}

}
