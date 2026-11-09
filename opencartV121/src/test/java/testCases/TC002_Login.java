package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC002_Login extends BaseClass {
	@Test
	public void verify_Login()
	{
		logger.info("Starting TC002_Login");
		try
		{
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();

			MyAccountPage macc = new MyAccountPage(driver);
			boolean targetpage = macc.isMyAccountPageExists();
			Assert.assertEquals(targetpage, true, "Login failed");
		}
		catch(Exception e)
		{
			logger.error("Test Failed");
			Assert.fail();
			logger.debug("Debug logs...");
		}
		logger.info("Finished TC002_Login");
	}
}