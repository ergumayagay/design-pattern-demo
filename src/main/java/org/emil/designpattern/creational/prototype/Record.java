package org.emil.designpattern.creational.prototype;

public class Record implements Cloneable {

    private int id;

    private String description;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    public Record(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public Object getClone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            
            e.printStackTrace();
            return null;
        }
    }



}