package org.emil.designpattern.creational.factory.abstractfactory;

public class Animal{

    private AnimalType animalType;

    private Habitat habitat;

    public Animal( AnimalType animalType, Habitat habitat) {
        super();
        this.animalType = animalType;
        this.habitat = habitat;
    }

    /**
     * @return the animalType
     */
    public AnimalType getAnimalType() {
        return animalType;
    }

    /**
     * @return the habitat
     */
    public Habitat getHabitat() {
        return habitat;
    }

    /**
     * @param animalType the animalType to set
     */
    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
}