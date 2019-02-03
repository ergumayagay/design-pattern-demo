package org.emil.designpattern.behavioral.chainofresponsibility;

public class ConcreteHandler1 extends Handler{

    @Override
    public Request handleRequest(Request request) {

        if(request.getId() < 0){
            request.setDesciption("Negative");    
        }else{
            successor.handleRequest(request);
        }

        return request;
    }
}