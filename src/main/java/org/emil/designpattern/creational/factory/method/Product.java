package org.emil.designpattern.creational.factory.method;


public abstract class Product{

    protected int price;

    public abstract void setPrice();

    public int getTotalPrice(int unit){

        setPrice();
        return price * unit;
    }

}