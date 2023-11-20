package wait_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_for_Title {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Facebook"));
		System.out.println("Facebook title present");
		
		WebElement fgp= driver.findElement(By.xpath("//a[contains(.,'Forgotten password?')]"));
		fgp.click();
		
		boolean flag=false;
		try
		{
			flag=wait.until(ExpectedConditions.titleContains("Forgotten password"));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("flag");
		
		WebElement login=driver.findElement(By.xpath("(//span[contains(.,'Log in')])[4]"));
		login.click();
		
	}

}
