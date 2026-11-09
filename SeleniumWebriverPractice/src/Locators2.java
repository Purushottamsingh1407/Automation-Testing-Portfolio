import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");		
		driver.findElement(By.name("inputPassword")).sendKeys(password);		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Hello rahul,");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
		
		
		
	}
	 public static String getPassword(WebDriver driver) throws InterruptedException

	 {
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
			String passwordText=driver.findElement(By.cssSelector("form p")).getText();
//Please use temporary password 'rahulshettyacademy' to login.
	String[] passwordArray=passwordText.split("'");
		String password=passwordArray[1].split("'")[0];
		 return password;
		 
	 }
	 
	 
	 
	 
}
