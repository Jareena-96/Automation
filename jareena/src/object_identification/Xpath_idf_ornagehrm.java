package object_identification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_idf_ornagehrm
{

	public static void main(String[] args)throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		
		Thread.sleep(4000);				
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("jareena"+Keys.TAB);
		driver.findElement(By.name("middleName")).sendKeys("rafi"+Keys.TAB);
		driver.findElement(By.name("lastName")).sendKeys("hnyaman"+Keys.TAB);
		driver.findElement(By.xpath("//input[contains(@class,'oxd-input oxd-input--focus')]")).sendKeys("0312");
		
		driver.findElement(By.xpath("//p[contains(@class,'oxd-userdropdown-name')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		
		
		
		
	}	
}