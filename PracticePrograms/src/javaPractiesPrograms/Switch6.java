package javaPractiesPrograms;

import java.util.Scanner;

public class Switch6 {

	public static void main(String[] args) {
		/*
		 * Create main Method!!!!!!!! Scanner Class and Switch case is needed for this
		 * Assignment
		 * Write a program to input number "Input a number between 1-12" and when you
		 * input a number it should display the month using Scanner and Switch
		 * statement.
		 * case: 1 will display January
		 * case: 12 will display December
		 * Anything outside of 12 will display "Invalid"
		 */
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String number = inp.nextLine();
		int month = Integer.parseInt(number);
		 switch(month) {
		 case 1:
			 System.out.println("January");
			 break;
		 case 2:
			 System.out.println("Feberbary");
			 break;
		 case 3:
			 System.out.println("March");
			 break;
		 case 4:
			 System.out.println("April");
			 break;
		 case 5:
			 System.out.println("May");
			 break;
		 case 6:
			 System.out.println("june");
			 break;
		 case 7:
			 System.out.println("july");
			 break;
		 case 8:
			 System.out.println("August");
			 break;
		 case 9:
			 System.out.println("september");
			 break;
		 case 10:
			 System.out.println("october");
			 break;
		 case 11:
			 System.out.println("November");
			 break;
		 case 12:
			 System.out.println("December");
			 break;
			 default: System.out.println("Invalid");
		 }

	}

}
