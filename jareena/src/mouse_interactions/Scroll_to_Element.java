package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_to_Element {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement down=driver.findElement(By.xpath("//span[@class='navFooterBackToTopText'][contains(.,'Back to top')]"));
		new Actions(driver).scrollToElement(down).perform();
		
		WebElement signinbutton=driver.findElement(By.xpath("//span[@class='action-inner'][contains(.,'Sign in')]"));
		signinbutton.click();
		
		
	}

}
