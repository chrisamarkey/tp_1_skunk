import edu.princeton.cs.introcs.StdOut;

//import edu.princeton.cs.introcs.StdOut;

public class Roll {

	private int rollScore = 0;
	private int turnScore;
	private int gameScore;
	private Dice newDice;
//	private Die die1;
//	private Die die2;
	private boolean loseTurn = false;
//	private boolean eraseTurnScore = false;
//	private boolean eraseGameScore = false;
	private int playerChipCount;

	public int throwDice() {

		StdOut.println("throwDice() object is constructed now.");
		this.newDice = new Dice(); 
//		this.die1 = new Die();
//		this.die2 = new Die();
//		this.newDice = new Dice(die1, die2);

		// Double Skunk rolled
		if (newDice.getLastRoll() == 2) {
			rollScore = 0;
//			eraseTurnScore = true;
			turnScore = 0;
//			eraseGameScore = true;
			gameScore = 0;
			this.playerChipCount += -4;
			loseTurn = true;
		}

		// Skunk rolled
		else if ((newDice.die1GetLastRoll() == 1 || newDice.die2GetLastRoll() == 1)) {
			rollScore = 0;
//			eraseTurnScore = true;
			turnScore = 0;
			this.playerChipCount += -1;
			loseTurn = true;
			
		}

		// Skunk Deuce rolled
		else if (newDice.getLastRoll() == 3) {
			rollScore = 0;
//			eraseTurnScore = true;
			turnScore = 0;
			playerChipCount += -2;
			loseTurn = true;

		} else
			rollScore = newDice.getLastRoll();
			StdOut.println("This prints the rollScore w/in the Roll class " + rollScore);
		return rollScore;

	}

//	Setup Turn method to trigger on this method being true before updating chip counts, roll score, turn score and game score.
//	except for rollscore which should always be updated from calling updateRollScore from this class.
	
	public boolean playerLosesTurn() {
		return this.loseTurn;
	}

	public int getRollScore() {
		return this.rollScore;
	}
	
	public int updateChipCount() {
		return this.playerChipCount;
	}

	public int updateTurnScore() {
		return this.turnScore;
	}

	public int updateGameScore() {
		return this.gameScore;
	}
	
	public int updateKitty() {
		return -this.playerChipCount;
	}

}