package javaPractiesPrograms;

public class MethodOverloading110 {
 private void M1() {
	 System.out.println("private m1 method private");
 }
 private void M1(int a)
 {
	 System.out.println("private m1 method private");
 }
	public static void main(String[] args) {
		/*
		 * Create two private method with different parameters and try to call them in
		 * main method create one method without parameter create another method with
		 * int parameter
		 * 
		 * output would
		 * 
		 * private m1 method private m1 method with int parameter
		 */
		
		MethodOverloading110 Obj1 = new MethodOverloading110();
		Obj1.M1();
		Obj1.M1(10);
	
	}

}
