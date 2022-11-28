import java.awt.*;
import java.awt.event.*;

public class ExitListener extends WindowAdapter{
	public static void main(String args[]) 
{
	   public void windowClosing(WindowEvent event) 
	{
		System.exit(0);
	}
}
}