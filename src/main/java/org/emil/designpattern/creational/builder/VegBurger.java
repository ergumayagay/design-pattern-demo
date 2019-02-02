package org.emil.designpattern.creational.builder;

/*
 * code taken from:
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class VegBurger extends Burger{

    @Override
    public float price(){
        return 25.0f;
    }

    @Override
    public String name(){
        return "Veg Burger";
    }
}