package org.emil.designpattern.structural;

import static org.junit.Assert.assertEquals;

import org.emil.designpattern.structural.adapter.AudioPlayer;
import org.emil.designpattern.structural.bridge.Circle;
import org.emil.designpattern.structural.bridge.GreenCircle;
import org.emil.designpattern.structural.bridge.RedCircle;
import org.emil.designpattern.structural.bridge.Shape;
import org.emil.designpattern.structural.composite.LetterComposite;
import org.emil.designpattern.structural.composite.Messenger;
import org.emil.designpattern.structural.decorator.ClubbedTroll;
import org.emil.designpattern.structural.decorator.SimpleTroll;
import org.emil.designpattern.structural.decorator.Troll;
import org.emil.designpattern.structural.flyweight.Potion;
import org.emil.designpattern.structural.flyweight.PotionFactory;
import org.emil.designpattern.structural.flyweight.PotionFactory.PotionType;
import org.emil.designpattern.structural.memento.Star;
import org.emil.designpattern.structural.memento.StarMemento;
import org.emil.designpattern.structural.memento.StarType;
import org.junit.Test;

public class StructuralTest {

	@Test
	public void testAdapter() {

		/*
		 * Code from: https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
		 */
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");

	}
	
	@Test
	public void testBridge() {
		
		Shape redCircle = new Circle(100,100, 10, new RedCircle());
		redCircle.draw();
		
		Shape greenCircle = new Circle(100,100,10, new GreenCircle());
		greenCircle.draw();
	}
	
	@Test
	public void testComposite() {
		
		LetterComposite orcMessage = new Messenger().messageFromOrcs();
		orcMessage.print();
	}
	
	@Test
	public void testDecorator() {
		Troll troll = new SimpleTroll();
		
		troll.attack();
		troll.fleeBattle();
		
		//Decorate troll with a club
		Troll clubbledTroll = new ClubbedTroll(troll);
		clubbledTroll.attack();
		clubbledTroll.fleeBattle();
		
		assertEquals(20, clubbledTroll.getAttackPower());
		
	}
	
	@Test
	public void testFlyweight() {
		PotionFactory factory = new PotionFactory();
		
		Potion invisibility = factory.createPotion(PotionType.INVISIBILITY);
		
		
		invisibility.drink();
	}
	
	@Test
	public void testMemento() {
		
		Star star = new Star(StarType.SUN, 10000000, 500000);
		System.out.println(star.toString());
		
		StarMemento state = star.getMemento();
		star.timePasses();
		System.out.println(star.toString());
		star.timePasses();
		System.out.println(star.toString());
		star.setMemento(state);
		System.out.println(star.toString());
		
	}
}
