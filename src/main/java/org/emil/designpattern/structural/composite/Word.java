package org.emil.designpattern.structural.composite;

//Code taken from https://java-design-patterns.com/patterns/composite/

import java.util.List;

public class Word extends LetterComposite {
	
	public Word(List<Letter> letters) {
		for(Letter l: letters) {
			this.add(l);
		}
	}

	@Override
	public void printThisBefore() {
		System.out.print(" ");

	}

	@Override
	public void printThisAfter() {
	}

}
