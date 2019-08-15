import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LayoutGUI implements ActionListener {
	
	JFrame frame;
	public static void main(String args[]) {
		
		LayoutGUI mGUI = new LayoutGUI();
		mGUI.go();
	}

	public void go() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton mButtom = new JButton("Change color");
		mButtom.addActionListener(this);

		myDraw mmyDraw = new myDraw();

		frame.getContentPane().add(BorderLayout.SOUTH, mButtom);
		frame.getContentPane().add(BorderLayout.CENTER, mmyDraw);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		frame.repaint();
	}
}
