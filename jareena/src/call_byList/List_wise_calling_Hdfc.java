package call_byList;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_wise_calling_Hdfc 
{

	public static void main(String[] args)throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Select Product Type")).click();
		driver.findElement(By.xpath("//li[@value='3'][contains(.,'Deposits')]")).click();
		
		Thread.sleep(3000);	
		driver.findElement(By.linkText("Select Product")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[13]/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div/div/div[3]/div/a/span")).click();
	}
}	