package javaPractiesPrograms;

public class Array2 {

	public static void main(String[] args) {
		/*
		 * NOTE: Create main Method Write a program that creates an array of integers
		 * that stores the following values: 45,78, 12, 67, 55, 89, 23, 77, 88 Print
		 * only values that stored with even index including 0
		 * Hint: 45 12 55 23 88
		 */
			
		int array2[];
		array2=new int[9];
		array2[0]=45;
		array2[1]=78;
		array2[2]=12;
		array2[3]=67;
		array2[4]=55;
		array2[5]=89;
		array2[6]=23;
		array2[7]=77;
		array2[8]=88;
		
		for(int i=0;i<array2.length;i++) {
			if( i%2==0) System.out.println(array2[i]);
			
			}
		
	}

}
