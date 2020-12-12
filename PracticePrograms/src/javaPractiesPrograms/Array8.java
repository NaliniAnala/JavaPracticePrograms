package javaPractiesPrograms;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create Scanner class
		 * Write an array with size of 5. Use a loop to input values to the array. Then
		 * print out all the elements you have created in the first loop in reverse
		 * order.
		 * Input: 1 2 3 4 5
		 * Output: 5 4 3 2 1
		 */
		
		//Declearing Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Declearing an array
		int array[] = new int[5];
		System.out.println("Enter values");
		
		//Reading values
		for(int i =0;i<5; i++)
		{
			array[i] =sc.nextInt();
			//array[i]= array[i];
		}
		for(int i=4;i>=0;i--)
		{
			//i=i-1;
		    System.out.println(array[i]);
		}
		
		
		
		
		
		
		
		
	}

}
