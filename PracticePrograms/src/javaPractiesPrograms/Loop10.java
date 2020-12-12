package javaPractiesPrograms;

import java.util.Scanner;

public class Loop10 {

	public static void main(String[] args) {
		/*
		 * Write java program for prime number
		 * 
		 * A Prime number is a natural number greater than 1 that has no positive
		 * divisors other than 1 and itself. It means it is only divisible by 1 and
		 * itself, and it start from 2. The smallest prime number is 2. Here i will show
		 * you how to write this program. You can also download below code nad extract
		 * file, after extract file you can easily run the program.
		 */   
		boolean isPrime = true;
		int mod=0;
	
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Number");
		String strNum = inp.nextLine();
		int num = Integer.parseInt(strNum);
		   
		for(int counter=2;counter<=num-1;counter++)
		{
			mod = num%counter;
			if(mod==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime == true) System.out.println(num+" is a Prime Number!!!");
		else System.out.println(num+" is not a Number!!!");
		
		
	}
}
