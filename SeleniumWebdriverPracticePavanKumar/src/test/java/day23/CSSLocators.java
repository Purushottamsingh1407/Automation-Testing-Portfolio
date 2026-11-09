package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
/*WebDriver driver = new ChromeDriver();

//Usimg CSS Selector to locate the element with id attribute here we have used # symbol followed by the id value to locate the element
driver.get("https://qapracticehub.com/?utm_source=copilot.com#shopping");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("input#shop-search")).sendKeys("T-shirt");
//we can use cssSelector with id attribute using # symbol followed by the id value
driver.findElement(By.cssSelector("#shop-search")).sendKeys("T-shirt");
*/
//Using Css Selector with class attribute here we have used . symbol followed by the class value to locate the element
WebDriver driver = new ChromeDriver();	
driver.get("https://automationexercise.com/products");
driver.manage().window().maximize();
//driver.findElement(By.cssSelector("input.form-control")).sendKeys("T-shirt");


 //Using Css Selector with attribute name here we have used [attribute='value'] to locate the element
//driver.findElement(By.cssSelector("input[name='search']")).sendKeys("T-shirt");

//Using Css Selector with multiple attributes with tag and class and attribute with value
driver.findElement(By.cssSelector("input.form-control[name='search']")).sendKeys("T-shirt");


	}

}
