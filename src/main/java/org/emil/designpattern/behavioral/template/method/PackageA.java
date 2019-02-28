package org.emil.designpattern.behavioral.template.method;

public class PackageA extends Trip {

	@Override
	public void doComingTransport() {
		System.out.println("The tourist are coming by air...");
	}

	@Override
	public void doDayA() {
		System.out.println("The tourist are visiting the aquarium...");

	}

	@Override
	public void doDayB() {
		System.out.println("The tourist are going to the beach...");

	}

	@Override
	public void doDayC() {
		System.out.println("The tourist are going to the mountains...");

	}

	@Override
	public void doReturningTransport() {
		System.out.println("The tourist are going home by air...");

	}

}
