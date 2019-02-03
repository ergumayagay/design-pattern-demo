package org.emil.designpattern.behavioral.chainofresponsibility;

public class Request{

    private int id;

    private String description;

    public Request(int id, String description) {
        super();
        this.id = id;
        this.description = description;
    }

    /**
     * @return the desciption
     */
    public String getDesciption() {
        return description;
    }

    /**
     * @param desciption the desciption to set
     */
    public void setDesciption(String desciption) {
        this.description = desciption;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

}