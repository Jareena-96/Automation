package swotchcommands_window;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_NewWindow {

	public static void main(String[] args) throws Exception
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//when we want to getback to mainpage we caa use windowhandles 
	String mainwindowpage=driver.getWindowHandle();
	Thread.sleep(3000);
	
	//create new window in same page or else exicisting page
	WebDriver blogwindow=driver.switchTo().newWindow(WindowType.WINDOW);
	blogwindow.get("https://about.instagram.com/en_US/blog");
	String blogwindowpage=blogwindow.getWindowHandle();
	System.out.println(blogwindowpage);
	
	//getback to mainpage	
	driver.switchTo().window(mainwindowpage);
	

	}

}
