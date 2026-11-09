package pageObject;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage {
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
		
		@FindBy(xpath="//input[@id='input-firstname']")
		WebElement txtFirstName;
		
		@FindBy(xpath="//input[@id='input-lastname']")
		WebElement txtLastName;
		
		@FindBy(xpath="//input[@id='input-email']")
		WebElement txtEmail;
		 
		@FindBy(xpath="//input[@id='input-password']")
		WebElement txtPassword;
		
		@FindBy(xpath="//input[@name='agree']")
		WebElement chkdPolicy;
		
		@FindBy(xpath="//button[normalize-space()='Continue']")
		WebElement btnContinue;	
		
		@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
		WebElement msgConfirmation;
		
		
		public void setFirstName(String fname) {
			txtFirstName.sendKeys(fname);
		}
		
	public void setLastName(String lname) {
			txtLastName.sendKeys(lname);
		}
		
		public void setEmail(String email) {
			txtEmail.sendKeys(email);
		}
		
		public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);
		}
		
		public void setPrivacyPolicy() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement policy = wait.until(ExpectedConditions.visibilityOf(chkdPolicy));
			wait.until(ExpectedConditions.elementToBeClickable(policy));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", policy);
			try {
				if (!policy.isSelected()) {
					policy.click();
				}
			} catch (ElementClickInterceptedException e) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", policy);
			}
		}
		
		public void clickContinue() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement continueBtn = wait.until(ExpectedConditions.visibilityOf(btnContinue));
			wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", continueBtn);
			try {
				continueBtn.click();
			} catch (ElementClickInterceptedException e) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", continueBtn);
			}
		}
		
		public String getConfirmationMsg() {
			try {
				return(msgConfirmation.getText());
			}catch(Exception e) {
				return(e.getMessage());
			}
			
		}

}