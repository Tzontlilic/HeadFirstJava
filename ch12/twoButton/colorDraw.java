import java.awt.*;
import javax.swing.*;

public class colorDraw extends JPanel {
	
	@Override
	public void paintComponent(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;

		int R = (int) (Math.random() * 255);
		int G = (int) (Math.random() * 255);
		int B = (int) (Math.random() * 255);

		Color startColor = new Color(R, G, B);
		
		R = (int) (Math.random() * 255);
		G = (int) (Math.random() * 255);
		B = (int) (Math.random() * 255);
		
		Color endColor = new Color(R, G, B);
		
		GradientPaint gradient = new GradientPaint(70, 70, startColor,
							   150, 150, endColor);

		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);

	}
}
