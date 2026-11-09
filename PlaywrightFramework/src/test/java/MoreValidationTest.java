import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;

public class MoreValidationTest {
	Playwright playwright;
	Browser browser;
	@BeforeMethod
	public void setup()
	{
		playwright=Playwright.create();
	browser=playwright.chromium().launch();
	
		
	}
	

}
