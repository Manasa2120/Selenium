package BasicSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadTheFile {

	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=2"
				+ "3531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brandcom&gclid=Cj0KCQiA7bucBhCeARIsAIOwr--HH7A5uPnJ0jpVZseJ4X9sa_DQrxMbkwd3V0BYVbaNwXQ2x2owWSMaAofhEALw_wcB&gclsrc=aw.ds"
				+ "");
	WebElement button=	driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']"));
	       button.click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", button);//click on the button
	       
	       Robot rb=new Robot();
	       rb.delay(1000);
	       StringSelection ss=new StringSelection("C:\\Admin\\resume");
	       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	       
	       //Ctrol V
	       rb.keyPress(KeyEvent.VK_CONTROL);//press on ctrl key
	       rb.keyPress(KeyEvent.VK_V);
	       
	       rb.keyRelease(KeyEvent.VK_CONTROL);
	       rb.keyRelease(KeyEvent.VK_V);
           
	       rb.keyPress(KeyEvent.VK_ENTER);
	       rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
