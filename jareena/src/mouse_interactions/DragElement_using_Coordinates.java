package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragElement_using_Coordinates {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com/home-loan-emi-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement slide1=driver.findElement(By.xpath("(//div[contains(@class,'calculator-inp-wrap')])[1]"));
		new Actions(driver).dragAndDropBy(slide1, 500, 0).perform();
		
		WebElement slide2=driver.findElement(By.xpath("//*[@id=\"js-rangeslider-1\"]/div[2]"));
		int Beforex =slide2.getLocation().getX();
		new Actions(driver).dragAndDropBy(slide2, -200, 0).perform();		
		int Afterx=slide2.getLocation().getX();
		
		if (Afterx < Beforex)
			System.out.println("drag succesfully");
		else
			System.out.println("drag fail");
		
		
		

	}

}
