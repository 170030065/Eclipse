package NewFeatures;



interface Validate
{
	void validateLogin();
}

class Car
{
	void myLogin()
	{
		System.out.println("can login using uname and pass");
	}
}
class Bus
{
	static void login()
	{
		System.out.println("This is login");
	}
}
public class MethodreferenceDemo {

	public static void main(String[] args)
	{
		Validate v=()->System.out.println("Login Validation");
		v.validateLogin();
		
		Car c=new Car();
		Validate v1=c::myLogin;
		v1.validateLogin();
		
		Validate v2=Bus::login;
		v2.validateLogin();
	}
}
