package org.emil.designpattern.structural;

import org.emil.designpattern.structural.adapter.AudioPlayer;
import org.emil.designpattern.structural.bridge.Circle;
import org.emil.designpattern.structural.bridge.GreenCircle;
import org.emil.designpattern.structural.bridge.RedCircle;
import org.emil.designpattern.structural.bridge.Shape;
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
	
	@Test
	public void testBridge() {
		
		Shape redCircle = new Circle(100,100, 10, new RedCircle());
		redCircle.draw();
		
		Shape greenCircle = new Circle(100,100,10, new GreenCircle());
		greenCircle.draw();
	}
}
