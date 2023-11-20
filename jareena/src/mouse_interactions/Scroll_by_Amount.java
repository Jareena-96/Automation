package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_by_Amount {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement back2top=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		int objectY=back2top.getLocation().getY();
		new Actions(driver).scrollByAmount(0, objectY).perform();
		new Actions(driver).scrollByAmount(300, 0).perform();//object left to right
		new Actions(driver).scrollByAmount(-100, 0).perform();//object right to left
	}
}
