package Date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		LocalDate joiningDate=LocalDate.of(1999, 12, 14);
		
		Period period=Period.between(joiningDate, today);
		System.out.println("Year :"+period.getYears() +" month "+period.getMonths()+" day "+period.getDays());

	}

}
