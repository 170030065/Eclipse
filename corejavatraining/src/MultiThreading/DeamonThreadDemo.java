package MultiThreading;

class Company extends Thread
{
	public void run()
	{
	for(int i=0;i<=50;i++)
	{
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
}
}
class Employee2 extends Thread
{
	public void run()
	{
	for(int i=0;i<=50;i++)
	{
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
}

}

public class DeamonThreadDemo {

	public static void main(String[] args) {
		Company c=new Company();
		Employee2 e2=new Employee2();
		
		c.setName("Company");
		e2.setName("Employee");
		
		e2.setDaemon(true);
		
		c.start();
		e2.start();
		

	}

}
