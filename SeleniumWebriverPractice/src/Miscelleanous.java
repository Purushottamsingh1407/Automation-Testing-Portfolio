import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");

		// delete all cookies
		driver.manage().deleteAllCookies();

		// delete one cookie by name (optional)
		driver.manage().deleteCookieNamed("sessionid");  

		// take screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91947\\Pictures\\Screenshots\\badssl_screenshot.png");
		FileUtils.copyFile(src, dest);

		System.out.println("Screenshot saved to: " + dest.getPath());
		driver.quit();
	}
}