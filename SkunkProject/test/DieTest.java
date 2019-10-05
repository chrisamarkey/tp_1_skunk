import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.princeton.cs.introcs.StdOut;

public class DieTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testInitializationofPredictableDie() {
//		// fail("Not yet implemented");
//		int[] initValues = new int[] {1,2,3,4,5,6};
//		Die die = new Die(initValues);
//		int value = die.getLastRoll();
//		assertEquals("First value is not 1", 1, value);
//	}

	@Test
	public void testRoll2and3() {
		// fail("Not yet implemented");
		int[] initValues = new int[] { 1, 2, 3, 4, 5, 6 };
		Die die = new Die(initValues);
		die.roll();
		StdOut.printf("testRoll2 value roll 2 = ", die.getLastRoll());
		assertEquals("First value not 2", 2, die.getLastRoll());
		die.roll();
		int value = die.getLastRoll();
		StdOut.printf("testRoll2 value roll 3 = ", value);
		assertEquals("Second value not 3", 3, value);
	}

//	@Test
//	public void testRoll4() {
//		// fail("Not yet implemented");
//		int[] initValues = new int[] { 1, 2, 3, 4, 5, 6 };
//		Die die = new Die(initValues);
//		die.roll();
//		die.roll();
//		die.roll();
//		int value = die.getLastRoll();
//		StdOut.printf("testRoll3 value = ", value);
//
//		assertEquals("First value not 4", 4, value);
//	}

//	@Test
//	public void testRoll7() {
//		// fail("Not yet implemented");
//		int[] initValues = new int[] { 1, 2, 3, 4, 5, 6 };
//		Die die = new Die(initValues);
//		die.roll();
//		die.roll();
//		die.roll();
//		die.roll();
//		die.roll();
//		die.roll();
//		int value = die.getLastRoll();
//		StdOut.printf("testRoll7 value = ", value);
//
//		assertEquals("First value not 1", 1, value);
//
//	}
	

	@Test
	public void testRoll0() {
	  int counter = 0;
	  while (counter <= 100) {
	    int initiateValue1 = (int) (Math.random() * 6 + 1);
	    int initiateValue2 = (int) (Math.random() * 6 + 1);
	    int[] testValue = new int[] { initiateValue1, initiateValue2 };
	    Die die = new Die(testValue);
        die.roll();
        int value = die.getLastRoll();
 	    if ( value == 0 ) {
	      StdOut.print(value + " equals 0!");
	      fail();
 	    } else {
	      StdOut.print(value + " doesn't equal 0");
 	    }
 	  counter++;
	  }
	}

	@Test
	public void testRoll7() {
	  int counter = 0;
	  while (counter <= 100) {
	    int initiateValue1 = (int) (Math.random() * 6 + 1);
	    int initiateValue2 = (int) (Math.random() * 6 + 1);
	    int[] testValue = new int[] { initiateValue1, initiateValue2 };
	    Die die = new Die(testValue);
        die.roll();
        int value = die.getLastRoll();
 	    if ( value >= 7 ) {
	      StdOut.print(value + " is greater than or equal to 7!");
	      fail();
 	    } else {
	      StdOut.print(value + " doesn't equal 7");
 	    }
 	  counter++;
	  }
	}
	
}
