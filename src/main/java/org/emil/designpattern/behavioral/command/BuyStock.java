package org.emil.designpattern.behavioral.command;

public class BuyStock extends AbstractStock{

    public BuyStock(Stock stock){
        super(stock);
    }

    @Override
    public void execute() {
       getStock().buy();
    }


}