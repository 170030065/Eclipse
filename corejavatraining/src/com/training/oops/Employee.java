package com.training.oops;

public class Employee {
int id;
String name;
String dept;

Employee(){}
public Employee(int id,String name,String dept)
{
	this.id=id;
	this.name=name;
	this.dept=dept;
}
public String toString()
{
	return id+"  "+name+"  "+dept;
}
/*void show()
{
	System.out.println("Emo id :"+id);
	System.out.println("Emo name :"+name);
	System.out.println("Emo dept :"+dept);
	
}*/
public static void main(String[] args) {
	Employee emp=new Employee();
	
Employee emp1=new Employee(100,"Anu","it");
System.out.println(emp);
System.out.println(emp1);


}
}
