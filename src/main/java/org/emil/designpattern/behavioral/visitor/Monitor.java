package org.emil.designpattern.behavioral.visitor;

public class Monitor implements ComputerPart {

	//TODO add some properties
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		
		computerPartVisitor.visit(this);

	}

}
