package javaPractiesPrograms;

public class Methodoverloading108 {
	
	static void M1()
	{
		System.out.println("M1 method without parameter");
		
	}
	static void M1(int a) {
		System.out.println("M1 method with int parameter");
	}

	public static void main(String[] args) {
		/*
		 * Write program to overload static method
		 * 
		 * Create the two static method with different parameters and try to call them
		 * in main method create one method without parameter write logic as M1 method
		 * without parameter
		 * 
		 * create another method with int parameter write logic as M1 method with int
		 * parameter
		 * 
		 * output would
		 * 
		 * M1 method without parameter M1 method with int parameter
		 */

		
		M1();
		M1(10);
	
	}

}
