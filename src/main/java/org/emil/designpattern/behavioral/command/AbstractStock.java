package org.emil.designpattern.behavioral.command;

public abstract class AbstractStock implements Order{

    protected Stock stock;


    /**
     * @return the stock
     */
    public Stock getStock() {
        return stock;
    }

}