package link_webdriver_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Link {

	public static void main(String[] args)throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Locations")).click();
		driver.findElement(By.linkText("India")).click();
		driver.findElement(By.linkText("Nerul")).click();
		driver.findElement(By.linkText("The Game Garden")).click();
		driver.findElement(By.xpath("//a[@href='/accounts/emailsignup/']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("emailOrPhone")).sendKeys("mdjareena7744@gmail.com"+Keys.TAB);
		

	}
}