package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class ArrayTest  {
	public static void main(String args[])
	{
		/*int[] ar=new int[5];
		int[] a= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		HashSet arr=new HashSet();
		arr.add("Anu");
		arr.add("deep");
		arr.add("java");
		arr.add("eclipse");
		arr.add(10);
		arr.add(10.90);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
		//arr.add(2,"vam");
		System.out.println(arr);
		System.out.println(arr.contains("vam"));
		//System.out.println(arr.get(3));
	}

}
