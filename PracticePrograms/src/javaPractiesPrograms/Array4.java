package javaPractiesPrograms;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
	
		/*
		 * Note: Create a main Method, and also use a Scanner Class Write a program that
		 * creates an array of strings with the size being 7. Ask the user to input Days
		 * of a week beginning with Sunday. Add these inputs to your array and then
		 * print all values from that array
		 
		 * Hint:
		 * Please enter day 1 of the week Sunday Please enter day 2 of the week Monday
		 * Please enter day 3 of the week Tuesday Please enter day 4 of the week
		 * Wednesday Please enter day 5 of the week Thursday Please enter day 6 of the
		 * week Friday Please enter day 7 of the week Saturday
		 */
		
		
		Scanner sc = new Scanner(System.in);
	
	    // Declare Array to store days of a week
		String[] days =new String[7];
		
		// Read Days of a week from console and store in days array variable. 
		for(int i=0;i<=6;i++)
		{
			
			    System.out.println("Please enter day "+ (i+1) +" of the week");
			    days[i]=sc.nextLine();
			       
		}
		
		
		
		// Print Days of a week to console from days array Variable. 
		for(int i=0;i<=6;i++)
		{
			
		    System.out.println(days[i]);
		}
	
	
	}

}
