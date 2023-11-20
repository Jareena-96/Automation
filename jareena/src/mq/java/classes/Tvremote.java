package mq.java.classes;

public class Tvremote 
{
public void on()
{
	System.out.println("television on");
}
public void off()
{
System.out.println("television off");	
}
public static void main(String[] args) 
{
	new Tvremote().on();
	new Tvremote().off();

}
}
