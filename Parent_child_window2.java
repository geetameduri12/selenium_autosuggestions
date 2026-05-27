package selenium_autoSugessions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Parent_child_window2
{
   public static void main(String[] args) throws InterruptedException 
   {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  
	   Thread.sleep(3000);
	   
	   /*WebElement E1 = driver.findElement(By.id("gh-ac"));
	   E1.sendKeys("clothes for women");*/
	   
	  WebElement e1 =  driver.findElement(By.id("gh-cat"));
	  Select a1 = new Select(e1);
	  a1.selectByVisibleText("Books");
	  
	  WebElement e2 = driver.findElement(By.id("gh-search-btn"));
	  e2.click();
	  
	  Thread.sleep(3000);
	 
	  WebElement e3 = driver.findElement(By.xpath("(//a[@class='brw-eventbanner'])[2]"));
	  e3.click();
	  
	  Thread.sleep(3000);
	  WebElement e4 = driver.findElement(By.xpath("((//a[@class='brwrvr__item-card__image-link'])[1]"));
	  e4.click();
	  
	  Set <String> pcid = driver.getWindowHandles();
	  System.out.println(pcid);
	  
	  
	  
	  
	 

	   
}
}
