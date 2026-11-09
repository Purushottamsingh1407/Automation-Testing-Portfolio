import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Webdriverscope {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//count of link in the page 
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Limitng webdriver scope 
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		//count footer section link size
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//find out link first colium in footer
		WebElement coloumndriver= footerdriver.findElement(By.xpath("//body[1]/div[6]/table[1]/tbody[1]/tr[1]/td[1]/ul[1]"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		String mainWindow = driver.getWindowHandle();
		//click on each link  coloumn if the pages  are working
		for(int i=1;i< coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			
			Set<String> abc=driver.getWindowHandles();
			for(String win : abc)
			{
				if(!win.equals(mainWindow))
				{
					driver.switchTo().window(win);
					System.out.println(driver.getTitle());
				}
			}
			driver.switchTo().window(mainWindow);
		}
		
	}
}