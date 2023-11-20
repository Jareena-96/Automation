package parameters;

public class Firststep 
{
	public void run(int km) 
	{
		System.out.println(km);
		
	}

	public static void main(String[] args) {
		Firststep obj1=new Firststep();
System.out.println(obj1);
obj1.run(30);
	}

}//if the method repeats more than 1 time we can use this process by using functional parameters nd actual parameters//
//functional parameters are in method body
//actual parameters are in main method or calling method
