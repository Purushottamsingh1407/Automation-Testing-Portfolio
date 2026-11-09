package day14;
class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}
class Child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}
class Child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}
public class HierarchyInheritance {

	public static void main(String[] args) {
		
		Child1 ch1=new Child1();
		ch1.display(100);
		ch1.show(200);
		
		Child2 c2=new Child2();
		c2.display(400);
		c2.print(450);
	}

}
