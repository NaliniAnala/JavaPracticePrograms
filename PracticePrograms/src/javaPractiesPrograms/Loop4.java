package javaPractiesPrograms;

public class Loop4 {

	public static void main(String[] args) {
		/*
		 * Write a program that use for loop to print multiples of 3 between 1 and 20.
		 * 
		 * Must not include the number 20 in the output
		 */ 

		/*Hint :
		3*1=3 
		3*2=6
		3*3=9
		3*4=12
		3*5=15
		3*6=18

		Output:
		3
		6
		9
		12
		15
		18*/
	
		int num= 3;
		int i=2;
		int result=3;
	
		while(result<20)
		{
			System.out.println(result);
			result =num*i;
			i++;
		} 
	
	}
		
		

	

}
