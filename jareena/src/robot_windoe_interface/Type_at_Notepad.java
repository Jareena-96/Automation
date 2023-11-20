package robot_windoe_interface;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Type_at_Notepad {

	public static void main(String[] args) throws Exception
	{
		Runtime.getRuntime().exec("Notepad.exe");
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(4000);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		
		
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_Y);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_S);
		
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		
		
		
		
		
	}

}
