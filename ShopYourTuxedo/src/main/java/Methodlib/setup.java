package Methodlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class setup {
static WebDriver driver;
	
	
	public void setupfor(String Browser, String Url)
	{ 
		switch(Browser)
		{
			case "chrome":
				
				openchrome(Url);
			break;
			
			case "firefox": openFireFox(Url);
			break;
			
			default: System.out.println("Default browser is chrome");
			openchrome(Url);
			break;
		}
			
	}
		
		private void openFireFox(String Url) 
		{
		
			
			System.setProperty("webdriver.gecko.driver", ".\\browser driver\\geckodriver.exe");
			FirefoxOptions options=new FirefoxOptions();
			options.addPreference("dom.webnotifications.enabled", false);
			driver= new FirefoxDriver(options);
			
			
			 driver.manage().window().maximize();
			driver.get(Url);		
			
		}

	private void openchrome(String Url)
		{  ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", ".\\browser driver\\chromedriver.exe");
			driver= new ChromeDriver(option);
			driver.manage().window().maximize();
			
			driver.get(Url);		
		
			
			
		}
	public WebDriver getDriver()
	{
		return driver;
	}
	
	
	public void TearDown()
	{
		driver.quit();

	}


}
