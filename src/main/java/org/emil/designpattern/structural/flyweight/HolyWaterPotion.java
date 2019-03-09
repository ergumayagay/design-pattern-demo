package org.emil.designpattern.structural.flyweight;

public class HolyWaterPotion implements Potion {

	@Override
	public void drink() {
		
		System.out.println("You feel blessed. Potion "+this.getClass().getName());
	}

}
