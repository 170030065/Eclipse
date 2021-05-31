package Exceptions;

public class LBETest {
public static void main(String args[])
{
	int bal=900;
	
	try {
		
		if(bal<1000)
		{
			throw new LowBalanceException("<1000");
		}
	}
	catch(LowBalanceException e)
	{
		e.printStackTrace();
	}
}
}
