import static org.junit.Assert.*;

import edu.princeton.cs.introcs.StdOut;

import org.junit.jupiter.api.Test;

class TestDice {

	private Die testDie1;
	private Die testDie2;
	private Dice newDice;

//	
//	private void setupDice() {
//		int[] testValues = new int[] { 1,2,3,4,5,6 };
//		testDie1 = new Die(testValues);
//		testDie2 = new Die(testValues);
//	    newDice = new Dice(testDie1, testDie2);
//	}
//
//	newDice.setupDice();
	
	@Test
	public void testDice() {
		int[] testValues = new int[] { 1,2,3,4,5,6 };
		testDie1 = new Die(testValues);
		testDie1.roll();
		int valueOne = testDie1.getLastRoll();
//		StdOut.print("valueOne = " + valueOne);
		testDie2 = new Die(testValues);
		testDie2.roll();
		int valueTwo = testDie2.getLastRoll();
//		StdOut.print("valueTwo = " + valueTwo);
		int total = valueTwo + valueOne;
//		StdOut.print("Total die value = " + total);
		newDice = new Dice(testDie1, testDie2);
//		StdOut.print("testDie1 = " + testDie1.getLastRoll());
//		StdOut.print("testDie2 = " + testDie2.getLastRoll());
		newDice.roll();
//		StdOut.print("newDice = " + newDice.getLastRoll());
		assertEquals("Total value not 6", 6, newDice.getLastRoll());   
	}
	
}