package javaPractiesPrograms;

public class Variable7 {
	 
	
	public void m1()
	  {
	    System.out.println("Programming is amazing");
	  }
	 public static void m2()
	  {
	    System.out.println("Java is awesome.");
	  }
	public static void main(String[] args) {
		/*
		 * For you to do
		 * create two methods create first instance method write the logic in it as
		 * Programming is amazing. in println statement create second static method
		 * write the logic in it as Java is awesome. in println statement
		 * call this two method in main method
		 * Output: Programming is amazing. Java is awesome.
		 */
		//System.out.println(Variable7.m2());
		Variable7 str = new Variable7();
		m2();
		str.m1();
	
	
	
	
	
	
	
	}

}
