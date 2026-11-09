package day15;

public class Animal {
	String colour="white";
	void eat()
	{
		System.out.println("eating.....");
	}
	
	Animal()
	{
		System.out.println("This is Animal");
	}
	Animal(String name)
	{
		System.out.println(name);
	}
	
}

	class dog extends Animal
	{
		String colour="Black";
		void displayColour()
		
		{
			System.out.println(super.colour);
		}
		void eat()
		{
			System.out.println("Eating bread...");
			super.eat();
		}
		dog()
		{
			//super();
			//System.out.println("This is dog");
		}
		dog(String name)
		{
			super(name);
			//System.out.println("This is dog");
		}
	}


