package switch_commands_alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling_SendKeys {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement textbox=driver.findElement(By.xpath("//a[@href='#Textbox']"));
		textbox.click();
		
		Thread.sleep(2000);
		WebElement promptbox=driver.findElement(By.xpath("//button[contains(@onclick,'promptbox()')]"));
		promptbox.click();
		
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("9014078064");
		
		alert.accept();
		

	}

}
