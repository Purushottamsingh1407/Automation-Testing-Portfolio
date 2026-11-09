package day42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTEST {
	WebDriver driver;
	@Test(priority=1)
void openapp()
{
	driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
}
	@Test(priority=2)
  void testlogo()
  {
	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
	boolean status = logo.isDisplayed();
	System.out.println("is Displayed:..." + status);
	Assert.assertTrue(status, "Company logo is not displayed");
	
  }
  @Test(priority=3)
  void testlogin() 
  {
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.cssSelector("button[type='submit']")).click();
  }
  
  @Test(priority=4)
  void close()
  {
	  driver.close();
  }
  
}