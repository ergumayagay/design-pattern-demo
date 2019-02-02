package org.emil.designpattern.creational.factory.abstractfactory;

/**
 * Creates Birds
 */
class BirdFactory extends AbstractAnimalFactory{

    @Override
    public AnimalType createAnimalType() {
        return new Bird();
    }

    @Override
    public Habitat createHabitat() {
        return new Air();
    }

}