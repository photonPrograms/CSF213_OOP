/* CS F213 Lab 11
 * adapter design pattern
 */

interface MediaPlayer {
	public void play(String audioType, String fileName);
}

interface AdvancedMediaPlayer {
	public void playVLC(String fileName);
	public void playMp4(String fileName);
}

class VLCPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing vlc file: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {}
}

class Mp4Player implements AdvancedMediaPlayer {
	@Override
	public void playVLC(String fileName) {}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file: " + fileName);
	}
}

class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc"))
			advancedMediaPlayer = new VLCPlayer();
		else if (audioType.equalsIgnoreCase("mp4"))
			advancedMediaPlayer = new Mp4Player();
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc"))
			advancedMediaPlayer.playVLC(fileName);
		else if (audioType.equalsIgnoreCase("mp4"))
			advancedMediaPlayer.playMp4(fileName);
	}
}

class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3"))
			System.out.println("Playing mp3 file: " + fileName);
		else if (audioType.equalsIgnoreCase("vlc") ||
				audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else
			System.out.println("Media type " + audioType + "not supported");
	}
}

public class AdapterPatternDemo {
	public static void main(String args[]) {
		AudioPlayer ap = new AudioPlayer();
		ap.play("mp3", "glass_ost.mp3");
		ap.play("mp4", "secret_base.mp4");
		ap.play("vlc", "dango_family.vlc");
		ap.play("avi", "solipsism_of_low.avi");
	}
}
