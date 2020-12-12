package javaPractiesPrograms;

public class ClassObject1 
{
	String breed, name, color;
	
	public void bark()
	{
		System.out.println(breed+" can bark");
	}
	public void run()
	{
		System.out.println(breed+" can run");
	}

	public void play()
	{
		System.out.println(breed+" can play");
	}
	
	
	public static void main(String[] args) {
		

		/*
		 * Create a Class main that should be a template for the DogClass. In this class
		 * you should specify the following attributes: breed, name, color and following
		 * behaviors: bark(), run(), play(). Create 3 different objects of it: Husky,
		 * Bulldog, Labrador with specific attributes and behaviors.
		 * 
		 * The output of the program should be as following:
		 * 
		 * Husky can bark Husky can run Husky can play Bulldog can bark Bulldog can run
		 * Bulldog can play Labrador can bark Labrador can run Labrador can play
		 */
		
		ClassObject1 husky = new ClassObject1();
		ClassObject1 bulldog = new ClassObject1();
		ClassObject1 labrador = new ClassObject1();

		husky.breed = "Husky";
		
		husky.bark();
		husky.run();
		husky.play();
		
		bulldog.breed = "BullDog";
		
		bulldog.bark();
		bulldog.run();
		bulldog.play();
		

		labrador.breed = "labrador";
		
		labrador.bark();
		labrador.run();
		labrador.play();

	}

}
