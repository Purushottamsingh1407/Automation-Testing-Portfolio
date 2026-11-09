package day19;

public class FinnalyBlock {

	public static void main(String[] args) {
String s="Welcome";

try
{
	System.out.println(s.length());

}
catch(NullPointerException e)

{
	System.out.println("Exception handeling ....");
}
finally
{
	System.out.println("Intered into finnally block");
}



	}

}
