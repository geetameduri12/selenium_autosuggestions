package selenium_autoSugessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions_Amazon 
{
  public static void main(String[] args) throws InterruptedException 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoes");
	Thread.sleep(3000);
	List <WebElement> list = driver.findElements(By.xpath("//div[@role='rowgroup']/div/div"));
	int count  = list.size();
	System.out.println(count);
	Thread.sleep(3000);
	WebElement e2 = list.get(count-1);
	e2.click();
	
	
	
	
}
}
