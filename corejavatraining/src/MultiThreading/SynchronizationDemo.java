package MultiThreading;

class Bottle
{
	synchronized public void drink(int time)
	{
	for(int i=0;i<=time;i++)
	{
		System.out.println(Thread.currentThread().getName()+ " is drinking "+i);
	}
}
}




class DrinkingWater implements Runnable
{
     Bottle b=new Bottle();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.drink(6);
	}
	
}







public class SynchronizationDemo {
 
	public static void main(String[] args)
	{
		DrinkingWater d=new DrinkingWater();
		
		Thread anu=new Thread(d);
		Thread nikky=new Thread(d);
		
		anu.setName("Anudeep");
		nikky.setName("Nikky");
		
		anu.start();
		nikky.start();
		
	}
}
