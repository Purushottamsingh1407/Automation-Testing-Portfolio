package day11;

public class Greeting {

//No Parameter     No Return balue

	void m1() {
		System.out.println("Hello");
	}

	// No Parameter But Return some value
	String m2() {
		return ("Hello how are you");
	}

	// Takes parameter but not return any value
	void m3(String name) {
		System.out.println("Hello " + name);
		
}
	
	//Takes Parameter return some value
	String m4(String name)
	{
		return("hello "+name);
	
	}


}