package callbyReferences;

public class Product 
{
	String name="i phone";
	public void setprrice(double price)// call by value in a method
	{System.out.println(price);
		
	}
	public static void main(String[] args)
	{
		Product jari=new Product();
		jari.setprrice(23456.8656);
	}

}
