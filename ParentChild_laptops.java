package selenium_autoSugessions;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ParentChild_laptops 
{
   public static void main(String[] args) throws InterruptedException
   {
	   ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement searchproduct = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchproduct.sendKeys("Laptops"+Keys.ENTER);
		
		Thread.sleep(3000);
		
	WebElement a1 =	driver.findElement(By.xpath("(//div[@class='rush-component'])[1]"));
	a1.click();
	Thread.sleep(3000);
	
	Set <String> pcid = driver.getWindowHandles();
	System.out.println(pcid);
	
	Iterator <String> id = pcid .iterator();
	String parentid = id.next();
	String childid = id.next();
	  
	driver.switchTo().window(childid);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
	 
	
		
		
}
}
