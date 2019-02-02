package org.emil.designpattern.creational.factory.abstractfactory;

public abstract class AbstractAnimalFactory{

    public abstract AnimalType createAnimalType();

    public abstract Habitat createHabitat();

}