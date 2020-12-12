package javaPractiesPrograms;

import java.util.Scanner;

public class Strings10 {

	public static void main(String[] args) {
		/*
		 * If language is Java It should print the Java is a programming language. If
		 * language is C It should print the C is a procedural programming language If
		 * language is C++ It should print the C++ is a middle-level programming
		 * language If any other should print Doesn't match any programming language
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the language");
		String str = sc.nextLine();
		
	
		
		
		String str1 = "Java"; 
		String str2 = "C";
		String str3 = "C++";
	
		if(str.equalsIgnoreCase(str1)) {
			System.out.println("the Java is a programming language");
			}else if(str.equalsIgnoreCase(str2)) System.out.println(" the C is a procedural programming language");
		
			else if(str.equalsIgnoreCase(str3)) System.out.println(" the C++ is a middle-level programming");
			else 
			{
			System.out.println("Doesn't match any programming language");
			}
	
	}

}
