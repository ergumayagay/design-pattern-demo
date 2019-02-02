package org.emil.designpattern.creational.builder;

/*
 * code taken from:
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class Pepsi extends ColdDrink{

    @Override
    public float price(){
        return 35.0f;
    }

    @Override
    public String name(){
        return "Pepsi";
    }
}