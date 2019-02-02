package org.emil.designpattern.creational.builder;

/*
 * code taken from:
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class ChickenBurger extends Burger {

    @Override
    public String name(){
        return "Chicken Burger";
    }

    @Override
    public float price(){

        return 50.5f;

    }
}