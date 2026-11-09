
public class MethodsDemo {

	public static void main(String[] args) {
		
	MethodsDemo d = new MethodsDemo();
		String name = d.getData();
System.out.println(name);
MethodsDemo2 d2 = new MethodsDemo2();
d2.getUserData(); 


	}
	
	public String getData()
	{
		System.out.println("Hello");
		return "Rahul Shetty Academy";
	}

}
