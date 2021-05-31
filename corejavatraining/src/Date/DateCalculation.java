package Date;

import java.time.LocalDate;

public class DateCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today =LocalDate.now();
		System.out.println("date ="+today);
		System.out.println("date ="+today.plusDays(1));
		System.out.println("date ="+today.plusWeeks(2));
		System.out.println("date ="+today.plusMonths(1));
		System.out.println("date ="+today.plusYears(1));
		
		LocalDate bookingDate= LocalDate.of(2021, 05 ,30);
		if(bookingDate.isAfter(today)) {
			System.out.println("correct date you can book");
		}
		else {
			System.out.println("invalid date booking");
		}
		
	}

}

