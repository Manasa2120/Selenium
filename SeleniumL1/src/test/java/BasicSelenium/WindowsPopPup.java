package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsPopPup {
	
	
	@Test
	public void PopUp() {
		WebDriver driver;
		System.getProperty("webdriver.chrome.driver", "./Selenium/Driver/chromedriver.exe");
		 driver=new ChromeDriver();
		//https://the-internet.herokuapp.com/
		 driver.get("https://admin:admin@the-internet.herokuapp.com/");
		 driver.findElement(By.linkText("Basic Auth")).click();
	WebElement ele=	 driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]"));
		 ele.getText();
		 String ExpText="Congratulations! You must have the proper credentials.";
		 Assert.assertEquals(ele, ExpText);
		// driver.close();
		
	}

}
