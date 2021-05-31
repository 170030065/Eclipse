package Concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;



public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		hm.put("Anudeep", 14);
		hm.put("Andy", 12);

		hm.put("Anu", 19);
		
		System.out.println("Elements "+hm);
		
		for(Integer val:hm.values())
		{
			System.out.println(val);
			
			hm.put("kanna", 99);
		}
		System.out.println("Elements "+hm);
	}
	

}
