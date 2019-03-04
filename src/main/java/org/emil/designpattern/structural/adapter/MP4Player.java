package org.emil.designpattern.structural.adapter;

/**
 * Code from: https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 *
 */
public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMP4(String fileName) {
		
		System.out.println("Playing mp4 file. Name: "+fileName);
		
	}

}
