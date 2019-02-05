package org.emil.designpattern.behavioral;

import static org.junit.Assert.assertEquals;

import org.emil.designpattern.behavioral.chainofresponsibility.ConcreteHandler1;
import org.emil.designpattern.behavioral.chainofresponsibility.ConcreteHandler2;
import org.emil.designpattern.behavioral.chainofresponsibility.ConcreteHandler3;
import org.emil.designpattern.behavioral.chainofresponsibility.Handler;
import org.emil.designpattern.behavioral.chainofresponsibility.Request;
import org.emil.designpattern.behavioral.command.AbstractStock;
import org.emil.designpattern.behavioral.command.Agent;
import org.emil.designpattern.behavioral.command.BuyStock;
import org.emil.designpattern.behavioral.command.SellStock;
import org.emil.designpattern.behavioral.command.Stock;
import org.junit.Test;

public class BehavioralTest {

    @Test
    public void testCOR() {

        Request request1 = new Request(1, "");

        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        h1.handleRequest(request1);

        assertEquals("Positive", request1.getDesciption());

        Request request2 = new Request(-2, "");

        h1.handleRequest(request2);

        assertEquals("Negative", request2.getDesciption());

        Request request3 = new Request(0, "");

        h1.handleRequest(request3);

        assertEquals("Zero", request3.getDesciption());
    }

    @Test
    public void testCommand() {

        Stock stock = new Stock();

        AbstractStock buyStock = new BuyStock(stock);

        AbstractStock sellStock = new SellStock(stock);

        Agent agent = new Agent();

        agent.placeOrder(buyStock);
        agent.placeOrder(buyStock);
        assertEquals(2, stock.getStockCount());


        agent.placeOrder(sellStock);
        assertEquals(1, stock.getStockCount());

    }

}