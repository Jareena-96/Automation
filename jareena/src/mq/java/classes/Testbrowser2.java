package mq.java.classes;

public class Testbrowser2 
{
         public void openbrowser()
         {
         System.out.println("open web page");
         }
         public void loadwebpage() 
{
         System.out.println("shows application");	
}
         public void enterusername() 
{
         System.out.println("user name entry finished");
}
public void enterpassword() 
{
	System.out.println("password entry finished");	
}
public void showslogindetails()
{
System.out.println("login details submitted");	
}

	public static void main(String[] args)
	{
		   new Testbrowserapp().openbrowser();
		  new Testbrowserapp().loadwebpage();
		   new Testbrowserapp().enterusername();
		   new Testbrowserapp().enterpassword();
		    new Testbrowserapp().showslogindetails();

	}
}
