package selenium_autoSugessions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_parentChildWindow
{
  public static void main(String[] args) throws InterruptedException
  {
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.naukri.com/registration/createAccount?");
	 driver.manage().window().maximize();
	
	 Thread.sleep(3000);
	 WebElement E1 = driver.findElement(By.xpath("//span[text()='Google']"));
	 E1.click();
	 
	 Thread.sleep(3000);
	 
	  Set <String> pcid =driver.getWindowHandles();
	    System.out.println(pcid);
}
}
