import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.midi.*;

public class MiniDraw implements ControllerEventListener{ // 实现了监听接口
	
	JFrame frame;
	Draw mDraw;
	public static void main(String args[]) {
		
		MiniDraw mMini = new MiniDraw();
		mMini.go();
	}

	public void go() {

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mDraw = new Draw();
		frame.getContentPane().add(mDraw);
		frame.setSize(300, 300);
		frame.setVisible(true);


		try {

			Sequencer player = MidiSystem.getSequencer();
			player.open();

			// 向player注册事件， 
			// int[] addControllerEventListener(ControllerEventListener listener, int[] controllers)
			// 查API结果如上，传入一个ControllerEventLister的对象，和一个数组
			int[] eventsIWant = {126}; //书上写传的127是什么鬼啊，传127声音会变低啊，改成126就好了
			player.addControllerEventListener(this, eventsIWant);


			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			
			for (int i = 5; i < 61; i += 4) {
				
				track.add(autosetMessage(144, 1, i, 100, i));

				// 查API,这里的126是作为第一个数据位，猜测监听器
				// 是根据数据位的出现来响应的
				track.add(autosetMessage(176, 1, 126, 0, i));

				track.add(autosetMessage(128, 1, i, 100, i + 2));
			}

			player.setSequence(seq);
			player.setTempoInBPM(220);
			player.start();

		} catch (Exception e) {
			e.printStackTrace();	
		}

	}
	
	@Override
	public void controlChange(ShortMessage event) {
		
		// 这里有个问题，之前做动画的时候就发现
		// 书中说repaint()方法会保留上次的图像
		// 我这里发现repaint方法会清除上一次图像
		// 这里就达不到方块累计的效果了
		frame.repaint();
	} 


	// 静态的方法，用来自动设置event
	public static MidiEvent autosetMessage(int comd, int chan, int one,
					int two, int tick) {
		
		MidiEvent event = null;	

		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
		finally {
			return event;
		}
	}
}
