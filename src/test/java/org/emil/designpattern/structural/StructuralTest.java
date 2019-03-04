package org.emil.designpattern.structural;

import org.emil.designpattern.structural.adapter.AudioPlayer;
import org.junit.Test;

public class StructuralTest {

	@Test
	public void testAdapter() {

		/*
		 * Code from: https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
		 */
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");

	}
}
