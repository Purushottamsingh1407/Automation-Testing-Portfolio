package day12;

public class Box {
	double width,height,depth;
	
	Box()
	{
		width=0;
		height=0;
		depth=0;
		//or we can also write this way 
		width=height=depth=0;
	}
	
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	Box(double len)
	{
		width=height=depth=len;
	}
	
double volume()
{
	return (width*height*depth);
}
	public static void main(String[] args) {
		
		
		 
/*
		Box b=new Box();
System.out.println(b.volume());
	*/	
/*		
Box b=new Box(5.0,5.5,5.7);
		System.out.println(b.volume());
		*/
	Box b=	new Box(10.5);
		System.out.println(b.volume());
	}

}
