package facebook.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firsttest {

	@Test
	public void firsttestMethod(){
	WebDriver driver = new FirefoxDriver();
	
	// open faceboook.com
	driver.get("www.facebook.com");
	System.out.println("facebook page opened");
	driver.quit();
	
	}
	
}
