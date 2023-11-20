
package variables;


public class VariableTypes {

	int j=700;
	double cost=2345.890;
	
	public void daughter()
	{
		String name="Haneefa";
	System.out.println(name);
	
	}
	public void son()
	{
		String name="Aman";
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		int y=new VariableTypes().j;
		System.out.println(y);
		double z=new VariableTypes().cost;
		System.out.println(z);
		new VariableTypes().daughter();
		new VariableTypes().son();
	}
	}













