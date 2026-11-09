import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingProducttothecart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(7));
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
addItems(driver,itemsNeeded);
//AddingProducttothecart b=new AddingProducttothecart();
driver.findElement(By.cssSelector("img[alt='Cart']")).click();
driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector("button.promoBtn")).click();
w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


	}
	
	

	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	
	{
		int j = 0;
		//searching product on the basis on Product name 
				List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

				for (int i = 0; i < products.size(); i++) {
					String[] name = products.get(i).getText().split("-");
					String formattedName = name[0].trim();
					// Convert array into array list for easy searchs
					// check weather name you extracted is present in array list or not

					List itemsNeededList = Arrays.asList(itemsNeeded);

					if (itemsNeededList.contains(formattedName)) {
						j++;
						// CLICK ON ADD GTO CART
						driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
						if (j == itemsNeeded.length) {
							break;
						}
					}
				}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
