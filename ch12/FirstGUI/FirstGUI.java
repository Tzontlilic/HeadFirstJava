import javax.swing.*;
public class FirstGUI {
	
	public static void main(String args[]) {
		

		JFrame frame = new JFrame();
		JButton mButton = new JButton("Click");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //这玩意会在窗体被关时结束程序
		frame.getContentPane().add(mButton);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}	
}
