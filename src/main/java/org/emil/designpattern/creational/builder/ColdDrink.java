package org.emil.designpattern.creational.builder;

/*
 * code taken from:
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}