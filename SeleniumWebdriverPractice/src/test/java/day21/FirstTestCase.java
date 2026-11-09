package day21;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	/*
	 Test
	 1) Launch Browser (Chrome/Firefox)
	 2) Open URL ("automationexercise.com")
	 3) Validate title should be "Automation Exercise"
	 */
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		String actualTitle = driver.getTitle();
		if(actualTitle.equals("Automation Exercise")) {
			System.out.println("Test Passed");
		
		}
		else 
		{
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
