package javaPractiesPrograms;

public class Methods17 {
	public String mixString(String s1 ,String s2)
	{
		String resultString="";
		
		// Get each character from both strings and add it to result string. 
		
		for(int i=0;i<s1.length();i++)
		{
			resultString = resultString+s1.charAt(i)+s2.charAt(i);	
		}
		
		
		return resultString;
	}
	
	public static void main(String[] args) {
		/*
		 * Write a method header on line two with the following specs:
		 * 
		 * Returns: a String Method Name: mixString Parameters: a String called s1 a
		 * String called s2
		 * 
		 * Then, starting on line 4, write code that will return the strings combined,
		 * one letter at a time, starting with s1. See example below for an example. You
		 * can assume that s1 and s2 are equal lengths: s1 ==> "12345" s2 ==> "abcde"
		 * mixString(s1,s2) ==> "1a2b3c4d5e"
		 */

		Methods17 m1 =new Methods17();
		System.out.println(m1.mixString("12345", "abcde"));
	
	
	}

}
