package callbyReferences;

public class Products
{
	String name ="samsung";
	double price=3558.89;
	public void printdetails() {
		System.out.println(name);
		System.out.println(price);
	}
public static void main(String[] args)
{
	Products hny=new Products();
	hny.printdetails();
	
	
}
	
		
	

	}


