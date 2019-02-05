package org.emil.designpattern.behavioral.command;

public abstract class AbstractStock implements Order{

    private Stock stock;

    public AbstractStock(Stock stock){
        this.stock = stock;
    }

    /**
     * @return the stock
     */
    public Stock getStock() {
        return stock;
    }

}