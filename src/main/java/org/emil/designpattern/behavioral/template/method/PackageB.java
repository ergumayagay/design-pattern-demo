package org.emil.designpattern.behavioral.template.method;

public class PackageB extends Trip {

	@Override
	public void doComingTransport() {
		System.out.println("The tourist are coming by train...");

	}

	@Override
	public void doDayA() {
		System.out.println("The tourist are visiting the mountain...");

	}

	@Override
	public void doDayB() {
		System.out.println("The tourist are going to the beach...");

	}

	@Override
	public void doDayC() {
		System.out.println("The tourst are going to the zoo...");

	}

	@Override
	public void doReturningTransport() {
		System.out.print("The tourist are going home by the train...");

	}

}
