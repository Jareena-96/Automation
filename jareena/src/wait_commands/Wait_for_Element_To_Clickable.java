package wait_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class Wait_for_Element_To_Clickable {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		try
		{
			new WebDriverWait(driver,Duration.ofSeconds(20))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type,'number')]"))).sendKeys("9014078064");
		}
		catch (Exception e) 
		{
			
		}
		

	}

}
