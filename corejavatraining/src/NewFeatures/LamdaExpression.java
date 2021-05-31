package NewFeatures;


interface Test
{
	void display();
}

public class LamdaExpression {

	public static void main(String[] args) {

		Test t= ()->
		{
			System.out.println("Hello");
			System.out.println("Java");
		};
		
		t.display();

		//-----------------
		
		Test t1= ()->System.out.println("Hello Single Line Body");
		
		t1.display();
	}

}


