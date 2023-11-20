package mypractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_NewWindow_Page {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	String mainwindow=driver.getWindowHandle();
	WebDriver terms=driver.switchTo().newWindow(WindowType. WINDOW);
	terms.get("https://help.instagram.com/581066165581870/");
	String termswindowpage =terms.getWindowHandle();
	System.out.println(termswindowpage);
	
	driver.switchTo().window(mainwindow);
	}

}
