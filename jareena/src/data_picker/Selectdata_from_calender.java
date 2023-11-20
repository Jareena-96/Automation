package data_picker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectdata_from_calender {

	public static void main(String[] args)throws Exception {
		

	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
	
	Thread.sleep(20);
	driver.findElement(By.xpath("//a[contains(.,'Leave')]")).click();
	driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).click();
	driver.findElement(By.xpath("//div[@class='oxd-calendar-date'][contains(.,'16')]")).click();
	Thread.sleep(20);
	driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).click();
	driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']")).click();
	Thread.sleep(20);
	driver.findElement(By.xpath("")).click();
	
	
	
	

	}


}
