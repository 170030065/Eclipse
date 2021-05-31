package Serilization;

public class StaticDemo {
	static
	{
		System.out.println("This is static1");
	}

	public static void main(String[] args) {
		System.out.println("This is main");
	}
	static
	{
		System.out.println("This is static2");

	}

}
