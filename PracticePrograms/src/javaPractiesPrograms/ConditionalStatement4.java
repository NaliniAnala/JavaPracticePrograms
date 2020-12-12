package javaPractiesPrograms;

import java.util.*;
import java.util.Scanner;
public class ConditionalStatement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter your age");
		 Scanner sc = new Scanner(System.in);
		 String str=sc.nextLine();
		 int age = Integer.parseInt(str);
		 
			   // System.out.println("Please enter your age");
			    	if(age>= 18)
			    	{
			    		System.out.println("You are eligible to vote");
			    	}else if(age<=18)
			    		{
			          System.out.println("You are not eligible to vote");
			 
			    		}
		
	}
}



		
		
		
		
		
		
		
		
		
		
		
		
		


