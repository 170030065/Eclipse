package Assesment;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount sa = new SavingsAccount(1000, 0.10);
		sa.withdraw(250);
		sa.deposit(400);
		sa.addInterest();
		System.out.println(sa.getBalance());
		System.out.println("Expected: 1265.0");
	}

}
