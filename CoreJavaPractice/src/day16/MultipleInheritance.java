package day16;

public class MultipleInheritance implements I1,I2
{
public void m1()
{
	System.out.println("This is m1");
}
public void m2()
{
	System.out.println("This is m2");
}
	public static void main(String[] args){

	MultipleInheritance mi=new MultipleInheritance();
	mi.m1();
	mi.m2();
	System.out.println(I1.x+I2.y);
		
		
		
		
		
		
		
		
		
		
	}

}
