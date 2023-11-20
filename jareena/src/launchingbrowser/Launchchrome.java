package launchingbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {

	public static void main(String[] args)
	{
	ChromeDriver chrome=new ChromeDriver();
	chrome.get("https://www.instagram.com/");
	String pageTitle=chrome.getTitle();
	System.out.println(pageTitle);
	chrome.close();
	}

}
 