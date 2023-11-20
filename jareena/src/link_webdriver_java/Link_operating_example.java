package link_webdriver_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_operating_example {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("email")).sendKeys("mdjareena7744@gmail.com"+Keys.TAB);
		driver.findElement(By.name("pass")).sendKeys("yegfhdhj@589"+Keys.TAB);
		driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login_button')]")).click();
		driver.findElement(By.linkText("Forgotten account?")).click();

	}

}
