package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragElement_to_Target {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://marcojakob.github.io/dart-dnd/basic/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement file1 =driver.findElement(By.xpath("(//img[contains(@class,'document')])[1]"));
	WebElement file2 =driver.findElement(By.xpath("(//img[contains(@class,'document')])[2]"));
	WebElement file3 =driver.findElement(By.xpath("(//img[contains(@class,'document')])[3]"));
	WebElement file4 =driver.findElement(By.xpath("(//img[contains(@class,'document')])[4]"));
	WebElement dustbin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
	Actions files=new Actions(driver);
	files.dragAndDrop(file1, dustbin).perform();
	files.dragAndDrop(file2, dustbin).perform();
	
	//another syntax
	new Actions(driver).clickAndHold(file3).moveToElement(dustbin).release().perform();
	new Actions(driver).clickAndHold(file4).moveToElement(dustbin).release().perform();
	
	
	
	

	}

}
