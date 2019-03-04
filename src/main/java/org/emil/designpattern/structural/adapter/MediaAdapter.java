package org.emil.designpattern.structural.adapter;

/**
 * Code from: https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 *
 */
public class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType) {
		
		if(audioType.equalsIgnoreCase("vlc"))
			advancedMusicPlayer = new VLCPlayer();
			
		else if(audioType.equalsIgnoreCase("mp4")) 
			advancedMusicPlayer = new MP4Player();
		
	}

	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("vlc")) 
			advancedMusicPlayer.playVLC(fileName);
		
		else if(audioType.equalsIgnoreCase("mp4"))
			advancedMusicPlayer.playMP4(fileName);
		
	}

}
