
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
//String is an Object 
//Creating Object by String Literal Method
		String s1 = "Rahul Shetty Academy";
		String s2 = "Rahul Shetty Academy";
		
		//Creating Object by new Keyword
		String s3 = new String("Rahul Shetty Academy");
		String s4 = new String("Rahul Shetty Academy");
		
		String s = "Rahul Shetty Academy";
		String[]splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		String[]splittedString2 = s.split("Shetty");
		System.out.println(splittedString2[0]);
		System.out.println(splittedString2[1]);
		System.out.println(splittedString2[1].trim());
		for(int i=0; i<s.length(); i++)
				{
		System.out.println(s.charAt(i));
				}
		
		
		//Print String in reverse order
		for(int i =s.length()-1; i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
	}

}
