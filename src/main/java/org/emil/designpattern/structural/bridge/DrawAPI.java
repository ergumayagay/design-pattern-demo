package org.emil.designpattern.structural.bridge;

//Code taken from https://en.wikipedia.org/wiki/Bridge_pattern

//Implementor
public interface DrawAPI {
	
	public void drawCircle(int x, int y, int radius);

}
