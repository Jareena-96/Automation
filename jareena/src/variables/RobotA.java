package variables;

public class RobotA 
{
	String name="aman";
	int speed=40;
	public void printname()
	{
		System.out.println(name);
		}
	public void printspeed()
	{
		System.out.println(speed);
		
	}

	public static void main(String[] args) {
	String son=new RobotA().name;
	System.out.println(son);
	
	int moon=new RobotA().speed;
	System.out.println(moon);
	}

}
