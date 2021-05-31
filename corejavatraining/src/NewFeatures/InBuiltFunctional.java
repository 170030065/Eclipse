package NewFeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class InBuiltFunctional {

	public static void main(String[] args) {

		Predicate<Integer> p=(var1)->var1>2;
		
		System.out.println(p.test(3));
		

		Predicate<String> p2 =(v1)->v1.startsWith("a");
		System.out.println(p2.test("anudeep"));
	

		Function <String, String> f1=(var)->var.concat("Hi");
		//f1.apply("Anudeep");
		System.out.println(f1.apply("Anudeep "));
		

		//Function <String, Integer> f2=(var)->var.concat("Hi");
		//f1.apply("Anudeep");
		//System.out.println(f2.apply("Anudeep "));
	}

}
