//algorithm
//Input: how many dice to use, 6 sided dice, how many players
//output: biggest number that can be created with the digits on the dice roll
//Step 0:
//Step 1: ask user how many dice to use
//Step 2: make an array of dice objects that is numOfDice in length
//Step 4: Roll the dice -> all of the dice new have a value
//Step 5: make max = Dice[0].value
//Step 5: FOR each item in DiceArray
//	Step 5.2: IF DiceArray[i].value > max THEN
//		Step5.1.1: max = DiceArray[i].value
//Step 6: store the max value in biggestNum in the ones place moving all digits left
//Step 7: take that dice opject with the max value out of our array
//Step 8: go back to Step 5 until our list is empty
//Step 9: Output the number

package anotherDiceGame;
import java.util.ArrayList;
import java.util.Scanner;

public class BeatThatGame {
	public static void main(String[] args) {


		// Step 1:
		Scanner input = new Scanner(System.in);
		System.out.println("how many dice");
		
		int numOfDice = input.nextInt();
		
		ArrayList<Dice> arrayOfDice = new ArrayList<Dice>();
		for(int i = 0; i < numOfDice; i++) {
			arrayOfDice.add(new Dice());
			arrayOfDice.get(i).roll();
		}
		
		for(Dice diceObject: arrayOfDice) {
			System.out.println(diceObject);
		}
		
		int max = arrayOfDice.get(0).getValue();
		Dice maxDice = arrayOfDice.get(0);
		 for(Dice diceObject: arrayOfDice) {
			 if(diceObject.getValue() > max) {
				 max = diceObject.getValue();
			 	maxDice = diceObject;
			 }
		 }


	}

}
