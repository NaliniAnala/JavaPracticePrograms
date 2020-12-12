package javaPractiesPrograms;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Note: Create a Scanner Class Create an int array with the size of 5 and input
		 * values with Scanner. Print out each element of the array multiplied by ten,
		 * one element per line. Create a loop and enter values into one loop, the
		 * second loop print the values and it must be multiplied by 10.
		 * Input: 1 2 3 4 5
		 * Output 10 20 30 40 50
		 */
		
		//declear a Scanner Class
		Scanner sc = new Scanner(System.in);
		 
		int[] array = new int[5];
		System.out.println("enter values");
	//read array
	
	for(int i=0;i<5;i++)
	{
		//System.out.println("enter values");
		array[i] =sc.nextInt();
		array[i]= array[i]*10;
	}
	
	// Print  array Variable. 
	for(int i=0;i<5;i++)
	{
		
	    System.out.println(array[i]);
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
