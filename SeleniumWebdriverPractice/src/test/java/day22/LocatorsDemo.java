package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
//driver.get("https://qapracticehub.com/?utm_source=copilot.com#inputs");
Thread.sleep(20000);
//driver.findElement(By.name("search")).sendKeys("T-shirt");
//driver.findElement(By.id("search-input")).sendKeys("T-shirt"); 
//boolean status=driver.findElement(By.id("site-logo")).isDisplayed();
//System.out.println("Logo is displayed: "+status);
driver.get("https://demoblaze.com/#");
driver.findElement(By.linkText("Phones")).click();
//driver.findElement(By.partialLinkText("Phon")).click();
List<WebElement> headerLinks=driver.findElements(By.className("nav-link"));
System.out.println("Total header links: "+headerLinks.size());
List<WebElement> allLinks=driver.findElements(By.tagName("a"));
System.out.println("Total links: "+allLinks.size());
List<WebElement> images=driver.findElements(By.tagName("img"));
System.out.println("Total images: "+images.size());
	}	
	
	
}
