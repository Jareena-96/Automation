package verification_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_of_Title_Present_Webpage {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		try
		{
			driver=new ChromeDriver();
		} 
		catch (Exception e)		
		{
			e.printStackTrace();
		}
		if (driver!=null) 
		{
			driver.get("https://www.facebook.com/");
			String Runtimetitle=driver.getTitle();
			String expctitle="Facebook – log in or sign up";
			
			if (Runtimetitle.equals(expctitle))
			{
				System.out.println("title appears");
			}
			else 
			{
				System.out.println("title not present");
			}
			
		} else
			
				System.out.println("browser launch is failed");	
		try
		{
			Thread.sleep(3000);
			driver.close();
		}
		catch (InterruptedException exception ){ 									
		
		}	

		}

}
