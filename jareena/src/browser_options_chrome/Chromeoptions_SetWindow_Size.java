package browser_options_chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Chromeoptions_SetWindow_Size {

	public static void main(String[] args)throws Exception 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("window_size=300,500");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://naukri.com");
		Thread.sleep(3000);
		

	}

}
