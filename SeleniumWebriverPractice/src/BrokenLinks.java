import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("#gf-BIG a"));
		for (WebElement link : links) {
			String href = link.getAttribute("href");
			if (href == null || href.isEmpty()) {
				continue;
			}
			HttpURLConnection conn = (HttpURLConnection) new URL(href).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int statusCode = conn.getResponseCode();
			System.out.println(link.getText() + " -> " + href + " -> " + statusCode);
			if (statusCode >= 400) {
				System.out.println("Broken link: " + link.getText());
			} else {
				System.out.println("Working link: " + link.getText());
			}
		}
		driver.quit();
	}

}