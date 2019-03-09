package org.emil.designpattern.structural.memento;

public class Star {

	private StarType type;
	private int ageYears;
	private int massTon;

	public Star(StarType starType, int startAge, int startMass) {
		this.type = starType;
		this.ageYears = startAge;
		this.massTon = startMass;
	}

	public void timePasses() {

		ageYears *= 2;
		massTon *= 8;

		switch (type) {
		case RED_GIANT:
			type = StarType.WHITE_DWARF;
			break;
		case SUN:
			type = StarType.RED_GIANT;
			break;
		case SUPERNOVA:
			type = StarType.DEAD;
			break;
		case WHITE_DWARF:
			type = StarType.SUPERNOVA;
			break;
		default:
			break;
		}
	}
	
	public void setMemento(StarMemento memento) {
		StarMementoInternal  state = (StarMementoInternal) memento;
		this.type = state.getType();
		this.ageYears = state.getAgeYears();
		this.massTon = state.getMassTon();
	}
	
	public StarMemento getMemento() {
		
		return new StarMementoInternal(type, ageYears, massTon);
		
	}
	
	
	@Override
	public String toString() {
		return "Star [type=" + type + ", ageYears=" + ageYears + ", massTon=" + massTon + "]";
	}

	private static class StarMementoInternal implements StarMemento{
		
		private StarType type;
		private int ageYears;
		private int massTon;
		
		public StarMementoInternal() {
			
		}
		
		public StarMementoInternal(StarType type, int ageYears, int massTon) {
			super();
			this.type = type;
			this.ageYears = ageYears;
			this.massTon = massTon;
		}

		public StarType getType() {
			return type;
		}
		
		public void setType(StarType type) {
			this.type = type;
		}
		
		public int getAgeYears() {
			return ageYears;
		}
		
		public void setAgeYears(int ageYears) {
			this.ageYears = ageYears;
		}
		
		public int getMassTon() {
			return massTon;
		}
		
		public void setMassTon(int massTon) {
			this.massTon = massTon;
		}
	}
}
