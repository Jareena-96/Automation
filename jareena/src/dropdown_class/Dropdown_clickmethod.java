package dropdown_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_clickmethod {

	public static void main(String[] args)throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		
		WebElement	date=driver.findElement(By.id("day"));
		date.findElement(By.xpath("//option[@value='10'][contains(.,'10')]")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		month.findElement(By.xpath("//option[@value='2'][contains(.,'Feb')]")).click();
		
		WebElement year=driver.findElement(By.xpath("//select[contains(@aria-label,'Year')]"));
		year.findElement(By.xpath("//option[@value='2016'][contains(.,'2016')]")).click();
		
						
						
	}

}
