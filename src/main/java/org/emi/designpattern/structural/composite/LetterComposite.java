package org.emi.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;


//Code taken from https://java-design-patterns.com/patterns/composite/

public abstract class LetterComposite {

	private List<LetterComposite> children = new ArrayList<>();
	
	public void add(LetterComposite letter) {
		children.add(letter);
	}
	
	public int count() {
		return children.size();
	}
	
	public abstract void printThisBefore();
	
	public abstract void printThisAfter();
	
	public void print() {
		printThisBefore();
		for(LetterComposite letter : children) {
			letter.print();
		}
		printThisAfter();
	}
	
}
