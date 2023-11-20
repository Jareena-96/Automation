package mq.java.classes;

public class SampleClass 
{
	public static void start()
	{
	System.out.println("start");
	}
	public void change() 
	{
		System.out.println("change");
	}
	public static void main (String[] args) 
	{
	 SampleClass.start();
	 new SampleClass().change();
	}
}
