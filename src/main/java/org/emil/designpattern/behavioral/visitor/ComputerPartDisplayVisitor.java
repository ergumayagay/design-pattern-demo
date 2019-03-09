package org.emil.designpattern.behavioral.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Monitor monitor) {
		
		System.out.println("Display monitor");
	}

	@Override
	public void visit(Mouse mouse) {
		
		System.out.println("Display mouse");
	}

	@Override
	public void visit(Keyboard keyboard) {
		
		System.out.println("Display keyboard");

	}

}
