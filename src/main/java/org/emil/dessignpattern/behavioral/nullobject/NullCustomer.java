package org.emil.dessignpattern.behavioral.nullobject;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNull() {
		
		return true;
	}

	@Override
	public String getName() {
		 	
		return "No customer found";
	}

}
