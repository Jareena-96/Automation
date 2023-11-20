package verification_commands_getAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_RunTime_Properties {

	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[contains(.,'Round Trip')]"));
		Thread.sleep(4000);
		Roundtrip.click();
		String Roundtripclas=Roundtrip.getAttribute("clas");
		if (Roundtripclas.contains("selected")) 
		{
			System.out.println("round trip class is selected");	
		}
		WebElement Doubleseat=driver.findElement(By.xpath("//p[contains(.,'Double Seat  Fares')]"));
				if (Doubleseat.getAttribute("clas").contains("not visible")) 
				{
					System.out.println("exam pass when roundtrip is selected and doublefare is notappears");
				} 
				else 
				{
					System.out.println("exam fail when roundtrip is selected and doublefare is appears");
				}
		
		{
			System.out.println("round trip class is not selected");
		}								
	}

}
