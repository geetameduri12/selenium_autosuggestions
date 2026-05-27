package selenium_autoSugessions;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_ChildWindow1 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		   ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys("mobiles");
			WebElement e2 = driver.findElement(By.id("nav-search-submit-button"));
			e2.click();
			
			Thread.sleep(3000);
			
			WebElement e3 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
			e3.click();
			Thread.sleep(3000);
			
			Set < String> pcid = driver.getWindowHandles();
			System.out.println(pcid);
			
			Iterator <String> pc = pcid.iterator();
			String parentid = pc.next();
			String childid = pc.next();
			
			driver.switchTo().window(childid);
			Thread.sleep(5000);
			
			 driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
			
			
			
			
			
			
}
}