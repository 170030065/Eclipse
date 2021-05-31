package Serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {

	public static void main(String args[]) throws IOException
	{
		Employee e=new Employee(1,"Anudeep");
		
		FileOutputStream fis=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		
		System.out.println("Done");
		}
}
