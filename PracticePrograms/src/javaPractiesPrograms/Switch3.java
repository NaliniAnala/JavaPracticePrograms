package javaPractiesPrograms;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		/*
		 * // Create main method!!!!!!!!!!!! // Scanner Class and Switch case is needed
		 * for this Assignment // // Write a program using the switch statement // Let
		 * us consider the scenario regarding the born baby age // // First Output:
		 * "enter the age of the Child" // // case 1: if age is 1 print as
		 * "You can Crawl" // // case 2 : if age is 2 print as "You can Talk" // // case
		 * 3: If age is 3 print as "You can Dance" // // case 4: if age is 4 print as
		 * "You can get  Trouble" // // other than this age (1-4) it should print
		 * "I don't know how old you are" // // TODO Auto-generated method stub
		 */

	    Scanner inp = new Scanner(System.in);
	      System.out.println("enter the age of the Child");
	      String age = inp.nextLine();
	      int i = Integer.parseInt(age);
	  	switch (i) {
		  case 1:
		    System.out.println("You can Crawl");
		    break;
		  case 2:
		    System.out.println("You can Talk");
		    break;
		  case 3:
		    System.out.println("You can Dance" );
		    break;
		  case 4:
		    System.out.println( "You can get  Trouble");
		    break;
		 
		    default:System.out.println("I don't know how old you are");
	
	  	}
	

	}	}
