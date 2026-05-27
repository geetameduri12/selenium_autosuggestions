package selenium_autoSugessions;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Parent_childWindow 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		WebElement e2 = driver.findElement(By.id("nav-search-submit-button"));
		e2.click();
		Thread.sleep(3000);
		WebElement e3 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e3.click();
		       Set <String> pcid = driver.getWindowHandles();
		       System.out.println("Parent &  Child id's are :" + pcid);
}
}
