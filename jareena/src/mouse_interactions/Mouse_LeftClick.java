package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_LeftClick {

	public static void main(String[] args)throws Exception
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://bridgeqsys.com/demo.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement upload=driver.findElement(By.xpath("//button[@class='btn btn-link collapsed'][contains(.,'Upload & Download')]"));
	upload.click();
	Thread.sleep(4000);
	WebElement file=driver.findElement(By.xpath("//input[contains(@id,'uploadFile')]"));
	new  Actions(driver).click(file).perform();
	
	}

}
