package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://text-compare.com/");
		WebElement input=driver.findElement(By.id("inputText1"));
		WebElement input2=driver.findElement(By.id("inputText2"));

		input.sendKeys("Hari Om Narayana");

		Actions act=new Actions(driver);
		
		
       //CONTROL A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		//CONTROL C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
          //TAB
		act.sendKeys(Keys.TAB);

		   //CONTROL V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();

		if(input.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("Test copied Successfully");
		else
			System.out.println("Test not copied");

	}

}
