package selenium_autoSugessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCart_autosuggessions 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//span[text()='✕']"));
		e1.click();
		
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.name("q"));
		e2.sendKeys("toys");
		e2.click();
		Thread.sleep(3000);
		
	 List <WebElement> list = driver.findElements(By.xpath("//form/ul/li"));
		//List <WebElement> list = driver.findElements(By.xpath("//ul/li")); //(checking with onle parent and child)
		
	          int count =  list.size();
		System.out.println(count);
		list.get(count-1).click();
		
		
		
}
}
