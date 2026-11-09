package day17;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		int i = 10;
		double d = 10.5;
		char c = 'A';
		boolean b = true;
//Here we are converting premative to object type now they are in object format and object type of data are allowd in collection 
		Integer iobj = i;// object
		Double dobj = d;
		Character cobj = c;
		Boolean bobj = true;

		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);

//converting object to premative type this is unboxing

		int intvalue = iobj;
		double doublevalue = dobj;
		char charvalue = cobj;
		boolean booleanvalue = bobj;

		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(charvalue);
		System.out.println(booleanvalue);

//int x=100;
		Integer x = 10;

		// Unboxing
		int f = 100;

		String s = String.valueOf(f);
		System.out.println(s);

		Double g = 10.5;
		String h = String.valueOf(g);
		System.out.println(h);

		boolean l = true;
		String k = String.valueOf(l);
		System.out.println(k);

		char m = 'a';
		String v = String.valueOf(m);
		System.out.println(v);

	}

}
