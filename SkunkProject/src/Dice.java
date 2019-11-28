import edu.princeton.cs.introcs.StdOut;

/**
 * Dice represents a single pair of rollable Die objects, randomly generating
 * sums of their two values
 * 
 * This is a Javadoc comment: add more to your finished class below
 * 
 * @author eric
 *
 */

public class Dice {
	// Instance fields (variables) may be declared anywhere in class body
	// Convention: put at top

	private int lastRoll;
	private Die die1;
	private Die die2;

	// Constructors (object initializers) also can be declared anywhere
	// Convention: after instance fields/variables

	public Dice() {
//		StdOut.println("Dice() object is constructed now.");
		// initialize instance variables die1 and die2 by
		// creating a new instance of each

		this.die1 = new Die();
		die1.roll();
		this.die2 = new Die();
		die2.roll();
	}

	public Dice(Die die1, Die die2) // overloaded constructor
	{
		this.die1 = die1;
		die1.roll();
		this.die2 = die2;
		die2.roll();
	}

	// Instance methods can also be declared anywhere in body of class
	// One convention: after the constructors

	public int getLastRoll() {
		return this.lastRoll;
	}

	public int die1GetLastRoll() {
		return die1.getLastRoll();
	}
	
	public int die2GetLastRoll() {
		return die2.getLastRoll();
	}
	
	public void roll() {
		// Roll each of die1, die2, sum their last rolls,
		// then set Dice.lastRoll to this value

		this.lastRoll = die1.getLastRoll() + die2.getLastRoll();

	}

	// the following method converts the internals of
	// this Dice object, and returns a descriptive String:
	//
	// Roll of 7 => 4 + 3

//	** Is this section of code needed for our program? I don't think so. **
	// static methods can go anywhere - but at end is one convention

	public static final int NUM_TRIALS = 360;

	public static void main(String[] args) {
		// simulate repeated rolls of Dice, counting the many double skunks

		Dice dice = new Dice();
		int doubleSkunkCount = 0;

		for (int i = 0; i < NUM_TRIALS; i++) {
			dice.roll();
			StdOut.println("Dice from the public static void main class" + dice);

			if (dice.getLastRoll() == 2)
				doubleSkunkCount++;
		}

		StdOut.println("Actual count: " + doubleSkunkCount);
		StdOut.println("Expected count: " + (NUM_TRIALS / 36.0));
	}
}