package day44;

import org.testng.annotations.Test;

public class SignupByTest {

	
	
	@Test(priority=1,groups= {"regression"})
	void SignupByEmail()
	{
			System.out.println("This is Signup by email");
	}
		
		
		
		@Test(priority=2,groups= {"regression"})
	void SignupByFacebook()
	{
			System.out.println("This is Signup by facebook");
	}
		
		@Test(priority=3,groups= {"regression"})
	void SignupByTwitter()
	{
			System.out.println("This is Signup by Twitter");
	}
		
	
	
	
	
	
	
	
	
	
	
}
