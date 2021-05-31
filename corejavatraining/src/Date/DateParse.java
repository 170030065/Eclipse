package Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		LocalDate today = LocalDate.now();
		System.out.println("Enter your DOB: ");
		String str = sc.nextLine();
		LocalDate date = LocalDate.parse(str);
		
		Period period = Period.between(date, today);
		System.out.println("year: "+period.getYears() +", month: "+period.getMonths() +", days: "+period.getDays());;
	}

}
