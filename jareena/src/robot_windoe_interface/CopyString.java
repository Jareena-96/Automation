package robot_windoe_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString {

	public static void main(String[] args) throws Exception
	
	{
		Thread.sleep(3000);
		Runtime.getRuntime().exec("notepad.exe");
		
		Robot chitti=new Robot();
		chitti.setAutoDelay(600);
		
		String Path="https://www.google.com/photos/about/";
		StringSelection way1=new StringSelection(Path);
		
		Clipboard keyboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		keyboard.setContents(way1, null);
		chitti.keyPress(KeyEvent.VK_CONTROL);
		chitti.keyPress(KeyEvent.VK_V);
		chitti.keyRelease(KeyEvent.VK_CONTROL);
		
		
	

	}

}
