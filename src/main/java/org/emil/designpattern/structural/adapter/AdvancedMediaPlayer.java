package org.emil.designpattern.structural.adapter;

/**
 * Code from: https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 *
 */
public interface AdvancedMediaPlayer {
	
	public void playVLC(String fileName);
	public void playMP4(String fileName);

}
