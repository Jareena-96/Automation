package switchcommands_frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_To_Framepage_usingFrameURL {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/info/redcare");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//getting Frame URL
		driver.navigate().to("https://www.redbus.in/login?offerType=Support&defaultSlide=home&isOnlyMobile=false");
		
		WebElement phonenumber=driver.findElement(By.xpath("//input[contains(@id,'mobileNoInp')]"));
		phonenumber.sendKeys("90114078064");
		Thread.sleep(3000);
		
		//getback to main page
		driver.navigate().back();
		
	
	
		
	}

}
