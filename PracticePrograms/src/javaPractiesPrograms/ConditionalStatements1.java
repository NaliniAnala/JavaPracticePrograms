
/* The variable "num" holds an integer user input
Write a conditional statement starting on line 9 that does the following:
If num is positive, print "__ is positive"
If num is negative, print "__ is negative"
Examples:
In: 5
5 is positive
In: -2
-2 is negative
In: 0*/

package javaPractiesPrograms;
import java.util.Scanner;

import java.util.*;

public class ConditionalStatements1 {

	public static void main(String[] args) {
		
		

		  	Scanner inp = new Scanner(System.in);
		  	System.out.print("In:");
		  	String num = inp.next();
		 	int i = Integer.parseInt(num);
		  	System.out.print("Enter Num");
		  	
		    if(i ==5)
		  {
		    System.out.println(" 5 is positive");
		    
		    
		  }  if(i ==-2)
		  	{
		  	   System.out.println(" -2 is negative");
		  	}
		  	
		  	
		  
		}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
