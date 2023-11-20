package mypractice;

public class VariablesSTRING_INT_DOUBLE_Calling 
{
	int k=854;
	double speed=3456.789;
	public void sister() 
	{
		String name="sadhiya";
		
	System.out.println(name);
	}
	public void brother() 
	{
		String name="firoz";
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		int x=new VariablesSTRING_INT_DOUBLE_Calling().k;
		System.out.println(x);
		double y=new  VariablesSTRING_INT_DOUBLE_Calling().speed;
		System.out.println(y);
		
		new  VariablesSTRING_INT_DOUBLE_Calling ().sister();
		new VariablesSTRING_INT_DOUBLE_Calling ().brother();

	}

}
