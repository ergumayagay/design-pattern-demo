package org.emil.designpattern.behavioral.chainofresponsibility;

public abstract class Handler{

    protected Handler successor;

    public void setSuccessor(Handler successor){

            this.successor= successor;

    }

    public abstract Request handleRequest(Request request);

}