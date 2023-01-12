package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
	List<WebElement>row=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
	
	boolean dataStatus=false;
	
	for(WebElement ele:row) {
	int size=row.size();
	String rowvalues=ele.getText();
	System.out.println(rowvalues);
	if(rowvalues.contains("Meta")) {
		dataStatus=true;
		break;
	}
	}
	
     System.out.println("size");
     
     
        int coloum=driver.findElements(By.xpath("//table[@id='customers']//tbody//th")).size();
        System.out.println(coloum);
        
      String s=  driver.findElement(By.xpath("//table[@id='customers']//tbody/tr[5]/td[3]")).getText();
      
      System.out.println("the particuar tabe nmae is"+s);
      
	}

}
