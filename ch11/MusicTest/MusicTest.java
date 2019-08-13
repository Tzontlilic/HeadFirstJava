import javax.sound.midi.*;
public class MusicTest {
	
	public void play(){
	
		try { // 一定要有try，否则编译器不通过
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("we got a sequencer");
		} catch (MidiUnavailableException e) {
			System.out.println("we got not a sequencer");	
			e.printStackTrace(); // 即使无法对异常作出处理，也要print异常
		}

	}

	public static void main(String args[]) {
	
		MusicTest mMT = new MusicTest();
		mMT.play();
	}
}
