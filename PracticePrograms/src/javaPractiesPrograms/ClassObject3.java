package javaPractiesPrograms;

public class ClassObject3 {
	String name ="";
	int roll_no;
	
	public void printInfo()
	{
		System.out.println("Name is " + name +" and roll number is " + roll_no);
	}

	public static void main(String[] args) {
		/*
		 * Create a class named 'Main' with String variable 'name' and integer variable
		 * 'roll_no'.
		 * Creating an object of the class Main and assign value of 2 to roll_no and
		 * name as "John"
		 * Your program should print the following: Name is John and roll number is 2
		 */
		ClassObject3 student = new ClassObject3();
		student.name = "john";
		student.roll_no = 2;
		
		student.printInfo();
		
		
		
		
		
		
		
	}

}
