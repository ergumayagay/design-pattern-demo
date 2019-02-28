package org.emil.designpattern.behavioral.template.method;

public abstract class Trip {
	
	public Trip() {
		
		doComingTransport();
		doDayA();
		doDayB();
		doDayC();
		doReturningTransport();
		
	}

	public abstract void doComingTransport();
	
	public abstract void doDayA();
	
	public abstract void doDayB();
	
	public abstract void doDayC();
	
	public abstract void doReturningTransport();
	
}
