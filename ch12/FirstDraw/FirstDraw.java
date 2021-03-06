import java.awt.*;
import javax.swing.*;
public class FirstDraw extends JPanel{ // 继承了JPanel这类,相当于自己创造了一个组件，需要创造了一个widget(部件)
	private int mcolorWidth, mcolorLength, mpicX, mpicY;	
	
	FirstDraw(int colorWidth, int colorLength, int picX, int picY) {
			
		this.mcolorWidth = colorWidth;
		this.mcolorLength = colorLength;
		this.mpicX = picX;
		this.mpicY = picY;
	}

	@Override
	public void paintComponent(Graphics g) { // 这个方法由系统来调用
		
		Image image = new ImageIcon("Moss.jpg").getImage();
		g.drawImage(image, mpicX, mpicY, this);
		g.setColor(Color.orange); // 设置颜色，参数为一个颜色对象
		g.fillRect(mcolorWidth, mcolorLength, 100, 100); // 设置方框位置



		// 创建一个随机颜色的圆圈
		int R = (int) (Math.random() * 255);
		int G = (int) (Math.random() * 255);
		int B = (int) (Math.random() * 255);
		Color randomColor = new Color(R, G, B);
		g.setColor(randomColor);

		g.fillOval(mcolorWidth + 50, mcolorLength + 50, 100, 100);
		// ************************



		// 需要先设置颜色，再设置位置，否则颜色为黑色
	}
}
