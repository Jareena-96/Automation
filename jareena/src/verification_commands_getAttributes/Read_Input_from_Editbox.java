package verification_commands_getAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Input_from_Editbox {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]"));
		login.click();
		
		WebElement myinfo=driver.findElement(By.xpath("(//a[contains(@class,'oxd-main-menu-item')])[6]"));
		myinfo.click();
		
		Thread.sleep(3000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[contains(@name,'firstName')]"));
		boolean flag=firstname.getAttribute("value").contains("Ahmed");
		System.out.println(flag);

	}

}
