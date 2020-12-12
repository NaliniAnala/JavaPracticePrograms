package javaPractiesPrograms;

public class While3 {

	public static void main(String[] args) {
		/*
		 * Create a while loops that prints out even numbers from 1 to 13
		 * Must not include the number 13 in the output
		 * Increment by 1 example(a++)
		 * Output: 2 4 6 8 10 12
		 */
		int num =1;
		while(num<13)
		{
			if(num%2==0)
			{
				System.out.println(num);
				
			}num++;
		}
		
	}

}
