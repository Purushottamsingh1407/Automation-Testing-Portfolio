
public class CoreJavaBrushUp {

	public static void main(String[] args) {
int num = 5;
String website = "Rahul Shetty Academy";
char letter = 'r';
double dec = 5.99;
boolean myCard = true;
System.out.println(num + " is the value stored in the variable num");
System.out.println(website + " is the value stored in the variable website");
System.out.println(letter + " is the value stored in the variable letter");
System.out.println(dec + " is the value stored in the variable dec");
System.out.println(myCard + " is the value stored in the variable myCard");

//Array
int[] arr = new int[5];
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;

int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
System.out.println(arr2[3]);

//for loop
for(int i=0; i<arr.length; i++)
{
	System.out.println(arr[i]);
}
	
for(int i=0; i<arr2.length; i++)
{
	System.out.println(arr2[i]);
}


String[] names = {"Rahul", "Shetty", "Academy"};
	for(int k=0; k<names.length; k++)
	{
		
		System.out.println(names[k]);
	}
	
	//Enhanced for loop
	for(String s:names)
	{
		System.out.println(s);
	}

	}

}
