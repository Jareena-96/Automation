package java_script_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod_using_JSexecutor {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement newaccount=driver.findElement(By.xpath("(//span[contains(.,'Create free account')])[1]"));
		//clickmethod using javascriptexecutor option
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",newaccount);
		Thread.sleep(4000);
		
		jse.executeScript("document.querySelector(\"#MemberName\").value='mdjareena7744'");
		jse.executeScript("document.querySelector(\"#iSignupAction\").click()");
		
		

	}

}
