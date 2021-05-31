package com.training.oops;

public class Customer {
int id;
String fName;
String lName;
String account;
Customer(int id,String fName,String lName,String account){
	this.id=id;
	this.fName=fName;
	this.lName=lName;
	this.account=account;
}
void show() {
	System.out.println(id);
	System.out.println(fName);
	System.out.println(lName);
	System.out.println(account);
}

}
