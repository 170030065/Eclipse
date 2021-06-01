package Assesment;

import java.util.Scanner;

public class EmpTest {

	 public static void main(String arg[])
	    {
	        Scanner sc=new Scanner(System.in);
	        Employee ee=new Employee(sc.next(),sc.next());
	        try
	        {
	        ee.validation();
	        }
	        catch(Exception ee1)
	        {
	            System.out.println(ee1.getMessage());
	        }
	    }
}
