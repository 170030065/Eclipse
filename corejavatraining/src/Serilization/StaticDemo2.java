package Serilization;

class Student
{
	int id;
	String name;
	static String dept;
}

public class StaticDemo2 {

	public static void main(String[] args) {
		
		Student anudeep = new Student();
		anudeep.id=5027;
		anudeep.name="Anudeep";
		//anudeep.dept="ece";
		//Student.dept=" cse ";
		

		Student nikky = new Student();
		nikky.id=502;
		nikky.name="Nikhila";
		nikky.dept="cse";
		
		System.out.println(" id "+anudeep.id +" name "+anudeep.name+" dept "+anudeep.dept);
		System.out.println(" id "+nikky.id +" name "+nikky.name+" dept "+nikky.dept);

	}

}
