package javaPractiesPrograms;

public class AccessModifier2 {

	private void a()
	{
		System.out.println("This is Private Method");
	}
	void b()
	{
		System.out.println("This is Default Method");
	}
	protected void c()
	{
		System.out.println("This is Protected Method");
	}
	public void d()
	{
		System.out.println("This is Public Method");
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * ACCESS MODIFIERS
		 * 
		 * For you to do Please create the different methods with different access
		 * modifiers and try to access those methods in the main class
		 * 
		 * In each method write the logic accordingly like if for private method write
		 * the logic in the println Statement as "This is Private Method" accordingly
		 * for rest methods should be a total of 4 outputs, please make sure they are
		 * same order that is printed below
		 * 
		 * Output: This is Private Method This is Default Method This is Protected
		 * Method This is Public Method
		 */

		AccessModifier2 am =new AccessModifier2();
		am.a();
		am.b();
		am.c();
		am.d();
	}	
	
	
}

