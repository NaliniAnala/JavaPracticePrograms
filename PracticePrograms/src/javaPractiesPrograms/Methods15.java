package javaPractiesPrograms;

public class Methods15 {
	
	public boolean bothEven(int num1,int num2)
	{
		if(num1%2==0 && num2%2==0) {
			return true;
		} else return false;

	 }
	
	 //System.out.println(bothEven(num1,num2)); //should be true
		//System.out.println(bothEven(num1,6));
	
	public static void main(String[] args) {


		/*
		 * Write a method header on line two with the following specs:
		 * 
		 * Returns: a boolean Method Name: bothEven Parameters: an integer called "num1"
		 * an integer called "num2"
		 * 
		 * Then, starting on line 4, write code that will return true if both num1 and
		 * num2 are even. Return false otherwise.
		 * 
		 * Examples: bothEven(4,6) ==> true bothEven(3,4) ==> false bothEven(-1,1) ==>
		 * false
		 */
		Methods15 eo = new Methods15();
		boolean b =eo.bothEven(-1,8);
		
		   System.out.println("bothEven(4,5) ==> "+b);
		
		  //should be true
		 // System.out.println(bothEven(5,6)); //should be false

	
	
	
	
	
	
	
	}

}
