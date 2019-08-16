import java.awt.*;
import javax.swing.*;

public class move {
	
	JFrame frame;	
	int x, y;
	public static void main(String args[]) {
		
		move mmove = new move();
		mmove.go();
	}


	public void go() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myDraw mD = new myDraw();
		frame.getContentPane().add(mD);
		frame.setSize(400, 400);
		frame.setVisible(true);

		for (int i = 0; i < 300; i++) {

			x ++;
			y ++;
			frame.repaint();

			try { 				// 延时
				Thread.sleep(50);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}


	class myDraw extends JPanel { // 内部类
		
		// 这里有一个疑惑，书上说我这么写，出来的效果不是一个移动的圆
		// 而是一条线，原因是说每次repaint没有清空上次的痕迹
		// 但是我并没有出现这样的bug， 怀疑是api更新了，repaint的时候自动
		// 清空了上次的痕迹
		@Override
		public void paintComponent(Graphics g) {
			
			g.setColor(Color.orange);
			g.fillOval(x, y, 100, 100);
		}
	}
}
