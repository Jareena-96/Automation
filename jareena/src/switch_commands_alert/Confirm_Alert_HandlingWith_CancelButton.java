package switch_commands_alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm_Alert_HandlingWith_CancelButton {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement cancel=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		cancel.click();
		Thread.sleep(3000);
		WebElement confirmbox=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirmbox.click();
		
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(3000);
		String msg_alert=alert.getText();
		System.out.println(msg_alert);
		
		Thread.sleep(3000);
		alert.dismiss();
		
		driver.close();
		
	}

}
