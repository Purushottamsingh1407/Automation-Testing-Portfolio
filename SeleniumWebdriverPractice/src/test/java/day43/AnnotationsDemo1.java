package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	@BeforeMethod
void login()
{
	System.out.println("This is login");
}
	@Test
void search()
{
	System.out.println("This is search");
}
	
	@Test
	void advancesearch()
	{
		System.out.println("This is advannce search");
	}
	@AfterMethod
void logout()
{
		System.out.println("This is logout");
}
	
	
	
	
}