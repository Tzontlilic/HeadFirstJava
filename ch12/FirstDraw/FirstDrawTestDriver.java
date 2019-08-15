import java.awt.*;
import javax.swing.*;

public class FirstDrawTestDriver {

	
	public static void main(String args[]) {
		

		if (args.length != 4) {
		
			System.out.println("error");
		} else {
		
			int colorWidth  = Integer.parseInt(args[0]);
			int colorLength = Integer.parseInt(args[1]);
			int picX        = Integer.parseInt(args[2]);
			int picY        = Integer.parseInt(args[3]);
		

		FirstDraw mFirstDraw = new FirstDraw(colorWidth, 
						     colorLength, 
						     picX,
						     picY);
		JFrame mframe = new JFrame();
		mframe.getContentPane().add(mFirstDraw);
		mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mframe.setSize(800, 600);
		mframe.setVisible(true);
		}
	}
}
