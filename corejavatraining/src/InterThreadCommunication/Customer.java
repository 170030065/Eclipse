package InterThreadCommunication;

public class Customer {

	int bal=5000;
	
	synchronized public int withdraw(int amt)
	{
		if(bal<amt)
		{
			System.out.println("Waiting you dont have sufficient balance");			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() +"is going to withdraw");
		
		bal-=amt;
		return bal;
	}
	
	synchronized public int deposit(int amt)
	{
		bal+=amt;
		System.out.println(Thread.currentThread().getName() + " is deposit");
		notifyAll();
		return bal;
	}
	
}
