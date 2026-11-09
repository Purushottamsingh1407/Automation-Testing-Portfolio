package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	
	//constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
By txt_username_loc=By.name("username");
By txt_password_loc=By.name("password");
By btn_login_loc=By.name("password");
//Action mehtods 

public void setUserName(String user)
{
	driver.findElement(btn_login_loc).sendKeys(user);
}

public void setPassword(String pwd)
{
	driver.findElement(txt_password_loc).sendKeys(pwd);
	
}

public void clickLogin()
{
	driver.findElement(btn_login_loc).click();
}



}
