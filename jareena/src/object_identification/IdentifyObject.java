package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyObject 
{

	public static void main(String[] args)throws Exception 
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.id("email")).sendKeys("disoosdkihjogfks");
	driver.findElement(By.id("pass")).sendKeys("dhjfri@567");
	driver.findElement(By.id("login")).click();
	

	}

}
