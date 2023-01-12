package BasicSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_table1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/admin/");

		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		driver.findElement(By.xpath("//button[@class='btn-close']")).click();




		//	Set<String>all= driver.getWindowHandles();

		//	Iterator<String> it=all.iterator();

		//	String parentWindow=it.next();
		//	System.out.println("Parent window id:"+parentWindow);

		//String childWindow=it.next();
		//	System.out.println("chid Window is:"+childWindow);

		//	driver.switchTo().window(childWindow);
		//	System.out.println("child window pop up title "+driver.getTitle());
		//	driver.close();

		//	driver.switchTo().defaultContent();


		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();


		//total number of pages in table
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);//Showing 1 to 10 of 96 (10 Pages)

		int Total_pages=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println("Total number of pages"+Total_pages);
		
		for(int p=1;p<=Total_pages;p++) {
		WebElement active_page=	driver.findElement(By.xpath(" //ul[@class='pagination']//li//span"));
		System.out.println("Active Page "+active_page.getText());
		active_page.click(); 
		
		int totalrows=driver.findElements(By.xpath(" //table[@class='table table-bordered table-hover']//tbody//tr")).size();
		System.out.println("Number of rows are"+totalrows);
		
		
		String pageNo=Integer.toString(p+1);
		driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageNo+"']")).click();
	}
	}
}
