package mypracties;

import java.util.Scanner;

public class MarksPercentageCal 
{

	public static void main(String s[])
	{
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter English Marks: ");
		        int english = scan.nextInt();
		       
		
		//int eng = scan,sub2=90,sub3=89;
		        
		        
		        System.out.print("Enter Maths Marks: ");
		        int maths = scan.nextInt();
		    
		        System.out.print("Enter Computers Marks: ");
		        int computers = scan.nextInt();
		    
		        
		        float avg;
		        int total;
			
		if(english >= 35 && maths >= 35 && computers >= 35)			
		{
			System.out.println("PASS");
			
			   total = (maths+english+computers);
			   avg = total/3;
			   System.out.println(avg);
			        
				if( avg>= 75 )
				{
					System.out.println("First");
				} else if( avg>= 50 )
				{
					System.out.println("second");
				}else if( avg>=30 )
				{
					System.out.println("third");
				}
				
				
			
		}
		else
			System.out.println("FAIL");

	
	}
	

}
