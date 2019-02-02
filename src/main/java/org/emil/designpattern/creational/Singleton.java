package org.emil.designpattern.creational;

public class Singleton{

    private static Singleton singletonInstance;


    private Singleton(){

    }

    /**
     * Method that creates a singleton instance
     * @return Singleton instance
     */
    public static synchronized Singleton getInstance(){
        
        if(singletonInstance == null)
            singletonInstance = new Singleton();

        return singletonInstance;

    }

}