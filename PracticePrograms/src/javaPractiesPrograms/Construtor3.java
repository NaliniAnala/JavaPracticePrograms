package javaPractiesPrograms;

public class Construtor3 {
	String schoolName;
	int batch;
	String year; 
	String lastDayOfClass;
	
	Construtor3()
	{
		
	}
	Construtor3(String schoolName,	int batch, String year, String lastDayOfClass)
	{
		this.schoolName =schoolName;
		this.batch =batch;
		this.year =year;
		this.lastDayOfClass =lastDayOfClass;
		
	
	}
	public void Print() {
		System.out.println(schoolName +" "+batch +" "+year+" "+lastDayOfClass);
	}
	public static void main(String[] args) {
		/*
		 * Complete the AccentechParner class:
		 * 
		 * Include the following class variables: schoolName(String) batch(int)
		 * year(String) lastDayOfClass(String)
		 * 
		 * 
		 * Write two constructors:
		 * 
		 * default constructor The main constructor( with all parameters)
		 * 
		 * Create two different objects of the AccentechParner class using both
		 * constructors and print the values of the properties inline
		 * 
		 * 
		 * Output:
		 * 
		 * null 0 null null Syntax 4 2019 07/30/2019ub
		 */

		Construtor3 obj1 = new Construtor3();
		Construtor3 obj2 = new Construtor3("Syntax" ,4 ,"2019", "07/30/2019");
		obj1.Print();
		obj2.Print();
	
	}

}
