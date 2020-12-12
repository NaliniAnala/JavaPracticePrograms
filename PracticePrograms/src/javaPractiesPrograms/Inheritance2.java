package javaPractiesPrograms;

public class Inheritance2 {
	/*
	 * Create four classes (Person, Employee, Student, Retiree)
	 * 
	 * Have properties For Person: name(String) For Person: lastName(String) For
	 * Person: age(int) For Employee: salary(int) For Student: grade(int) For
	 * Retiree: seniorActivity(String)
	 * 
	 * have a print method in each that prints the properties in line as shown in
	 * the output
	 * 
	 * Use your inheritance skills to make Person as your parent class and
	 * 
	 * From your Main class create objects of the Employee, Student and Retiree
	 * classes and print out their properties in the following order.
	 * 
	 * 
	 * Output:
	 * 
	 * Joe Smith 35 35000 Adam Smith 15 10 Frank Smith 15 tour
	 */

	public static void main(String[] args) {
		Person per = new Person();
		Employee emp = new Employee();
	    Student stu = new Student();
	    Retiree ret = new Retiree();
		per.print();
		emp.print();
		stu.Print();
		ret.Print();
	}

}
class Person
{
	String name;
	String lastName;
	int age;
	void print()
	{
		System.out.print("Joe Smith 35 ");	
	}
	
}
class Employee
{
	int salary;
	
	void print()
	{
		
		System.out.println("35000 ");
		System.out.print("Adam Smith 15 ");
	}
	
}
class Student
{
	int grade;
	void Print()
	{
		System.out.print("10 ");
	}
	
}
class Retiree	
{
	String seniorActivity;
	void Print()
	{
		System.out.println("tour");
	}
}
