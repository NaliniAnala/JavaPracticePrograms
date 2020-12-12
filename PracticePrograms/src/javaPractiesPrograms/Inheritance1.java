package javaPractiesPrograms;

public class Inheritance1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create two classes (A, B)
		 * 
		 * Write two constructors:
		 * 
		 * Have a method that prints out the following For A: "Class A" For B: "Class B"
		 * 
		 * 
		 * 
		 * Make B extend A
		 * 
		 * From your Main class create an object of the B class and call the methods.
		 * 
		 * 
		 * Output:
		 * 
		 * Class A Class B
		 */
	//A objA = new A();
	B objB = new B();
	
	}

}

class A{
	
	A(){
		System.out.println("Class A");
	}
	
}

class B extends A{
	B(){
		System.out.println("Class B");
		
	}
}
