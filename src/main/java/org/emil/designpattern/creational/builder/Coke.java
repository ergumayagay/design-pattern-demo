package org.emil.designpattern.creational.builder;

/*
 * code taken from:
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
       return 30.0f;
    }
 
    @Override
    public String name() {
       return "Coke";
    }
 }