package verification_commands;

import java.time.Duration;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Present_on_Pagesource {

	public static void main(String[] args)
	{
			WebDriver driver=null;
		try
		{
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.manage().window().maximize();
		}
		catch (IllegalStateException e)
		{
			e.printStackTrace();
		if (driver!=null) 
		{
				try
					{
					driver.get("https://www.facebook.com/");
					System.out.println("succesfully page loaded");
					}
				catch (SessionNotCreatedException e2)
					{
					e.printStackTrace();
					System.out.println("mismatching of browser version");
					}
				catch(InvalidArgumentException e3)
					{
					e.printStackTrace();
					System.out.println("wrong url");
					}		
		}	
		 else {

		}	
		}

	}

}
