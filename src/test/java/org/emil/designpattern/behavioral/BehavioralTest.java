package org.emil.designpattern.behavioral;

import static org.junit.Assert.assertEquals;

import org.emil.designpattern.behavioral.chainofresponsibility.ConcreteHandler1;
import org.emil.designpattern.behavioral.chainofresponsibility.ConcreteHandler2;
import org.emil.designpattern.behavioral.chainofresponsibility.ConcreteHandler3;
import org.emil.designpattern.behavioral.chainofresponsibility.Handler;
import org.emil.designpattern.behavioral.chainofresponsibility.Request;
import org.emil.designpattern.behavioral.command.Agent;
import org.emil.designpattern.behavioral.command.BuyStock;
import org.emil.designpattern.behavioral.command.SellStock;
import org.emil.designpattern.behavioral.command.Stock;
import org.emil.designpattern.behavioral.iterator.Iterator;
import org.emil.designpattern.behavioral.iterator.NameRepository;
import org.emil.designpattern.behavioral.mediator.User;
import org.emil.designpattern.behavioral.observer.BinaryObserver;
import org.emil.designpattern.behavioral.observer.HexaObserver;
import org.emil.designpattern.behavioral.observer.OctalObserver;
import org.emil.designpattern.behavioral.observer.Subject;
import org.emil.designpattern.behavioral.strategy.AggressiveBehaviour;
import org.emil.designpattern.behavioral.strategy.Defensive;
import org.emil.designpattern.behavioral.strategy.NormalBehaviour;
import org.emil.designpattern.behavioral.strategy.Robot;
import org.emil.designpattern.behavioral.template.method.PackageA;
import org.emil.designpattern.behavioral.template.method.PackageB;
import org.emil.designpattern.behavioral.template.method.Trip;
import org.emil.designpattern.behavioral.visitor.ComputerPartDisplayVisitor;
import org.emil.designpattern.behavioral.visitor.Keyboard;
import org.emil.designpattern.behavioral.visitor.Monitor;
import org.emil.designpattern.behavioral.visitor.Mouse;
import org.emil.dessignpattern.behavioral.nullobject.AbstractCustomer;
import org.emil.dessignpattern.behavioral.nullobject.CustomerFactory;
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

        BuyStock buyStock = new BuyStock(stock);

        SellStock sellStock = new SellStock(stock);

        Agent agent = new Agent();

        agent.placeOrder(buyStock);
        agent.placeOrder(buyStock);
        assertEquals(2, stock.getStockCount());


        agent.placeOrder(sellStock);
        assertEquals(1, stock.getStockCount());

    }
    
    @Test
    public void testIterator() {
    	
    	NameRepository nameRepository = new NameRepository();
    	
    	//using for loop
    	System.out.println("Iterator using for loop ");
    	for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
    	//	String name = iterator.next().toString();
    		
    		String name = (String) iterator.next();
    		
    		System.out.println(name);
    	}
    	
    	System.out.println("Iterator using while");
    	Iterator iter = nameRepository.getIterator();
    	while(iter.hasNext()) {
    		System.out.println((String)iter.next());
    	}
    	
    }
    
    @Test
    public void testMediator() {
    	
    	User emil = new User("Emil");
    	
    	User mia = new User("Mia");
    	
    	mia.sendMessage("I love you");
    	
    	emil.sendMessage("I love you too");
    }
    
    @Test
    public void testObserver() {
    	
    	Subject subject = new Subject();
    	
    	new HexaObserver(subject);
    	new BinaryObserver(subject);
    	new OctalObserver(subject);
    	
    	System.out.println("State: 15");
    	subject.setState(15);
    	System.out.println("State: 10");
    	subject.setState(10);
    	
    }
    
    @Test
    public void testStrategy() {
    	
    	Robot robot = new Robot("Abi");
    	
    	robot.setBehaviour(new AggressiveBehaviour());
    	
    	robot.move();
    	
    	assertEquals(1, robot.getBehaviour().move());
    	
    	robot.setBehaviour(new NormalBehaviour());
    	
    	robot.move();
    	
    	assertEquals(0, robot.getBehaviour().move());
    	
    	robot.setBehaviour(new Defensive());
    	
    	robot.move();
    	
    	assertEquals(-1, robot.getBehaviour().move());
    }
    
    @Test
    public void testTemplateMethod() {
    	
    	@SuppressWarnings("unused")
		Trip packageA = new PackageA();
    	
    	
    	@SuppressWarnings("unused")
		Trip packageB = new PackageB();
    }
    
    @Test
    public void testVisitor() {
    	
    	ComputerPartDisplayVisitor visitor = new ComputerPartDisplayVisitor();
    	
    	Monitor monitor = new Monitor();
    	monitor.accept(visitor);
    	
    	//monitor.accept(new ComputerPartDisplayVisitor());
    	
    	Keyboard keyboard = new Keyboard();
    	keyboard.accept(visitor);
    	
    	Mouse mouse = new Mouse();
    	mouse.accept(visitor);
    	
    }
    
    @Test
    public void testNullObject() {
    	
    	//Found in the array
    	AbstractCustomer rec = CustomerFactory.getCustomer("Rec");
    	AbstractCustomer abi = CustomerFactory.getCustomer("Abi");
    	AbstractCustomer nigel = CustomerFactory.getCustomer("Nigel");
    	AbstractCustomer jen = CustomerFactory.getCustomer("Jen");
    	
    	//Not found
    	AbstractCustomer emil = CustomerFactory.getCustomer("Emil");
    	
    	assertEquals("Rec", rec.getName());
    	assertEquals("Nigel", nigel.getName());
    	assertEquals("Jen", jen.getName());
    	assertEquals("Abi", abi.getName());
    	
    	assertEquals("No customer found", emil.getName());
    	
    }

}