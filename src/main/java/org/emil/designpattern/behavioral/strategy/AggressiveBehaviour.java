package org.emil.designpattern.behavioral.strategy;

public class AggressiveBehaviour implements Behaviour {

	@Override
	public int move() {
		
		System.out.println("Robot will Attack");
		
		return 1;
	}

}
