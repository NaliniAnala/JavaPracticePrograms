package javaPractiesPrograms;

import java.util.Scanner;

public class Loop11 {

	public static void main(String[] args) {
		
		/*
		 * Write a program for factorial number
		 * 	 * Factorial of any number is the product of an integer and all the integers
		 * below it for example factorial of 4 is 4! = 4 * 3 * 2 * 1 = 24. In below code
		 * i will show you how to design Java program to find factorial, using for loop
		 * you can perform this task.
		 */
		
		int fact =1;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Number");
		String strNum = inp.nextLine();
		int num = Integer.parseInt(strNum);
		
		
		for(int i = num ;i>=1;i--)
		{
			
			fact=fact*i;
			
		}
		
		System.out.println(fact);
	
	}

}
