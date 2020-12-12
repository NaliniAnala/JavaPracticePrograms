package javaPractiesPrograms;

public class MethodOverload112 {
	final void M1(boolean b)
	{
		System.out.println("Final method with boolean parameter");
	}
	final void M1(String s)
	{
		System.out.println("Final method with String parameter");
	}
	public static void main(String[] args) {
		/*
		 * Create the two final method with same name but different parameters and try
		 * to call them in main method create one method with boolean parameter create
		 * another method with String parameter output would
		 * 
		 * Final method with boolean parameter Final method with String parameter
		 */
	
		
		MethodOverload112 Obj2 = new MethodOverload112();
		Obj2.M1(true);
		Obj2.M1("kruhti");
	
	
	
	}

}
