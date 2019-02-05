package org.emil.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Agent {

    private List<Order> orders = new ArrayList<Order>();

    public void placeOrder(Order order){
        orders.add(order);
        orders.forEach(o->o.execute());
        orders.clear();
    }

}