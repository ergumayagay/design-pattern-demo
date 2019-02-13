package org.emil.designpattern.behavioral.strategy;

public class Defensive implements Behaviour {

	@Override
	public int move() {
		
		System.out.print("Robot will defend");
		return -1;
	}

}
