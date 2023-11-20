package swotchcommands_window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_NextWindow {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement metaoption=driver.findElement(By.linkText("Meta"));
		metaoption.click();
		Thread.sleep(4000);
		
		Set<String>  allwindowPages=driver.getWindowHandles();//set of windowpages
		
		Iterator<String> itor=allwindowPages.iterator();//separation of windowpages
		
		String Window1=itor.next();  //set in order of all pages
		String Window2=itor.next();
		
		driver.switchTo().window(Window2);         // selection of each page   
		System.out.println("window name"+driver.getTitle());
		
		driver.switchTo().window(Window1);
		System.out.println("window name"+driver.getTitle());
		
		//THIS PROGRAM HAS TO BE USE WHEN ONLY 2 WINDOWS ARE OPENED
		//WHY BECAUSE SET OPTION TAHT WE USED IN SYNTAX IS CAPABLE OF 2 WINDOWS 
		//IF WE USED IT WHEN MORE THAN 2 WINDOWS THE ORDER OF OBJECTS OR ELEMENTS ARE MUST BE CHANGED
		//AND ALSO MORE THAN 2 ITERATIONS ALSO CAN'T BE USED 
		
		

	}

}
