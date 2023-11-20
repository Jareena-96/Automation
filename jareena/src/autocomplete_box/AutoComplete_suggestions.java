package autocomplete_box;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_suggestions {

	public static void main(String[] args)throws Exception
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
	
	Thread.sleep(2000);
	WebElement pim =driver.findElement(By.xpath("//a[@class='oxd-main-menu-item'][contains(.,'PIM')]"));
	pim.click();
	driver.findElement(By.xpath("(//input[contains(@placeholder,'Type for hints...')])[1]")).sendKeys("Ki");
	driver.findElement(By.xpath("//span[contains(.,'Kiyara  Hu')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[contains(@placeholder,'Type for hints...')])[2]")).sendKeys("Ru");
	driver.findElement(By.xpath("//div[@role='option'][contains(.,'Russel  Hamilton')]")).click();
	
			
	}
	
}
