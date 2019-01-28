package nr10; //pr2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class UseStiva {
	public static void main(String[] args) throws IOException
	{
		Stack<Integer> stiva = new Stack<>();
		int ok=1;
		System.out.println("Introduceti valori in stiva: ");
		while(ok != 0)
		{
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			ok = Integer.parseInt(read.readLine());
			if(ok!=0){
				stiva.push(ok);}
		}
		System.out.println("Afisare valori extrase din stiva");
		while(!stiva.isEmpty())
		{
			
			System.out.println(stiva.pop());	
		}
	}
}
