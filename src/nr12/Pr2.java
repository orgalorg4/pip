package nr12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pr2{
	public static void main(String[] args)
	{
	LocalDateTime data = LocalDateTime.now();
	DateTimeFormatter formatare = DateTimeFormatter.ofPattern("'Ziua:' dd 'Luna:' MM 'Anul:' yyyy 'Ora:' HH 'Minute:' mm ");
	String newdate = data.format(formatare);
	System.out.println(newdate);
	}
}
