package com.training.oops;

public class EmployeeDetails extends Employee {
	
	String email;
	String mob;
	String address;
	
	public EmployeeDetails(int id,String name,String dept,String email,String mob,String address)
	
	{
		super(id,name,dept);
		this.email=email;
		this.mob=mob;
		this.address=address;
		
		
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+email+" "+mob+" "+address;
		
	}

	
	public static void main(String[] args)
	{
		
		EmployeeDetails empd = new EmployeeDetails(100,"anu","it","a@b","123","hyd");
		
		System.out.println(empd);
	}
}
