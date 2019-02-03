package org.emil.designpattern.creational;

import org.emil.designpattern.creational.factory.method.*;
import org.emil.designpattern.creational.prototype.PoliceRecord;
import org.emil.designpattern.creational.prototype.Record;
import org.emil.designpattern.creational.builder.Meal;
import org.emil.designpattern.creational.builder.MealBuilder;
import org.emil.designpattern.creational.factory.abstractfactory.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CreationalTest{

    @Test
    public void testSingleton(){
        
        Singleton singleton = Singleton.getInstance();

        Singleton sigleton2 = Singleton.getInstance();

       assertEquals(singleton, sigleton2);

    }

    @Test
    public void testFactoryMethod(){

        ProductFactory productFactory = ProductFactory.getInstance();

        Product food = productFactory.createNewProduct("perishable");
    
        assertEquals(9, food.getTotalPrice(3));

        Product table = productFactory.createNewProduct("non-perishable");

        assertEquals(25, table.getTotalPrice(5));

    }

    @Test
    public void testAbstractFactory(){

        AnimalFactoryCreator animalFactoryCreator = new AnimalFactoryCreator();

        AnimalType animalType = animalFactoryCreator.getFactory("mammal").createAnimalType();
        Habitat habitat = animalFactoryCreator.getFactory("mammal").createHabitat();
        
        Animal dog = new Animal(animalType,habitat);

        assertEquals("Mammal", dog.getAnimalType().getType());
        assertEquals("Land",dog.getHabitat().getType());

        
        AnimalType parrotType = animalFactoryCreator.getFactory("bird").createAnimalType();
        Habitat parrotHabitat = animalFactoryCreator.getFactory("bird").createHabitat();

        Animal parrot = new Animal(parrotType, parrotHabitat);

        assertEquals("Bird", parrot.getAnimalType().getType());
        assertEquals("Air", parrot.getHabitat().getType());

    }

    @Test
    public void testBuilder(){

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();

        assertEquals(55.0, vegMeal.getCost(),0.01);

        Meal nonVeg = mealBuilder.prepareNonVegMeal();

        assertEquals(85.5, nonVeg.getCost(),0.01);

    }

    @Test
    public void testPrototype(){

        Record record = new PoliceRecord(1,"this is a police record");

        Record cloned = (PoliceRecord) record.getClone();

        assertEquals(record.getId(), cloned.getId());

    }

}