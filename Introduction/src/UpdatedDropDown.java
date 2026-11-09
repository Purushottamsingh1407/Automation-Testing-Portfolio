import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Selecting the Country
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		// Selecting the two way trip
		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// clicking on From dropdown
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		// Selecting from city
		driver.findElement(By.xpath("//a[@text='Bhopal (BHO)']")).click();
		Thread.sleep(10000);
		// selecting to city
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		Thread.sleep(5000);
		// Selecting Departure date
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		// selecting return date and checking calander is enabeled or not
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
			System.out.println("is disabled");
			Assert.assertTrue(true);
		}

		// selecting and checking checkbox is selected or not
		Assert.assertFalse(
				driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_friendsandfamily]")).isSelected());

		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_friendsandfamily]")).click();

		Assert.assertTrue(
				driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_friendsandfamily]")).isSelected());

//Count the number of checkboxes
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
//Adding passenger by clicking on +(Plus sign)
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000);
		for (int i = 1; i <= 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		// Dropdown with select tag
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByContainsVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("input[value='Search']")).click();

	}

}
