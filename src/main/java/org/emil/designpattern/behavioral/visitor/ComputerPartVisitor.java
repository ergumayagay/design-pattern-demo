package org.emil.designpattern.behavioral.visitor;

/**
 * 
 * This represents the visitor interface
 * 
 * code from: https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
 */
public interface ComputerPartVisitor {
	
	public void visit(Monitor monitor);
	
	public void visit(Mouse mouse);
	
	public void visit(Keyboard keyboard);

}
