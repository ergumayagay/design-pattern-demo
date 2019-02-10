package org.emil.designpattern.behavioral.command;

public class SellStock extends AbstractStock{
	
	public SellStock(Stock stock) {
		this.stock = stock;
	}

    @Override
    public void execute() {
       stock.sell();
    }
}