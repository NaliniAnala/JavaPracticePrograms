package javaPractiesPrograms;

public class Methods14 {

	public char getChar(String word , int index)
	{
	    return word.charAt(index);
	}
	
	public static void main(String[] args) {
		/*
		 * Write a method header on line two with the following specs:
		 * Returns: a char Method Name: getChar Parameters: a String called "word" an
		 * integer called "index"
		 * Then, starting on line 4, write code that will return the character in "word"
		 * at the index "index"
		 * Examples: getChar("hello",1) ==> 'e'
		 */
		
		Methods14 a = new Methods14();
		char wi=a.getChar("hello", 1);
	
		System.out.println(wi);
	
	
	}

}
