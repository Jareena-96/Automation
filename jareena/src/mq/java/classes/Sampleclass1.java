package mq.java.classes;

public class Sampleclass1 {

	public static void start () 
	{
	System.out.println("start");
	}
public void change() 
{
	System.out.println("change");
	}
	public static void main(String[] args)
	{
		Sampleclass1.start();
		new Sampleclass1().change();
	}
		
	}



