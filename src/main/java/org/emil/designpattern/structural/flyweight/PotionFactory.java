package org.emil.designpattern.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class PotionFactory {
	
	public enum PotionType{
		HEALING, HOLY_WATER, INVISIBILITY
	}
	
	private final Map<PotionType, Potion> potions;
	
	public PotionFactory() {
		potions = new EnumMap<>(PotionType.class);
	}
	
	public Potion createPotion(PotionType type) {
		
		Potion potion =null;
		
		switch (type) {
		case HEALING:
			potion = new HealingPotion();
			potions.put(type, potion);
			break;
			
		case HOLY_WATER:
			potion = new HolyWaterPotion();
			potions.put(type, potion);
			break;
			
		case INVISIBILITY:
			potion = new InvisibilityPotion();
			potions.put(type, potion);
			break;
		default:
			break;
		}
		
		return potion;
	}

}
