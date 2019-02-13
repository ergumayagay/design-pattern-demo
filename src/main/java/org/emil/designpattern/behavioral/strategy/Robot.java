package org.emil.designpattern.behavioral.strategy;

public class Robot {

	private String name;
	
	private Behaviour behaviour;
	
	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Behaviour getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(Behaviour behaviour) {
		this.behaviour = behaviour;
	}
	
	public void move() {
		
		int command = behaviour.move();
		
		System.out.print(this.name +" move command: "+ command );
	}
	
}
