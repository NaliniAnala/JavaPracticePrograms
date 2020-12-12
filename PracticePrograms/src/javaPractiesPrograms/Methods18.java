package javaPractiesPrograms;

public class Methods18 {
	
	public String makeCapital(String name)
	{
	 return name.toUpperCase();
	}
	public static void main(String[] args) {
		/*
		 * Write a method header on line two with the following specs:
		 * Returns: a String Method Name: makeCapital Parameters: a String named "name"
		 * You should not be writing code on any line other than #2
		 */
		Methods18 naMe = new Methods18();
		String name1 = naMe.makeCapital("kruthi");
		System.out.println(name1);
	
	}

}
