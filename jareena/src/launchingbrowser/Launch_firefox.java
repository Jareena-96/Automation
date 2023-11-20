package launchingbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String seepagedetails=driver.getTitle();
		System.out.println(seepagedetails);
		driver.close();
			

	}

}
