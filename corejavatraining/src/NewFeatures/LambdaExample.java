package NewFeatures;

@FunctionalInterface
interface Sayable{
	String say(String message);
}

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Sayable person = (message)-> {  
	            String str1 = "I would like to say, ";  
	            String str2 = str1 + message;   
	            return str2;  
	        };  
	            System.out.println(person.say("time is precious."));  
	    
	 

	}

}
