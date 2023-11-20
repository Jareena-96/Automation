package browser_options_chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browser {

	public static void main(String[] args) throws Exception 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(option);
		System.out.println("browser is opened");
		
		driver.get("https://www.instagram.com/");
		System.out.println("page visible");
		
		Thread.sleep(4000);
		driver.close();
		System.out.println("page closed");
		
		
				
	}

}
