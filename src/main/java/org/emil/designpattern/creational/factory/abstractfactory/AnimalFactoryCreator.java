package org.emil.designpattern.creational.factory.abstractfactory;

/**
 * Creates Factories for animal
 */
public class AnimalFactoryCreator{

    public AbstractAnimalFactory getFactory(String animalType){

        if(animalType.equalsIgnoreCase("mammal")){
            return new MammalFactory();
        }else if(animalType.equalsIgnoreCase("bird")){
            return new BirdFactory();
        }else{
            return null;
        }

    }

}