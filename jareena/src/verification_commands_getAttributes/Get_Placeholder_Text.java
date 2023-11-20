package verification_commands_getAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Placeholder_Text {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.facebook.com/");
		
	WebElement email=driver.findElement(By.id("email"));
	String placeholder_of_email=email.getAttribute("placeholder");
	
	if (placeholder_of_email.equals("email or phone number")) 
	{
		System.out.println(" placeholder text present for email ");
		
	} 
	else 
	{
		System.out.println(" placeholder text not present for email");
	}
		

	}

}
