package day19;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("Program started");
		String s=null;
		try {
		System.out.println(s.length());	
		}
		catch(Exception e)
		{
		System.out.println("Exception Handel...");	
		}
		/*
		catch(ArithmeticException e)
		{
			System.out.println("Handeled Arithmetic Exception");
		}
		catch	(NullPointerException e)
		{
			System.out.println("This is null pointer Exception Handeled... ");
		}
		catch(NumberFormatException e)
		{
			System.out.println("number format exception handeling");
			}
		System.out.println("Program is completed");

		*/
	}

}
