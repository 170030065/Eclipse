package NewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer> n=new ArrayList<Integer>();
		n.add(2);
		n.add(3);
		n.add(5);
		n.add(8);
		n.add(1);
		
		System.out.println("Numbers :"+n);
		
		n.forEach(a->System.out.println(a));
		
		n.forEach(System.out::print);
		
		long count=n.stream().count();
		System.out.println("\nTotal element present in stream "+count);
	
		System.out.println("Numbers >2");
	    n.stream().filter(a->a>2).forEach(a->System.out.println(a));
	    
	    System.out.println("==Map==");
	    n.stream().map(a->a+100).forEach(a->System.out.println(a));
	}
	

}
