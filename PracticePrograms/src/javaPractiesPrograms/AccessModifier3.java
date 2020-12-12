package javaPractiesPrograms;

public class AccessModifier3 {
	 private int batch=3;
	 private String name="AccentechPartners";
	 public void display()
	 {
		 System.out.println(batch);
		 System.out.println(name);
	 }
	public static void main(String[] args) {
		/*
		 * For you to do Declare two private variables in Main class as private int
		 * batch=3 private String name="AccentechPartners" declare one private method in
		 * Main class as display
		 * 
		 * create a method to return print those two values and print them in your main
		 * method by calling that method please print in order as shown above
		 * Output: 3 AccentechPartners
		 */

		AccessModifier3 number = new AccessModifier3();
		number.display();

		
	
	
	
	
	
	
	
	
	
	
	
	}

}
