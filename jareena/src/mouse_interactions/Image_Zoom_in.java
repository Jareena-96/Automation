package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Image_Zoom_in {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/zoom/image-magnifier-on-hover.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement image=driver.findElement(By.xpath("//img[contains(@alt,'Product Image Zoom On Hover - jQuery Zoom.js')]"));
		new Actions(driver).moveToElement(image).pause(3000).click().perform();
		
		

	}

}
