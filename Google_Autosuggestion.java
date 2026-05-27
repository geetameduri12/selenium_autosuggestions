package selenium_autoSugessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google_Autosuggestion
{
   public static void main(String[] args) throws InterruptedException
   {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement a1 = driver.findElement(By.id("APjFqb"));
	  a1.sendKeys("india country");
	  Thread.sleep(3000);
	  	  List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	  int count = list.size();
	  System.out.println(count);
	  
	 /* WebElement E1 = list.get(count-1);
	  E1.click();*/
	  Thread.sleep(3000);
	  list.get(count-5).click();
	  
	  
	  
	  
}
}
