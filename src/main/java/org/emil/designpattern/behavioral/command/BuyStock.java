package org.emil.designpattern.behavioral.command;

public class BuyStock extends AbstractStock{

    public BuyStock(Stock stock) {

    	this.stock = stock;
	}

	@Override
    public void execute() {
       stock.buy();
    }


}