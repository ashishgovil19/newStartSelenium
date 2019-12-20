package Jenkins_new_Java;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testing {
	
	public WebDriver driver;
	
	@Test
	public void login1(){
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		System.setProperty("webdriver.gecko.driver",  "C:\\Ashish\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		
	 driver=new FirefoxDriver();
		driver.get("https://google.com");
		System.out.println("----------------------------->"+driver.getTitle());
	
	}
	
	@Test
	public void getData(){
		System.out.println("---------------------------------> data is 37 pounds");
		Assert.fail();
	}
	
	@Test
	public void success(){
		System.out.println("---------------------------------> This data is success");

	}
	
	@AfterTest
	public void tear(){
		driver.quit();
	}
	

}
