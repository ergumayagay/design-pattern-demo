package org.emil.designpattern.creational.factory.abstractfactory;

/**
 * Creates Mammal
 */
class MammalFactory extends AbstractAnimalFactory{

    @Override
    public AnimalType createAnimalType() {
        return new Mammal();
    }

    @Override
    public Habitat createHabitat() {
        return new Land();
    }

}