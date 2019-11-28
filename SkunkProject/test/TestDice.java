import static org.junit.Assert.*;

import edu.princeton.cs.introcs.StdOut;

import org.junit.jupiter.api.Test;

//Note: To test this Dice class, Die class's private int RollType needs to be set to 0.

class TestDice {

	private Die testDie1;
	private Die testDie2;
	private Dice newDice;
	
	@Test
	public void testDice() {
		int[] testValues = new int[] { 1,2,3,4,5,6 };
		testDie1 = new Die(testValues);
		int initValueOne = testDie1.getLastRoll();
		testDie1.roll();
		int valueOne = testDie1.getLastRoll();
		testDie2 = new Die(testValues);
		testDie2.roll();
		int valueTwo = testDie2.getLastRoll();
		int total = valueTwo + valueOne;
		newDice = new Dice(testDie1, testDie2);
		newDice.roll();
		StdOut.print("newDice = " + newDice.getLastRoll() + "\n");
		assertEquals("Total value = 6", 6, newDice.getLastRoll());   
	}
	
}