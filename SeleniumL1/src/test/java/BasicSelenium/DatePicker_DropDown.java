package BasicSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_DropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://bookonwardticket.com");
		
		driver.findElement(By.xpath("//input[@id='dummy-departure-date']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
                year.selectByVisibleText("2024");
               Select month=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
               month.selectByVisibleText("Jul");
               
               String date="21";
               
               List<WebElement> Alldt=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
               
               for(WebElement ele:Alldt) {
            	String dat = ele.getText();
            	if(dat.equals(date)) {
            		ele.click();
            		break;
            	}
               }
	}

}
