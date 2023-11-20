package verification_commands_getAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute_inPaytm_App {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://paytm.com/");
		WebElement prepaid=driver.findElement(By.xpath("(//div[contains(.,'RechargePrepaidMobile')])[5]"));
		prepaid.click();
		
		WebElement phonenumber=driver.findElement(By.xpath("//input[contains(@type,'tel')]"));
		phonenumber.sendKeys("9014078064");
		
		String jio=phonenumber.getAttribute("value");
		
		if (jio.equals(jio)) 
		{
			System.out.println("jio appears");
			
		}
		else 
		{	System.out.println("jio not appears");

		}
		

	}

}
