package selenium_autoSugessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_autosuggessions
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement studentname = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		studentname.sendKeys("toys");
		
		 Thread.sleep(3000);
		List <WebElement > list = driver.findElements(By.xpath("//div[@role='rowgroup']/div/div"));
		int count = list.size();
		System.out.println(count);
		
}
}
