package anotherDiceGame;

public class Dice {
	private int value;
	private int numOfSides;
	
	public Dice(int numOfSides) {
		this.numOfSides = numOfSides;
	}
	public Dice() {
		this.numOfSides = 6;
		value = 1;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getNumOfSides() {
		return numOfSides;
	}
	public void setNumOfSides(int numOfSides) {
		this.numOfSides = numOfSides;
	}
	public String toString() {
		return "Dice [value= " + value + ", numOfSides= " + numOfSides + "]";
	}
	public int roll() {
		return value =(int)(Math.random() * numOfSides) + 1 ;
	}

	
}//end class
