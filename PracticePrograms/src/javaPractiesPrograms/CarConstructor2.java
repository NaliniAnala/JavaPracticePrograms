package javaPractiesPrograms;

public class CarConstructor2 {

	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	int price;
	
	//declear case sinsitive
	
	CarConstructor2(String make ,String model ,int numberOfDoors,int topSpeed , int price)
	{
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
	
	}

	CarConstructor2(String make ,String model ,int topSpeed , int price)
	{
		this.make=make;
		this.model=model;
		this.numberOfDoors=4;
		this.topSpeed=topSpeed;
		this.price=price;
		
	}
	
	CarConstructor2(int numberOfDoors,int topSpeed , int price)
	{
		this.make="unknown";
		this.model="unknown";
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
	
	}
	
	CarConstructor2(String make ,String model ,int numberOfDoors)
	{
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=90;
		this.price=0;
	
	}

	

	
	@Override
	public String toString() {
		return "" + make + " " + model + " " + numberOfDoors + " "
				+ topSpeed + " " + price + " ";
	}

	public static void main(String[] args) {
		/*
		 * Complete the Car.java class:
		 * 
		 * Include the following class variables: make model numberOfDoors topSpeed
		 * price All class variables should be declared case sensitive
		 * 
		 * Write four constructors: The first constructor(with all parameters) A
		 * secondary constructor that does not include numberOfDoors, which should
		 * default to 4 A third constructor that does not include make and model; both
		 * default to "unknown" A fourth constructor that does not include topSpeed and
		 * price; default to 90 and 0 respectively.
		 * 
		 * 2. Test your code with the Main.java class: Create several Car objects using
		 * all Constructors and print their fields/states to make sure it's correct.
		 * print your objects with variables in your output each object
		 * 
		 * 
		 * Output: Toyota Prius 4 120 30000.0 Toyota Prius 4 120 30000.0 unknown unknown
		 * 4 120 30000.0 Toyota Prius 4 90 0.0
		 */

		CarConstructor2 obj1 = new CarConstructor2("Toyota", "Prius", 4, 120 , 30000);
		
	    	System.out.println(obj1.toString());
	
	    CarConstructor2 obj2 =  new CarConstructor2("Honda", "Breakhonda", 80, 28000);
	    	System.out.println(obj2.toString());
	
	    CarConstructor2 obj3 = new CarConstructor2(4, 123, 40000);
	    	System.out.println(obj3.toString());		
	    CarConstructor2 obj4 = new CarConstructor2("BMW","Mini Cooper", 2);
	    	System.out.println(obj4.toString());
	}

}
