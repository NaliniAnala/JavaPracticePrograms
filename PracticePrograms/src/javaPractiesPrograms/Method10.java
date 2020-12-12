package javaPractiesPrograms;

public class Method10 {

	public void m1(int a,String s)
	{
		System.out.print(a);
		System.out.print(s);
		
	}
	public void m1(double d , float f)
	{
		System.out.print(f);
		System.out.print(d);

		
	}
	
	public static void main(String[] args) {
		
		/*
		 * create multiple methods with same name but should different in the type of
		 * argument method1 with int type parameter method1 with String type parameter
		 * method1 with double type parameter method1 with float type parameter
		 * 
		 * and write the logic in that method to print respective value based on the
		 * parameter value you passed in the method type and call the method in main
		 * method with values
		 * Output should be
		 * 100 Accentech Partners 100.09 200.0998
		 */
		Method10 number = new Method10();
		number.m1(100, " Accentech Partners ");
		number.m1(200.0998 , 100.09f);
	
	
	
	
	
	}

}
