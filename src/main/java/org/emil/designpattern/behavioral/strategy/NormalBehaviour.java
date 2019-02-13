package org.emil.designpattern.behavioral.strategy;

public class NormalBehaviour implements Behaviour {

	@Override
	public int move() {
		
		System.out.print("Robot is idle");
		
		return 0;
	}

}
