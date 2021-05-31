package NewFeatures;

@FunctionalInterface
interface Calculate1
{
	void addition(int a,int b);
}

interface Calculate2
{
	int multiply(int a,int b);
}
interface Large
{
	int findLargest(int a,int b);
}

public class LamdaExpressionWithParameter {

	public static void main(String[] args) {
		
		Calculate1 c=( a, b)->System.out.println("addition :"+ (a+b));

		c.addition(3, 9);
		
		Calculate2 c2=(a,b)-> a*b;
			
		
		System.out.println("Multiplication : "+ c2.multiply(3,9));
		
		Large l=(a,b)->
		{
			if(a>b)
				return a;
			else
				return b;
		};
		System.out.println("Largest num is "+ l.findLargest(122,345));
	}

}
