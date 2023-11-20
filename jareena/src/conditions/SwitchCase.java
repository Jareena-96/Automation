package conditions;

public class SwitchCase {

	public static void main(String[] args)
	{
		int month=2;
		switch (month) 
		{		
		case 1:
				System.out.println("jan");
				break;
		case 2:
				System.out.println("feb");
				break;
		case 3:
				System.out.println("mar");
				break;
		case 4:
				System.err.println("april");
				break;
		default:
				System.out.println("month not matched");
			break;
		}
		String browser="chrome";
		switch (browser)
		{
		case "chrome":
				System.out.println("chrome browser is launched");
				break;
		case "edge":
				System.out.println("edge browser is launcged");
				break;
		default:
				System.out.println("browser is mismatched");
			break;
		}

	}

}
