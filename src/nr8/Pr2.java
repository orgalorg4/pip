package nr8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pr2 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader citire = new BufferedReader(new FileReader("src/nr8/in.txt"));
		String str1, str2 = "";
		while((str1 = citire.readLine()) != null)
		{
			str2 += str1+"\n";
		}
		
		String str3 = str2.toLowerCase();
		PrintWriter scriere = new PrintWriter(new BufferedWriter(new FileWriter("src/nr8/out.txt")));
		scriere.println(str3);
		scriere.close();
		citire.close();
		str2 = "";
		BufferedReader scriere1 = new BufferedReader(new FileReader("src/nr8/out.txt"));
		while((str1 = scriere1.readLine()) != null)
		{
			str2 += str1+"\n";
		}
		System.out.println(str2);
		scriere1.close();  }
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
