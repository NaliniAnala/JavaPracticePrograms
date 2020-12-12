package javaPractiesPrograms;

public class MethodOverloading111 {
	MethodOverloading111()
	{
		System.out.println( "Welcome to the AccettechPartners ");
	}
	MethodOverloading111(String s) {
		System.out.println("I am the student in AccettechPartners");
		
	}
	public static void main(String[] args) {
		/*
		 * Create the two Constructor with different parameters and try to call them in
		 * main method create one method without parameter create another method with
		 * String parameter output would
		 * 
		 * Welcome to the AccettechPartners I am the student in AccettechPartners
		 */
		MethodOverloading111 Obj1 = new MethodOverloading111();
		MethodOverloading111 Obj2 = new MethodOverloading111("h");
		
	
	
	
	}

}
