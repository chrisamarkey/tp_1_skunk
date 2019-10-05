import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.introcs.StdOut;

public class TestDice
{

	@Test
	public void testDice() {
	  int[] testValues = new int[] { 1,2,3,4,5,6 };
	  Die testDie1 = new Die(testValues);
	  Die testDie2 = new Die(testValues);
      testDie1.roll();
      testDie2.roll();
      int valueOne = testDie1.getLastRoll();
      int valueTwo = testDie2.getLastRoll();
      int total = valueTwo + valueOne;
      StdOut.println(total);
	}
	
}