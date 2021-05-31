package com.training.oops;

public class Test 
{
public static void main(String[] args)
{
	Customer customer1=new Customer(100,"abc","xyza","current1");
	Customer customer2=new Customer(200,"abcd","xyzb","current2");
	Customer customer3=new Customer(300,"abcde","xyzc","current3");
	Customer customer4=new Customer(400,"abcdef","xyzd","current4");

	customer1.show();
	customer2.show();
	customer3.show();
	customer4.show();

	
}
}
