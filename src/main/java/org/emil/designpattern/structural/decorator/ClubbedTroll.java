package org.emil.designpattern.structural.decorator;

//Decorator
public class ClubbedTroll implements Troll{
	
	private Troll decoratedTroll;
	
	public ClubbedTroll(Troll decoratedTroll) {
		this.decoratedTroll = decoratedTroll;
	}

	@Override
	public void attack() {
		
		decoratedTroll.attack();
		System.out.println("The troll swings at you with a club!");
	}

	@Override
	public int getAttackPower() {
		
		return decoratedTroll.getAttackPower()+10;
	}

	@Override
	public void fleeBattle() {
		
		decoratedTroll.fleeBattle();
	}

}
