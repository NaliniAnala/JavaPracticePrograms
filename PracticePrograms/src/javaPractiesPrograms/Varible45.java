package javaPractiesPrograms;

public class Varible45 {
	 static String ss ="Welcome To AccentechPartners";

	public static void main(String[] args) {
		/*
		 * Declare the static variable in the Main class as static String
		 * ss="Welcome To AccentechPartners" and call the static variable in main method
		 * You need to call the static variable in three different ways first way : By
		 * calling directly Second way: By using the className Third way: By creating
		 * the object of the class
		 * Output: Welcome To AccentechPartners Welcome To AccentechPartners Welcome To
		 * AccentechPartners
		 */
		
		//creating  the object of the class 
		Varible45 msg = new Varible45();
		System.out.println(msg.ss);
		//calling directly
		System.out.println(ss);
		//using the className
		System.out.println(Varible45.ss);
		
		
		
		
		
		
		
		
		
		
		
	}

}
