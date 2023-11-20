package dropdown_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_facebook {



	public static void main(String[] args)throws Exception 
	{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Thread.sleep(2000);
	
	WebElement date=driver.findElement(By.id("day"));
	new Select(date).selectByVisibleText("16");
	
	WebElement monthname=driver.findElement(By.id("month"));
	new Select(monthname).selectByValue("5");
	
	WebElement yearname	=driver.findElement(By.id("year"));
	new Select(yearname).selectByIndex(17);
	}

}