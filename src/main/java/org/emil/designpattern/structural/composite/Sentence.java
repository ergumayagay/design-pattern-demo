package org.emil.designpattern.structural.composite;

import java.util.List;

//Code taken from https://java-design-patterns.com/patterns/composite/

public class Sentence extends LetterComposite {
	
	public Sentence(List<Word> words) {
		for(Word word : words) {
			this.add(word);
		}
	}

	@Override
	public void printThisBefore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printThisAfter() {
	
		System.out.print(".");
	}

}
