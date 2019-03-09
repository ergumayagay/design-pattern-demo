package org.emi.designpattern.structural.decorator;

public class SimpleTroll implements Troll{

	@Override
	public void attack() {
		
		System.out.println("The troll tries to grab you!");
	}

	@Override
	public int getAttackPower() {
		
		return 10;
	}

	@Override
	public void fleeBattle() {
		
		System.out.println("The troll shriekds in horror and runs away!");
		
	}

}
