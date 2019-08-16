import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class twoButton2 { // 外部类

	JFrame frame;
	JButton lableButton;
	public static void main (String args[]) {
		
		twoButton2 mTwo = new twoButton2();
		mTwo.go();
	}
	
	public void go() {
	
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 如果不使用内部类，而是外部类直接实现actionlistener接口，
		// 则直接传入this，
		// 这里因为使用内部类，所以传入实现了actionlistenner接口的内部类的
		// 实例对象
		JButton colorButton = new JButton("Color");
		colorButton.addActionListener(new colorButtonListener());


		lableButton = new JButton("lableButton");
		lableButton.addActionListener(new lableButtonlistener());
		
		myDraw mDraw = new myDraw();
		
		frame.getContentPane().add(BorderLayout.WEST, lableButton);
		frame.getContentPane().add(BorderLayout.EAST, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, mDraw);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	

	}



// 以下是内部类 内部类和所处的外部类之间，有着非常亲密的关系，他们可以共享方法和实例变量

	class colorButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			
			frame.repaint();
		}
	
	} 

	class lableButtonlistener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			
			lableButton.setText("clicked");
		}
	
	}
}

// 总结： 内部类的作用
// 	  内部类的使用，让在同一个类中多次实现同一个接口变为可能
// 	  假如一个外部类实现了某个接口，那么这个接口包含的方法只能使用一次
// 	  而如果我们在这个类中建立多个实现了这个接口的内部类，我们就可以多次实现
// 	  接口的方法
