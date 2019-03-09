package org.emil.designpattern.structural.bridge;

//Code taken from https://en.wikipedia.org/wiki/Bridge_pattern

//Concrete Implementor 2
public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int x, int y, int radius) {
		
		System.out.printf("Red Cirle at %d %d radius %d%n", x, y, radius);

	}

}
