package verification_commands_get_CssValues;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reading_Object_Style {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]"));
		String backgroundcolor=loginbutton.getCssValue("background-color");
		System.out.println(backgroundcolor);
	}

}
