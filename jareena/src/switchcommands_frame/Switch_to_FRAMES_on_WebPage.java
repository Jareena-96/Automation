package switchcommands_frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_FRAMES_on_WebPage {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/bushire/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		// identification of frame page on webpage.
		WebElement placeofframe=driver.findElement(By.xpath("//object[contains(@data,'/ryde/req.html?hideBackArrow=true&isDesktop=true')]"));
		driver.switchTo().frame(placeofframe);
		//on framepage element identification.
		WebElement outstationlocation=driver.findElement(By.xpath("(//div[contains(.,'OutstationAnywhere outside your city')])[5]"));
		outstationlocation.click();
		//get back to webpage from framepage.
		driver.switchTo().defaultContent();
		
	
		
		
		
	}

}
