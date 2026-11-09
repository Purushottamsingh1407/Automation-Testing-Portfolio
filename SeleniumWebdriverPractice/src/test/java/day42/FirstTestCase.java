package day42;

import org.testng.annotations.Test;

/*
 * open app
 * login 
 * logout
 */
public class FirstTestCase
{
@Test(priority=1)
void openapp()

{
	System.out.println("openeing application");
}
	@Test(priority=2)
void login()

{
	System.out.println("login to application ");
}
	@Test(priority=3)
void logout()
{
	System.out.println("logout to application");
}



}
