package day7;

public class HowManyTimesNumberRepeatedInArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 10, 70, 10 };
		int num = 10;
		int count = 0;
for(int value:a)
{
if(value==num)
{
	count++;
}
}
System.out.println("Number of times its Repeted:"+count);









	}

}
