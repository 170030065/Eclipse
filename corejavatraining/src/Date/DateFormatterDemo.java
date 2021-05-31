package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.LocalDateTime;


public class DateFormatterDemo {

	public static void main(String args[])
	{
		LocalDate today=LocalDate.now();
		System.out.println("Today: "+today);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyyy MM dd");
		
		DateTimeFormatter dtfull=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtmedium=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtshort=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		String afterFormat =today.format(dtf);
	    System.out.println("Date after Format "+afterFormat);
	    
	    String afterFormat2 =today.format(dtf2);
	    System.out.println("Date after Format "+afterFormat2);
	    
	    String fulldate=today.format(dtfull);
	    System.out.println("full date "+fulldate);
	    
	    String mediumdate=today.format(dtmedium);
	    System.out.println("Medium date "+mediumdate);
	    
	    String shortdate=today.format(dtshort);
	    System.out.println("Short date "+shortdate);
	}
	
}
