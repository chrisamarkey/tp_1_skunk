import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.introcs.StdOut;

public class TestDice
{

	@Test
	public void testDice() {
	  Dice testDie1 = new Dice();
	  Dice testDie2 = new Dice();
      testDie1.roll();
      testDie2.roll();
	}


}
