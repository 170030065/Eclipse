package Exceptions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CheckedException {
public static void main(String[] args)
{
	//System.out.println();
	
	try
	{
		int[] i= {1,2};
		System.out.println(i[2]);
		Connection con=DriverManager.getConnection("","","");
	} catch (Exception e) {
		//System.out.println(e);
		e.printStackTrace();
		
	}
}
}
