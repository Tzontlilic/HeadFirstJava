import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sound.midi.*;

public class Draw extends JPanel {
	

	@Override
	public void paintComponent(Graphics g) {
	
		
			int R = (int) (Math.random() * 255); 
			int G = (int) (Math.random() * 255); 
			int B = (int) (Math.random() * 255); 
			
			Color randomColor = new Color(R, G, B);

			g.setColor(randomColor);

		
			int X = (int) (Math.random() * 300);
			int Y = (int) (Math.random() * 300);
			g.fillRect(X, Y, 100, 100);

	}

}
