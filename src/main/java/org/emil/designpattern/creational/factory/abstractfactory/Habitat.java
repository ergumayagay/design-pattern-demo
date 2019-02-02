package org.emil.designpattern.creational.factory.abstractfactory;

public abstract class Habitat{

    protected String type;

    public abstract void setType();

    public String getType(){
        setType();
        return type;
    }

}