package org.emil.designpattern.behavioral.command;

public class Stock{

    private int stockCount;

    public void buy(){
        System.out.print("Buy Stock");
        stockCount += 1;
    }

    public void sell(){
        System.out.print("Sell");
        stockCount -=1;
    }

    /**
     * @return the stockCount
     */
    public int getStockCount() {
        return stockCount;
    }

}