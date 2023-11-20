package string;

public class String_Comparisions {

	public static void main(String[] args) 
	{
		//EQUALS
		String exp_name="jareena";
		String act_name="jareena";
		
		boolean flag=act_name.equals(exp_name);
		System.out.println("equal name"+flag);
		
		String exc_name="jareena";
		String acu_name="Jareena";
		
		boolean flag0=act_name.equals(exp_name);
		System.out.println("equal name"+flag0);


	}

}
