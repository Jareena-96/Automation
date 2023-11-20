package verification_commands_getAttributes;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_EntryBox_Input_Value {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement dateMY=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
		Thread.sleep(3000);
		String act_date=dateMY.getAttribute("value");
		System.out.println(act_date);
		
		String exp_date=new SimpleDateFormat("dd/mm/yy").format(new Date(07/11/2023));
		
		if (exp_date.equals(act_date))
		{	
			System.out.println("date matched");	
		}
		else 
		{	
			System.out.println("date not matched");
		}

	}

}
