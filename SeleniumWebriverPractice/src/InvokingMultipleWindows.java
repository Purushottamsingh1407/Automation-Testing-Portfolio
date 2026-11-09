import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/angularpractice/");
driver.switchTo().newWindow(WindowType.TAB);
Set<String>handels=driver.getWindowHandles();
Iterator<String>it=handels.iterator();
String parentwindow=it.next();
String childwindow=it.next();
driver.switchTo().window(childwindow);
driver.get("https://rahulshettyacademy.com");


















	}

}
