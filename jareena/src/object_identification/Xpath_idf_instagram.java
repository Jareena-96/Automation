package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_idf_instagram {

	public static void main(String[] args)throws Exception
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("jareena");
		driver.findElement(By.name("password")).sendKeys("hny@345");
		driver.findElement(By.xpath("(//div[contains(.,'Log in')])[14]")).click();
		
		
	}

}
