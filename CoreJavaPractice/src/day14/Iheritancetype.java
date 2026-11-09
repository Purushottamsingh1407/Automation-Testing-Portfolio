package day14;
class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b;
	void show()
	{
	System.out.println(b);	
	}
}
class C extends B
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}

public class Iheritancetype {

	public static void main(String[] args) {
		/*
B b=new B();
b.a=10;
b.b=30;
b.display();
b.show();
*/
	C c=new C();	
		c.a=10;
		c.b=20;
		c.c=30;
		c.display();
		c.show();
		c.print();
		
		
		
		
	}

}
