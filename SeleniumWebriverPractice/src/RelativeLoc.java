import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RelativeLoc {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement nameEditBox = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='name']")));

		WebElement nameLabel = wait
				.until(ExpectedConditions.visibilityOfElementLocated(with(By.tagName("label")).above(nameEditBox)));
		System.out.println(nameLabel.getText());

		WebElement dateofbirth = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[for='dateofBirth']")));

		driver.findElement(with(By.tagName("input")).below(dateofbirth)).click();

		WebElement icecreamLable = driver.findElement(By.xpath("//label[.='Check me out if you Love IceCreams!'] "));
		driver.findElement(with(By.tagName("input")).toLeftOf(icecreamLable)).click();

		WebElement rdb = driver.findElement(By.id("inlineRadio1"));

		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());

	}

}
