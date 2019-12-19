package Jenkins_new_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test_new {
	
	@Test
	public void login1(){
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		System.setProperty("webdriver.gecko.driver",  "C:\\Ashish\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
	
	}

}
