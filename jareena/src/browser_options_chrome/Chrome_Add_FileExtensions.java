package browser_options_chrome;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Add_FileExtensions {

	public static void main(String[] args)
	{
		ChromeOptions option=new ChromeOptions();
		option.addExtensions(new File(""))	;
		option.addExtensions(new File(""));
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
	}

}
