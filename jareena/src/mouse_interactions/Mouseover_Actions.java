package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover_Actions {

	public static void main(String[] args) throws Exception
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement jobs =driver.findElement(By.xpath("(//div[contains(.,'Jobs')])[4]"));
	new Actions(driver).moveToElement(jobs).perform();
	Thread.sleep(2000);
	WebElement Fresherjobs =driver.findElement(By.xpath("(//div[contains(.,'Fresher jobs')])[5]"));
	new Actions(driver).click(Fresherjobs).perform();
	
	}

}
