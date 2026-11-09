package AutomationPracticeRahulShetty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StandAloneTest {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("singh.Purushottam.1407@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Purushottam@1");
		driver.findElement(By.id("login")).click();
		
		
		
		
		
		
	}

}
