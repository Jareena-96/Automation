
package typesof_Methods;

public class Types_of_methods
{
	public void type1() 
	{	
	}
	public int type2()
	{
		return 600;
	}
	public char type3() 
	{
		return 'j';
	}
	public String type4() 
	{
		return "aman";		
	}
	public boolean type5() 
	{
		boolean shows=true;
		return shows;
	}
	public static void main(String[] args)
	{
		Types_of_methods rafi=new Types_of_methods();
		
		rafi.type1();
		
		int val=rafi.type2();
		System.out.println(val);
		
		char cr=rafi.type3();
		System.out.println('j');
		
		String sonname=rafi.type4();
		System.out.println(sonname);
		
		boolean shows=rafi.type5();
		System.out.println(shows);
	}

}
