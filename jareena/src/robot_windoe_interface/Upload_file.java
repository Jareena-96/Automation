package robot_windoe_interface;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(2000);
		WebElement uplFile=driver.findElement(By.xpath("//button[contains(.,'Upload Resume')]"));
		uplFile.click();
		String path="C:\\Users\\hanee\\OneDrive\\Desktop\\jari";
		StringSelection way=new StringSelection(path);
		
		Clipboard keyboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		keyboard.setContents(way, null);
		
		
		
	}

}
