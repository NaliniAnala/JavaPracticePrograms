package javaPractiesPrograms;

public class AccessModifier1 {
	private int a=100; 
	protected String name="AccentechPartners"; 
	float salary=565656.09f;
	public String city="Florida";
	
	public static void main(String[] args) {
		/*
		 * Instructions from your teacher: For you to do In main class please declared
		 * the variables with different access modifiers
		 * 
		 * private int a=100; protected String name="AccentechPartners"; float
		 * salary=565656.09f; public String city="Florida";
		 * 
		 * In main method please call this variables but make sure you call them in same
		 * order presented
		 * 
		 * Output: 100 AccentechPartners 565656.09 Florida
		 */
		AccessModifier1 values = new AccessModifier1();
		System.out.println(values.a);
		System.out.println(values.name);
		System.out.println(values.salary);
		System.out.println(values.city);
	

	}

}
