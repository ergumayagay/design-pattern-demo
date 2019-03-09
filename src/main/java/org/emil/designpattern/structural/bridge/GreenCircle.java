package org.emil.designpattern.structural.bridge;

//Code taken from https://en.wikipedia.org/wiki/Bridge_pattern

//Concrete Implementor
public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int x, int y, int radius) {
		
		System.out.printf("Green circle at %d %d radius %d%n", x, y, radius);
	}

}
