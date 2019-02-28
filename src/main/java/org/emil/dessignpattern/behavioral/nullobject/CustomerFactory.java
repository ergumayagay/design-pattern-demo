package org.emil.dessignpattern.behavioral.nullobject;

public class CustomerFactory {
	
	public static final String[] names = {"Nigel", "Rec", "Jen", "Abi"};

	
	public static AbstractCustomer getCustomer(String name) {
		
		for(int i=0; i < names.length; i++) {
			if(names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		
		return new NullCustomer();
		
	}
}
