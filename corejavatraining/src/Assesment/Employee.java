package Assesment;

public class Employee {
	private String firstName;
    private String lastName;
    Employee(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    void validation () throws Exception
    {
        if(firstName==null && lastName==null)
        {
            throw new NullPointerException("Entry Missing");
        }
        
        else if(firstName.length()<3 && lastName.length()<3)
        {
            throw new Exception("name should be minimum 3 character");
        }
    }
}
