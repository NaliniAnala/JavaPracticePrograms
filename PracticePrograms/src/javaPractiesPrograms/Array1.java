package javaPractiesPrograms;

public class Array1 {
	/*
	 * NOTE: Create main Method Write a program that creates an array of integers
	 * that stores the following values:45,78, 12, 67, 55 and then prints al its
	 * values
	 * 45 78 12 67 55
	 */
	
	public static void main(String[] args) {
		  int[] array1; //declaring the array
			array1=new int[5]; //instantiation
			array1[0]=45;
			array1[1]=78;
			array1[2]=12;
			array1[3]=67;
			array1[4]=55;
		
			for(int i=0;i<array1.length;i++) {
	  System.out.println(array1[i]);

			}

	}

}
