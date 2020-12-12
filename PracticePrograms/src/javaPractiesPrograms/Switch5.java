package javaPractiesPrograms;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
		/*
		 * Prompt user with questions: "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
		 *Toyota if user enters Maserati --> carOrigin =
		 * "italian car" anything else besides those values --> carOrigin = "unknown"
		 * 
		 * The output of your program should be: Your favorite car is ___
		 */
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String carName = inp.nextLine();
		 switch(carName) {
		 case "BMW" :
			 System.out.println("carOrigin = \"german car\" ");
			 break;
		 case "Toyota" :
			 System.out.println("carOrigin = \\\" japanese car\\\"");
			 break;	 
		 case "Maserati" :
			 System.out.println(" carOrigin = \"italian car\"");
			 break;	 
			 default :
				 System.out.println(" Your favorite car is ___"+ carName);
			 
		 }
			 
		
		


	}

}
