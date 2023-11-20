package mq.java.classes;

public class Callingfunctions 
{

	public static void method1() 
	{
	System.out.println("method1 executed");	
	new Callingfunctions().method3();   
	}
	public void method2()
	{
	System.out.println("method2 executed");	
	method1();
	}
	public void method3() 
	{
	System.out.println("method3 executed");
	
	}
	
	public static void main(String[] args)
	{
	new Callingfunctions().method2();
	
}
}