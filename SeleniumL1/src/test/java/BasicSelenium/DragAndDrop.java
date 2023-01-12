package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

		
		public static void main(String[] args) {
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
			
		WebElement item1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement item2=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		
		 WebElement target=  driver.findElement(By.xpath("//div[@id='trash']"));
		 
		 Actions act=new Actions(driver);
		 
		 act.dragAndDrop(item1, target).perform();
		 act.dragAndDrop(item2, target).perform();

	}

}
