package Exceptions;

 class ClassNotFound {
	public static void main(String args[])
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("found");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
