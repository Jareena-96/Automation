package browser_options_chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_default_maximize_page {

	public static void main(String[] args) throws Exception
	{
	ChromeOptions option=new ChromeOptions();
	option.addArguments("start_maximized");
	
	WebDriver driver=new ChromeDriver(option);
	Thread.sleep(3000);
	driver.get("https://www.instagram.com/");
	
	}

}
