import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.introcs.StdOut;

class RollTest {

	Die testDie1;
	Die testDie2;

	Dice newDice;

	@Test
	// This tests whether testDie1 rolled a 1 or not.
	public void testRoll1() {

		testDie1 = new Die();
		testDie2 = new Die();

		newDice = new Dice(testDie1, testDie2);
		newDice.roll();
		assertEquals("testDie1 rolled a Skunk!", 1, testDie1.getLastRoll());
	}

	@Test
	// This tests whether testDie2 rolled a 1 or not.
	public void testRoll2() {

		testDie1 = new Die();
		testDie2 = new Die();

		newDice = new Dice(testDie1, testDie2);
		newDice.roll();
		assertEquals("testDie2 rolled a Skunk!", 1, testDie2.getLastRoll());
	}

	@Test
	// This tests whether a Double Skunk was rolled or not.
	public void testRoll3() {

		testDie1 = new Die();
		testDie2 = new Die();

		newDice = new Dice(testDie1, testDie2);
		newDice.roll();
		assertEquals("newDice rolled a Double Skunk!", 2, newDice.getLastRoll());

	}

	@Test
	// This test ensures that testDie1's and testDie2's values are not > 6 or < 1.
	public void testRoll4() {

		testDie1 = new Die();
		testDie2 = new Die();

		newDice = new Dice(testDie1, testDie2);
		newDice.roll();

		if ((testDie1.getLastRoll() < 1) || (testDie1.getLastRoll() > 6) || (testDie2.getLastRoll() < 1)
				|| (testDie2.getLastRoll() > 6)) {
			StdOut.printf("Die value cannot be < 1 or > 6. Failed test!");
		}

	}

}
