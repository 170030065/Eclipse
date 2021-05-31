package Collections;
import java.util.*;

class Employee{
	int id;
	String name;
	String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}

class EmployeeD extends Employee{
	String address;
	String pan;
	public EmployeeD(int id, String name, String dept, String address, String pan) {
		super(id, name, dept);
		this.address = address;
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "EmployeeD [address=" + address + ", pan=" + pan + "]";
	}
	
}
public class SetTest {

	public static void main(String args[])
	{
		
		HashMap hm=new HashMap<>();
		hm.put(5720, "Anudeep");
 	}
}
