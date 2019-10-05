import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.introcs.StdOut;

public class TestDice
{

	@Test
	public void testDice() {
	  Die testDie1 = new Die();
	  Die testDie2 = new Die();
      testDie1.roll();
      testDie2.roll();
      int valueOne = testDie2.getLastRoll();
      int valueTwo = testDie2.getLastRoll();
      int total = valueTwo + valueOne;
      StdOut.println(total);
	}
	
}