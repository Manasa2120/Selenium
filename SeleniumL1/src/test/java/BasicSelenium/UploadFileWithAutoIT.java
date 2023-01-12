package BasicSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileWithAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.getProperty("webdriver.chrome.driver", "./Selenium/Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\User\\Documents\\UploadAutoIT.exe");

	}

}
