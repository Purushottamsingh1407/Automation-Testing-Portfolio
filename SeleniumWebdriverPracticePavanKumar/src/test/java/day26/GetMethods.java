package day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		String windowid = driver.getWindowHandle();
		System.out.println("window id:" + windowid);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
	}

}