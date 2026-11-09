package day12;

public class Adder {
int a=10, b=20;
void sum()
{
	System.out.println(a+b);
}
	
void sum(int x,int y)	
{
	System.out.println(x+y);
}
	
	void sum(double x,double y)
	{
		System.out.println(x+y);
	}
	void sum(int x,double y)
	{
		System.out.println(x+y);
	}
	
	void sum(double x,int y)

	{
		System.out.println(x+y);
	}
	
	
	
	public static void main(String[] args) {
Adder ad= new Adder();
ad.sum();
ad.sum(10.5,10);
ad.sum(14,15);
ad.sum(10,10.5);		
ad.sum(10.5,10.5);		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
