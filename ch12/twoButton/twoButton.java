import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class twoButton implements ActionListener {

	JFrame frame; 
	JButton colorButton, lableButton;
	public static void main(String args[]) {
		
		twoButton mtwoButton = new twoButton();
		mtwoButton.go();
		}

	public void go() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		colorButton = new JButton("ColorButton");
		lableButton = new JButton("lableButton");

		colorButton.addActionListener(this);
		lableButton.addActionListener(this);
		frame.getContentPane().add(BorderLayout.EAST, colorButton);
		frame.getContentPane().add(BorderLayout.WEST, lableButton);

		colorDraw mcolorDraw = new colorDraw();

		frame.getContentPane().add(BorderLayout.CENTER, mcolorDraw);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if (event.getSource() == colorButton) {

			frame.repaint();	
		}

		if (event.getSource() == lableButton) {
			
			lableButton.setText("ColorButtonClicked");
		}
	}
}
