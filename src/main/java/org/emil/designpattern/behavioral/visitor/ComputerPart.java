package org.emil.designpattern.behavioral.visitor;

/**
 * This represents the Visitable Interface
 * 
 * code from https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
 * 
 */
public interface ComputerPart {
	
	public void accept(ComputerPartVisitor computerPartVisitor);

	
}
