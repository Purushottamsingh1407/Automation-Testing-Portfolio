package jar;

public class Prac01 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C://chromrdriver.exe");
	WebDriver driver= new ChromeDriver();
	//driver.manage()
	
	driver.get("https://example.com");
//Example of assertEquals
String actualTitle = driver.getTitle();
String expectedTitle="Example Domain";
Assert.assertEquals(actualTitle, expectedTitle);

//Exaple of assertTrue
boolean isElementDisplayed=
driver.findElement(By.id("exampleElement")).isDisplayed();
Assert.assertTrue(isElementDisplayed);
driver.quit();
	}

	
	
	
	}

