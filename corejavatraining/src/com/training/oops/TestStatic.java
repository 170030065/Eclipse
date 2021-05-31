package com.training.oops;
class A
{
	static int i=1;
	A(){
		i++;
		
	}
	static void disp() {
		System.out.println(i);
	}
}
public class TestStatic {
public static void main(String[] args) {
	A a1= new A();
	A.disp();
}

}
