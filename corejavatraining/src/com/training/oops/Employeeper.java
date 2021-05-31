package com.training.oops;

public class Employeeper extends EmployeeDetails {
	String na;
	public Employeeper(int id,String name,String dept,String email,String mob,String address,String na)
	{
		super(id,name,dept,email,mob,address);
		this.na=na;
	}
	@Override
	public String toString() {
		return "Employeeper [na=" + na + ", email=" + email + ", mob=" + mob + ", address=" + address + ", id=" + id
				+ ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
	

}
