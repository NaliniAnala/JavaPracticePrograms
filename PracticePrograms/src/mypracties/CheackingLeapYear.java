package mypracties;

import java.util.Scanner;

public class CheackingLeapYear {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/* If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
		 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
		 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
		 4. The year is a leap year (it has 366 days).
		 5. The year is not a leap year (it has 365 days). Source of these steps.*/
		
		 	Scanner scan = new Scanner(System.in);
		 	System.out.print("Enter The Year: ");
	        int year = scan.nextInt();
	        scan.close();
	        boolean isLeap = false;
	        
	        if(year%4 ==0)
	        {
	        	if(year % 100 == 0)
	        	{
	        		if(year % 400 == 0) 
	        		{
	        			isLeap = true;
	        		}
	        		else isLeap = false;
	        	}
        		else isLeap = true;
	        }
	        else
	        {
	         isLeap = false;
	        }
	        	
	        if(isLeap == true)
        		System.out.println("the year is leap" +year);
        	else
        		System.out.println("not a leap year" +year);

		
	}

	}
