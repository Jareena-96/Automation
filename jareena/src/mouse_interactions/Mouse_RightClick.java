package mouse_interactions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Mouse_RightClick {

	public static void main(String[] args)throws Exception
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral'][contains(.,'right click me')]"));
	new Actions(driver).contextClick(rightclick).perform();
	Thread.sleep(2000);
	WebElement clickdelete=driver.findElement(By.xpath("//li[contains(.,'Delete')]"));
	new Actions(driver).click(clickdelete).perform();
	
	

	}

}
