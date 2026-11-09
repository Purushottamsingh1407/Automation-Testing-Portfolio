import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
int[] arr2 = {3, 5, 30, 7, 50, 17, 9, 80, 13, 100};
for(int i=0; i<arr2.length; i++)
{
	if(arr2[i]%2==0)
	{
		System.out.println(arr2[i] + " is even number");
		break;
	}
	

	else
	{
		System.out.println(arr2[i] + " is odd number");
	}
}



ArrayList <String>a = new ArrayList<String>();
a.add("Rahul");
a.add("Shetty");
a.add("Academy");
a.add("Selenium");
System.out.println(a.get(3));
for(int i=0; i<a.size(); i++)
{
	System.out.println(a.get(i));
}
System.out.println("Enhanced for loop");
 for(String val:a)
 {
	 System.out.println(val);
 }
//Items is Present in the ArrayList or not
 a.contains("Selenium");
 System.out.println(a.contains("Selenium"));
 String[] names = {"Rahul", "Shetty", "Academy"};
List<String> nameArrayList = Arrays.asList(names);
nameArrayList.contains("Selenium");



	}

}
