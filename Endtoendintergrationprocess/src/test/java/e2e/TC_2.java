package e2e;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2 {
	
	@Test
	
	public void opengoogle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/nafizahmed/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
