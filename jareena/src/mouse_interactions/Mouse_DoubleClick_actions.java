package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_DoubleClick_actions {

	public static void main(String[] args) throws Exception
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://bridgeqsys.com/demo.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Thread.sleep(20);
	WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-link collapsed'][contains(.,'Buttons')]"));
	button.click();
	
	WebElement twiseclick=driver.findElement(By.xpath("//button[@type='button'][contains(.,'Double Click Me')]"));
	new Actions(driver).doubleClick(twiseclick).perform();
	}

}
