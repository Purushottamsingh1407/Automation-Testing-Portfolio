package day44;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependencyMethod {
	@Test(priority=0)
	public void openapp()
	{
		Assert.assertTrue(true);

	}
	@Test(priority=1, dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
		@Test(priority=2, dependsOnMethods= {"login"})
	void search()
	{
			Assert.assertTrue(true);
	}
		
		@Test(priority=3, dependsOnMethods= {"login"})
		void advancesearch()
		{
			Assert.assertTrue(true);
		}
		@Test(priority=4,dependsOnMethods= {"login"})
	void logout()
	{
			Assert.assertTrue(true);
	}
		
		
		



}
