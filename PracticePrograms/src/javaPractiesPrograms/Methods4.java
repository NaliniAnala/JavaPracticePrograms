package javaPractiesPrograms;

public class Methods4 {
	
	public void newLine()
	{
		System.out.print("newLine method implementation");
	}
	public void  displayLine()
	{
		System.out.print(" displayLine method implementation");
	}
	public static void main(String[] args) {
		/*
		 *  create two method without any parameters after main method
		 * method name as newLine and write the logic for that method in println
		 * statement as "newLine method implementation" method name as displayLine and
		 * write the logic for that method in println statement as
		 * "displayLine method implementation" in main method try to call that method
		 * 
		 * output newLine method implementation displayLine method implementation
		 */
	
		Methods4 newDis = new Methods4();
		newDis.newLine();
		newDis.displayLine();
	
	}

}
