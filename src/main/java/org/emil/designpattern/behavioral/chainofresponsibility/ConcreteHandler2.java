package org.emil.designpattern.behavioral.chainofresponsibility;

public class ConcreteHandler2 extends Handler{

    @Override
    public Request handleRequest(Request request) {

        if(request.getId() == 0){
            request.setDesciption("Zero");
        }else successor.handleRequest(request);
        return request;
    }

}