package day13;

public class Staticdemo {
	static int a=10;
	int b=20;
	static void m1()
	{
		System.out.println("This is m1 static method....");
	}
	void m2()
	{
		System.out.println("This is non static method...");
	}
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		Staticdemo st= new Staticdemo();
		System.out.println(st.b);
		st.m2(); 
		st.m();
	}

}
