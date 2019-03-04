package org.emil.designpattern.structural.adapter;

/**
 * Code from: https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 *
 */
public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		
		System.out.println("Playing vlc file. Name: "+fileName);	
	}

	@Override
	public void playMP4(String fileName) {
		// TODO Auto-generated method stub
		
	}



}
