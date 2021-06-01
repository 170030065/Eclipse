package Assesment;

public class WordCharacterCount {

	public static void main(String[] args) {  
        String s = "Hello";  
        int wc = 0,cc=0;
          
        for(int i = 0; i < s.length()-1; i++) {  
           
            if(s.charAt(i) == ' ' && Character.isLetter(s.charAt(i+1)) && (i > 0)) {  
                wc++;  
           
            }  
            
        }  
         
        wc++;  
        for(int i = 0; i < s.length(); i++) {    
            if(s.charAt(i) != ' ')    
                cc++;    
        }    
          
       
        System.out.println("Total number of words in the given string: " + wc);  
        System.out.println("Total number of characters in the given string: " + cc); 
    }  
}
