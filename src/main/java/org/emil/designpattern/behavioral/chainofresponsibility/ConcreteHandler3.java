package org.emil.designpattern.behavioral.chainofresponsibility;

public class ConcreteHandler3 extends Handler{

    @Override
    public Request handleRequest(Request request) {

        if(request.getId() > 0){
            request.setDesciption("Positive");
        }else successor.handleRequest(request);

        return request;
    }
}