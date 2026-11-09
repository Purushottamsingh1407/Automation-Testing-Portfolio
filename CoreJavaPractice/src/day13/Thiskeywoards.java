package day13;

public class Thiskeywoards {
int x,y ; //class variable //instance variable 
/*
	void SetData(int x,int y)//a,b are local variable
	{
	this.x=x;
		this.y=y;
	}
	*/
	void display()
	{
		System.out.println(x+" "+y);
	}
	
	Thiskeywoards(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public static void main(String[] args) {
//Thiskeywoards th=new Thiskeywoards();
		
Thiskeywoards th=new Thiskeywoards(10,20);		
//th.SetData(20,30);
th.display();
		
	}

}
