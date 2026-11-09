package day26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencart/");
		driver.manage().window().maximize();
		
	}

}
