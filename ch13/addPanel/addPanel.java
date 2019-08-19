import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class addPanel  {

	JFrame frame;
	JButton mButton1, mButton2;
	public static void main(String args[]) {
		
		addPanel object = new addPanel();
		object.go();

	}

	public void go() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();


		mButton1 = new JButton("Click");
		mButton1.addActionListener(new mButton1Listener());

		mButton2 = new JButton("Click");
		mButton2.addActionListener(new mButton2Listener());
		
		panel.add(mButton1);
		panel.add(mButton2);

		panel.setBackground(Color.orange);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	
	class mButton1Listener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			
			mButton1.setText("clicked");	
		}
	}

	class mButton2Listener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
		
			mButton2.setText("clicked");	
		}
	}
}
