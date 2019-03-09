package org.emil.designpattern.structural.flyweight;

public class InvisibilityPotion implements Potion{

	@Override
	public void drink() {
		
		System.out.println("Your become invisible. Potion "+ this.getClass().getName() );
	}

}
