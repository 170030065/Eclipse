package NewFeatures;

import java.util.ArrayList;


public class ProductStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> p=new ArrayList<Product>();
		p.add(new Product(1,"Sunglasses","Accessories",2000,3));
		p.add(new Product(2,"Watches","Accessories",15000,1));
		p.add(new Product(3,"Television","Electronics",35000,1));
		p.add(new Product(4,"Footwear","Mensfashion",500,4));
		p.add(new Product(5,"Ring","Jewellery",5000,2));
		p.add(new Product(6,"Chocolates","Food",100,5));
		
		p.forEach(System.out::println);
		
		System.out.println("==Count==");
		long pc=p.stream().count();
		System.out.println("total products "+ pc);
		
		System.out.println("==Price >4000==");
		long prabove=p.stream().filter(s->s.getPprice()>4000).count();
		System.out.println("Price greater than 4000 count "+prabove);
		
		System.out.println("==Electronics Category==");
		p.stream().filter(s->s.getPcategory().equalsIgnoreCase("Electronics")).forEach(System.out::println);
		
		System.out.println("==Product to Uppercase==");
		p.stream().map(s -> s.getPname().toUpperCase()).forEach(System.out::println);
		
		System.out.println("==Count of a product by category==");
		long ccount=p.stream().filter(s->s.getPcategory()=="Accessories").count();
		System.out.println("Accessories count "+ccount);
		
		
		
	}

}
