package org.emil.designpattern.behavioral.command;

public class SellStock extends AbstractStock{

    public SellStock(Stock stock){
        super(stock);
    }

    @Override
    public void execute() {
        getStock().sell();
    }
}