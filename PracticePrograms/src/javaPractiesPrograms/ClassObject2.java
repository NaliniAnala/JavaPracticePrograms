package javaPractiesPrograms;

public class ClassObject2 
{
	String carColor="";
	String carModelYear="";
	String carName="";

	
	 public void printInfo() 
	 {
		 System.out.println( "Car color is "+ carColor +" and "+"car model year is "+ carModelYear +" and "+" car name is "+carName);
	 }
	 
	public static void main(String[] args) {
		/*
		 * create a class named 'Main' with specific attributes. For you to do
		 * Create two object in which you will be assigning the following values.
		 * carColor='Black' carModelYear=2019 carName='BMW'
		 * carColor='White' carModelYear=2018 carName='Toyota'
		 * Output
		 * Car color is Black and car model year is 2019 and car name is BMW Car color
		 * is White and car model year is 2018 and car name is Toyota
		 */

		ClassObject2 bmw = new ClassObject2();
		ClassObject2 toyata = new ClassObject2();
		
		toyata.carColor = "White";
		toyata.carModelYear="2018";
		toyata.carName="Toyota";

		bmw.carColor = "Black";
		bmw.carModelYear="2019";
		bmw.carName="BMW";
		

    	toyata.printInfo();
    	bmw.printInfo();
	
	
	
	}

}
