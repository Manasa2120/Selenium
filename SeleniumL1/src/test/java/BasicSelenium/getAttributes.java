package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAttributes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/");
		
	WebElement mail=driver.findElement(By.id("Email"));
	 System.out.println( mail.getAttribute("value"));
	mail.clear();
	mail.sendKeys("chirutha413@gmail.com");
	
	WebElement pass=driver.findElement(By.id("Password"));
	pass.clear();
	pass.sendKeys("abc12334");
	
WebElement title=driver.findElement(By.xpath("//div[@class='page-title']//h1"));
  System.out.println(title.getText());
	
	

	}

}
