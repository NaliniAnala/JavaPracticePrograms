package javaPractiesPrograms;

public class String5 {

	public static void main(String[] args) {

		/*
		 * Validate if the string ends with "u" prints the Boolean value accordingly
		 * Validate if the string ends with "world" prints the Boolean value accordingly
		 * Validate if the string ends with "are" prints the Boolean value accordingly
		 * Validate if the string ends with "you" prints the Boolean value accordingly
		 * 
		 * output true false false true
		 */
		
	  String str1 = new String("u world are you");
	     
	       boolean var1 = str1.endsWith("you");
	       boolean var2 = str1.endsWith("world");
	       boolean var3 = str1.endsWith("are");
	       boolean var4 = str1.endsWith("you");
	       System.out.println(var1);
	       System.out.println(var2);
	       System.out.println(var3);
	       System.out.println(var4);
		
		
	}

}
