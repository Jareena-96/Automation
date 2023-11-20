package robot_windoe_interface;

import java.awt.Robot;

public class Robot_mouse_Syntax {

	public static void main(String[] args) throws Exception 
	{
		Thread.sleep(3000);
		Robot chitti2_0=new Robot();
		chitti2_0.setAutoDelay(800);
		
		chitti2_0.mouseMove(742, 377);
		
		

	}

}
