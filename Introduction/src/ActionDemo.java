import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		WebElement move = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='nav-link-accountList']")));
//Move to search box
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		// Moves to specific element
		a.moveToElement(move).contextClick().build().perform();

	}
}