import java.awt.*;
import javax.swing.*;
public class myDraw extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		
		int R = (int)(Math.random() * 255);
		int G = (int)(Math.random() * 255);
		int B = (int)(Math.random() * 255);
		
		Color randomColor = new Color(R, G, B);
		g.setColor(randomColor);
		g.fillRect(20, 50, 100, 100);
	}
}
