package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		WebElement logo=driver.findElement(By.xpath("//a[normalize-space()='Qafox.com']"));
		System.out.println("Display status of logo:"+ logo.isDisplayed());
		
		
boolean ststus=	driver.findElement(By.xpath("//a[normalize-space()='Qafox.com']")).isDisplayed();
		
System.out.println(ststus);
boolean status=		driver.findElement(By.name("firstname")).isEnabled();
System.out.println(status);
	 WebElement Status=driver.findElement(By.xpath("//input[@name='agree']"));
	System.out.println(Status.isSelected());
		Status.click();
		
		System.out.println(Status.isSelected());

		
		
		
		
	}

}
