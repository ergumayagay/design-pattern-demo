package org.emil.designpattern.structural.composite;


//Code taken from https://java-design-patterns.com/patterns/composite/
public class Letter extends LetterComposite {
	
	private char c;
	
	public Letter(char c) {
		this.c = c;
	}

	@Override
	public void printThisBefore() {
		System.out.print(c);

	}

	@Override
	public void printThisAfter() {
	}

}
