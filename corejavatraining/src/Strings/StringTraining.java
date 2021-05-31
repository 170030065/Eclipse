package Strings;

public class StringTraining {
 
	
	public static void main(String args[])
	{
		String s1=new String("Value Momentum");
		String s2=new String("Value Momentum");
		String s3="Value Momentum";
		String s4="Value Momentum";
	/*System.out.println(s2 == s3);
	System.out.println(s2.equals(s3));*/
		s1=s1.concat("Anudeep");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.intern()==s2.intern());
		String s5="Anu";
		String s6="AnUdeep";
		System.out.println(s6.compareTo(s5));
		System.out.println(s6.compareToIgnoreCase(s5));
		StringBuilder sb=new StringBuilder("xyz");
		sb.append("abc");
		System.out.println(sb);
		
		StringBuffer sbf=new StringBuffer("anu");
		sbf.append("deep");
		System.out.println(sbf);
	}
}