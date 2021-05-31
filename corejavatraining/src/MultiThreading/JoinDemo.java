package MultiThreading;

class ProjectCall extends Thread
{
	public void run()
	{
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName());
	}
  
	}
	
}

class WorkingOnProject extends Thread
{
	public void run()
	{
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName());
	}
}
}

class Presentation extends Thread
{
	public void run()
	{
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName());
	}
}
}

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException
	{
		ProjectCall pc=new ProjectCall();
		WorkingOnProject wop=new WorkingOnProject();
		Presentation p=new Presentation();
		
		pc.setName("PC Call");
		wop.setName("Working");
		p.setName("Presenting");
		
		pc.start();
		pc.join();
		
		wop.start();
		

	}
}
	

