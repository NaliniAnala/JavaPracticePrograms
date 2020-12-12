package javaPractiesPrograms;

import java.util.Scanner;

public class While7 {

	public static void main(String[] args) {
		/*
		 * Write a java program using the While Loop for reverse of the number
		 * Reverse number means reverse the position of all digits of any number. For
		 * example reverse of 839 is 938. For this program you need modulus operator
		 * concept and while loop, while loop is used for check condition and modulus
		 * used for find the remainder.
		 */

		int r=0 ;
		int num=0;
		int rev=0;
		int a;
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter any no.: ");
		  int number = s.nextInt();
		  while(number!=0)
		  {
			  r = number% 10;
			 number = number/10;
			 rev = rev *10+r;
		  }
		  System.out.println(rev);
		
	}

}
