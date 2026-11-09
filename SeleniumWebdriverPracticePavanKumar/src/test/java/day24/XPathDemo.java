package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/products");
		driver.manage().window().maximize();
		//Xpath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search Product']")).sendKeys("Blue Top");
		//Xpath with multiple attributes
		driver.findElement(By.xpath("//input[@name='search'][@id='search_product']")).sendKeys("TShorts");
		
		
		 
		
		
		
	
	}

}
