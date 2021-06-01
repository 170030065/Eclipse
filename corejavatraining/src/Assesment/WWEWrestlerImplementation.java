package Assesment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WWEWrestlerImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<WWE> w=new ArrayList<WWE>();
		w.add(new WWE("Randy","Orton",180));
		w.add(new WWE("Under","Taker",200));
		w.add(new WWE("Brock","lesnar",180));
		w.add(new WWE("John","cena",190));
		long c=w.stream().count();
		System.out.println("Wrestlers count :"+c);
		System.out.println("First names");
		printFirstName(w).forEach(p->System.out.println(p));
		System.out.println("First names Sort");
		sortbyFirstName(w).forEach(p->System.out.println(p.getFirstName()));
		
		
	}

	private static List<String> printFirstName(List<WWE> list) {
		// TODO Auto-generated method stub
		return list.stream().map(p->p.getFirstName()).collect(Collectors.toList());
		
	}

	private static ArrayList<WWE> sortybyFirstName(ArrayList<WWE> w) {
		// TODO Auto-generated method stub
		return null;
	}

}
