package testBase;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
		
		//Loading config.properties file
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		
		
		 logger = LogManager.getLogger(this.getClass());
		 switch(br.toLowerCase())
		 {
		 case "chrome" : driver = new ChromeDriver();break;
		 case "firefox" : driver = new ChromeDriver();break;
		 case "edge" : driver = new ChromeDriver();break;
		 default : System.out.println("Please provide valid browser name");return;
		 }
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get("http://localhost/opencart/");
		driver.manage().window().maximize();
	}
		@AfterClass
	public void tearDown()
	{
	driver.quit();	
	}
		public String randomeString() 
		{
			String generatedstring = RandomStringUtils.randomAlphabetic(5);
			return (generatedstring);
		}
		public String randomeNumber() 
		{
			String generatedstring1 = RandomStringUtils.randomNumeric(10);
			return (generatedstring1);
		}
		public String randomeAlphaNumberic() 
		{
			String generatedstring2 = RandomStringUtils.randomAlphabetic(3);
			String generatedstring3 = RandomStringUtils.randomNumeric(4);
			return (generatedstring2+"@"+generatedstring3);
		}
}