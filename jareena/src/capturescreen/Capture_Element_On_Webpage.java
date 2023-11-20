package capturescreen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Element_On_Webpage {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://outlook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.findElement(By.xpath("//div[@class='card-body p-4 p-md-5']"));
		

	}

}
