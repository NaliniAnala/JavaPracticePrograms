package javaPractiesPrograms;

public class Methods9 {

public void additon(int a,int b)
{
	int c = a+b;
	System.out.println(c);
}

public void multiplication(int a,int b)
{
	int c = a*b;
	System.out.println(c);
}
public void subtration(int a,int b)
{
	int c = a-b;
	System.out.println(c);
}

	public static void main(String[] args) {
		/*
		 * For you to do Multiple Parameters for method create three method with
		 * Multiple Parameters as int and write the logic in that method to perform
		 * multiplication,addition and subtraction and call the method in main method
		 * with values
		 * 1. for the addition method add two numbers to make 30 but put those numbers
		 * in the parameters 2. for multiplication multiply two numbers to make 30 but
		 * put those two numbers in your parameters 3. for Subtraction subtract two
		 * numbers to equal 20, with using parameters. 30 for addition 30 for
		 * multiplication 20 for subtraction
		 * output 30 30 20
		 */
	
		Methods9 math = new Methods9();
		math.additon(15,15);
		math.multiplication(6,5);
		math.subtration(30, 10);
		//System.out.println(math);

	}

}
