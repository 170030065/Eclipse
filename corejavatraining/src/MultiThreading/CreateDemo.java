package MultiThreading;

class Employee extends Thread
{
	public void run()
	{
		System.out.println("Task of employee");	
		
	}
	
}
class Student implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


public class CreateDemo {

	public static void main(String args[])
	{
		Employee e= new Employee();
		//e.start();
		
		Student s=new Student();
		Thread t1=new Thread(s);
		t1.start();

	}
	
}
