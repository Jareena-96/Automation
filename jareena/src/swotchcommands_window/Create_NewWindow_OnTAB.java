package swotchcommands_window;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_NewWindow_OnTAB {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String windowmainpage=driver.getWindowHandle();
		
		//create new window on tab
		Thread.sleep(3000);
		WebDriver jobswindow=driver.switchTo().newWindow(WindowType.TAB);
		jobswindow.get("https://www.instagram.com/");
		String jobswindowmainpage=jobswindow.getWindowHandle();
		System.out.println(jobswindowmainpage);
		
		driver.switchTo().window(windowmainpage);

	}

}
