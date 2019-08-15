import javax.swing.*;
import java.awt.event.*;

public class ListenerGUI implements ActionListener { // 要实现ActionListener接口, 监听到的事件只会通知实现了这个接口的类，这个类要实现监听，所以要实现接口

	JButton mButton; // 这里按钮对象应该是一个实例变量
	public boolean changeFlag = false; // 用于控制按钮反转
	public static void main(String args[]) {
		
		ListenerGUI mLisennerGUI = new ListenerGUI();
		mLisennerGUI.go();
	}

	public void go() {
		
		JFrame mJf = new JFrame(); // 实例化窗体对象
		mButton = new JButton("click"); // 实例化按钮对象

		mButton.addActionListener(this); // 注册这个按钮到事件监听

		mJf.getContentPane().add(mButton); // 把按钮添加到窗体上
		mJf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mJf.setSize(300, 300); // 设置窗体大小
		mJf.setVisible(true); // 设置窗体可见性

	}

	public void actionPerformed(ActionEvent event) { // 这是实现接口的方法，必须重写
		changeFlag = !changeFlag;	

		// 实现按钮反转功能
		if (changeFlag == true) {
		
			mButton.setText("Clicked");
		}
		if (changeFlag == false) {
			
			mButton.setText("Click");
		}
	}
}
		// 总结
		// 按钮监听的步骤：实例化窗口 -> 实例化按钮 -> 按钮添加至监听 -> 按钮部署到窗口
