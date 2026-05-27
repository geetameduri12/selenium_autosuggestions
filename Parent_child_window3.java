package selenium_autoSugessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Parent_child_window3 
{
  public static void main(String[] args) throws InterruptedException
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  
	   Thread.sleep(3000);
	   
	  WebElement E1 = driver.findElement(By.id("gh-ac"));
	   E1.sendKeys("clothes");
	   
	   WebElement e1 =  driver.findElement(By.id("gh-search-btn"));
		  Select a1 = new Select(e1);
	  
	   
	   
	   
	   
}
}
