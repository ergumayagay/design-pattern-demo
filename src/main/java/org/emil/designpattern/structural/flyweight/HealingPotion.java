package org.emil.designpattern.structural.flyweight;

public class HealingPotion implements Potion {

	@Override
	public void drink() {
		
		System.out.println("You feel healead. Potion "+ this.getClass().getName());
	}

}
