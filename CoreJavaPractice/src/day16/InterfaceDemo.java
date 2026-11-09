package day16;
interface Shape
{
	int lenght=10;//this is by default final and static 
	int width=20;//this is by default final and static 
	void circle();//abstract method
	default void square()
	{
		System.out.println("This is square - default methid.....");
	}
	static void rectangle()
	{
	System.out.println("this is rectangle- static mmethod...");  
	}
}
public class InterfaceDemo implements Shape
{
	public void circle()
	{
		System.out.println("This is circle-abstract method....");
	}
	void triangle()
	{
		System.out.println("this is traingle...");
	}
	public static void main(String[] args) {
//Scenario 1
		/*
		InterfaceDemo idobj=new InterfaceDemo();
		idobj.circle();//abstract method 
		idobj.square();//default method we can access
		Shape.rectangle();
		System.out.println(Shape.lenght+Shape.width);
		*/
		
		//Scenario 2
		
		Shape sh=new InterfaceDemo();
		sh.circle();
		sh.square();
	//	sh.rectangle(); can not access
		Shape.rectangle();
		
		
	}

}
