package day18;
class Parent
{
	String name="Jhon";
	void m1()
	{
		System.out.println("This is m1 from parent class");
	}
}

class child extends Parent
{
	
	int id=101;
	void m2()
	{
		System.out.println("This is m2 from child class");
	}
}


public class TypeCastingObject1 {

	public static void main(String[] args) {
		/*
child ch=new child();
 System.out.println(ch.name);
 ch.m1();
 System.out.println(ch.id);
 ch.m2();
	*/	
		
	/*	
	Parent p=new child();
	System.out.println(p.name);
	 p.m1();
	// System.out.println(p.id);we can not access
	// p.m2();we can not access
		*/	
		//Downcasting
		Parent p=new Parent();
	child ch=(child)p;
	System.out.println(ch.name);
	 ch.m1();
	 System.out.println(ch.id);
	 ch.m2();

		
		
	}

}
