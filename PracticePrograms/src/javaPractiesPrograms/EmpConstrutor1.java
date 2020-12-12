package javaPractiesPrograms;

public class EmpConstrutor1 {
	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	EmpConstrutor1()
	{
		
	}
	
	EmpConstrutor1(String name ,String lastName , int employeeId,	String startDate,int salary)
	{
		this.name = name;
		this.lastName =lastName;
		 this.employeeId = employeeId;
		 this.startDate = startDate;
		 this.salary = salary;
		 
	 }
	
	public void print()
	{
		System.out.println(name+" " + lastName+" "+ employeeId+" " +startDate+" " + salary); 
	}
	
	  public static void main(String[] args) {
		/*
		 * 1. Complete the Employee.java class:
		 * 
		 * Include the following class variables: name(String) lastName(String)
		 * employeeId(int) startDate(String) salary(int)
		 * 
		 * -----------------------------------------------------------------------------
		 * --------- Write two constructors:
		 * 
		 * default constructor The main constructor( with all parameters)
		 * 
		 * Create two different objects of the Employee class using both constructors
		 * and print the values of the properties inline using a print method.
		 * 
		 * 
		 * Output:
		 * 
		 * null null 0 null 0 Joe Smith 12345 01/01/1970 35000
		 */

		  EmpConstrutor1 em = new EmpConstrutor1();
		  EmpConstrutor1 em1 = new EmpConstrutor1("Joe", "Smith" ,12345 ,"01/01/197",35000);
		  em.print();
		  em1.print();
		  
		  }

	 
	  
}
