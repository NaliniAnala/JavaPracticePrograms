package javaPractiesPrograms;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array with the following values{s, a, y, b,
		 * n, c, t, d, a, e, x} and prints the values starting at index 0 and multiple
		 * of 2 using a for loop.
		 * Hint: syntax
		 */
		//char array[];
		//array=new char[11];
		char[] array=  {'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
		for(int i=0;i<=array.length;i++)
		{
			if(i%2==0)
			System.out.print(array[i]);
		}
		
		
		
	}

}
