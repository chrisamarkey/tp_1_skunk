import edu.princeton.cs.introcs.StdOut;

public class Turn {

	private int turnScore = 0;
//	private Roll rollDice;
//	private boolean declineRoll = false;
//	private Turn takeTurn = new Turn();
//	private SkunkApp skunk = new SkunkApp();

	public int playersTurn(Roll rollDice) {
		StdOut.println("playersTurn() object is constructed now.");
		// Create a Roll class instance to gather turn data.
//		this.rollDice = new Roll();
		// Double Skunk, SKunk Deuce or Skunk rolled
		if (rollDice.playerLosesTurn() == true) {
//			Stop rolling the dice. Your turn is over.
			turnScore = 0;
			return this.turnScore;
		} else {
			turnScore += rollDice.getRollScore();
			return this.turnScore;
		}
	}

	public int getTurnScore() {
		return this.turnScore;
	}

}
