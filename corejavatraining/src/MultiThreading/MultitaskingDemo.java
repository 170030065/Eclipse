package MultiThreading;

class Anudeep extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			//System.out.println("Anudeep "+i);
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}
class Nikky extends Thread
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			System.out.println(Thread.currentThread().getName());

		}
	}
}
class Annu extends Thread
{
	public void run()
	{
		for(int i=30;i<=40;i++)
		{
			//System.out.println("Annu "+i);
			System.out.println(Thread.currentThread().getName());

		}
	}
}


public class MultitaskingDemo {

	public static void main(String[] args)
	{
		Anudeep a=new Anudeep();
		Nikky n=new Nikky();
		Annu a1=new Annu();
		
		/*a.run();
		n.run();
		a1.run();*/
		a.setName("Anudeep");
		n.setName("Nikky");
		a1.setName("Annu");
		
		a.start();
		n.start();
		a1.start();
		
	}
}
