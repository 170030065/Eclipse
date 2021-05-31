package NewFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {
	
	List sortList(ArrayList<Integer> list)
	{
		return list.stream().sorted().collect(Collectors.toList());
	}

	public static void main(String[] args)
	{
		
		ArrayList<Integer> n=new ArrayList<Integer>();
		n.add(900);
		n.add(186);
		n.add(888);
		n.add(792);
		n.add(509);
		
		n.forEach(System.out::println);
		
		System.out.println("==Sort==");
		
		n.stream().sorted().forEach(System.out::println);
		
		StreamSorting sort=new StreamSorting();
		
		System.out.println("Sorting :"+sort.sortList(n));
		
		System.out.println("=====Sorting in reverse order====");
		
		n.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
		
	}
}
