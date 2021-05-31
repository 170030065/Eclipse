package NewFeatures;

interface Bank
{
	default void openAccount()
	{
		System.out.println("Can open account");
		
		
	}
	static void holiday()
	{
		System.out.println("Holiday on 2 and 4 sat");
	}
	abstract int rateOfInterest(int interest);
	abstract int minBalance(int amount);
}
class Axis implements Bank
{

	@Override
	public int rateOfInterest(int interest) {
		// TODO Auto-generated method stub
		return interest;
	}

	@Override
	public int minBalance(int amount) {
		// TODO Auto-generated method stub
		return amount;
	}
	
}






public class NewInterfaceDemo {

	public static void main(String[] args) {
		
		Bank bank=new Axis();
		bank.openAccount();
		System.out.println("min balance :"+bank.minBalance(1000));
		System.out.println("interest rate :"+bank.rateOfInterest(4));
		Bank.holiday();
	}

}
