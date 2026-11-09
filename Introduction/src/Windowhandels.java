import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandels {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]"))
				.click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String emailid = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		System.out.println(emailid);
		driver.switchTo().window(parentId);
       driver.findElement(By.id("username")).sendKeys(emailid);
       
	}

}