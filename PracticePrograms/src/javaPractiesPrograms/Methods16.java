package javaPractiesPrograms;

public class Methods16 {

	public String makeThreeSubstr(String word , int startIndex , int endIndex)
	{
			return word.substring(startIndex, endIndex);

	}
	public static void main(String[] args) {
		/*
		 * Write a method header on line two with the following specs:
		 * 
		 * Returns: a String Method Name: makeThreeSubstr Parameters: a String called
		 * "word" an integer called "startIndex" an integer called "endIndex"
		 * Then, starting on line 4, write code that will return 3x the substring (no
		 * spaces) from "startIndex" to "endIndex"
		 * Examples: makeThreeSubstr("hello",0,2) ==> "hehehe"
		 * makeThreeSubstr("shenanigans",3,7) ==> "naninaninani"
		 */
	
		Methods16 name = new Methods16();
		String name1 = name.makeThreeSubstr("hello",0, 2);
		
		System.out.print(name1);	
		System.out.print(name1);	
		System.out.print(name1);	
	}

}
