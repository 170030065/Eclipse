package Exceptions;

class Training
{
	void train()throws Exception
	{
		System.out.println(".net 0 knowledge");
		}
	void trainAllSubjects()throws Exception
	{
		specificTraining();
		System.out.println("Can theoretically");
		
	}
	void specificTraining()throws Exception
	{
		train();
		System.out.println("Only java and angular");
	}
	
}
public class Throws {
public static void main(String args[]) throws Exception
{
	Training t=new Training();
	t.train();
	t.specificTraining();
}
}
