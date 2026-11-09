package day11;

public class Greetingmain {

	public static void main(String[] args) {
		// No parameter return some value
		Greeting gr = new Greeting();
		gr.m1();
//No parameter but returns some value
		String s = gr.m2();
		System.out.println(s);
//if we do not want to take any variable to print m2 then 
		System.out.println(gr.m2());

// Takes parameter but not return any value

		gr.m3("Purushottam");

// Takes Parameter return some value
		String p = gr.m4("Priyam");
		{
			System.out.println(p);
		}
//if we do not want to take any variable to print m4 then 

		System.out.println(gr.m4("Priyam"));

	}

}
