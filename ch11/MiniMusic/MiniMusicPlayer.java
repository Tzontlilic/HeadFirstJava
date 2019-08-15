import javax.sound.midi.*;
public class MiniMusicPlayer {

	// setMessage([类型], [频道], [音符(0 - 127)], [音道]);
	
	public static void main(String args[]) {
		
		MiniMusicPlayer mini = new MiniMusicPlayer();
		mini.play();
	}

	public void play() {
		
		try {
			
			Sequencer player = MidiSystem.getSequencer();
			player.open(); // 取得sequencer 并打开

			Sequence seq = new Sequence(Sequence.PPQ, 4);

			Track track = seq.createTrack();



			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100); // 这里的44代表音符 144代表是开始 1代表是使用频道1 100代表音道(声音强弱)
			MidiEvent noteon = new MidiEvent(a, 1); // 1代表第一拍启动
			track.add(noteon); // track带有所有的envent
	


			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100); //同上，128代表关闭
			MidiEvent noteoff = new MidiEvent(b, 16);
			track.add(noteoff);

			player.setSequence(seq);

			player.start();
		} catch (Exception e){
			
			e.printStackTrace();
		}
	}
}
