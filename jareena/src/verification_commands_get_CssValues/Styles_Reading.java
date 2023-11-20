package verification_commands_get_CssValues;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Styles_Reading {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement forgetpassword=driver.findElement(By.xpath("//p[contains(.,'Forgot your password?')]"));
		
		String color=forgetpassword.getCssValue("color");	//reading text color
		System.out.println(color);
		
		String fontsize=forgetpassword.getCssValue("font-size");	//reading font_size
		System.out.println(fontsize);
		
		String cursor=forgetpassword.getCssValue("cursor");		//getting  cursor type
		System.out.println(cursor);
		
		String result=forgetpassword.getCssValue("display");
		if (result.equals("none"))
		{
			System.out.println("object is visible");
			
		}
		else 
		{
			System.out.println("object was not visible");
		}
		
	}

}
