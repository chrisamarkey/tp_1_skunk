//import edu.princeton.cs.introcs.StdOut;

import edu.princeton.cs.introcs.StdOut;

public class Roll {

	private int rollScore = 0;
	private int turnScore = 0;
	private int gameScore = 0;
	private Dice newDice;
	private int playerNum = 0;
	private boolean loseTurn = false;
	private int playerChipCount = 50;

	public int throwDice(int playerNum) {

		this.newDice = new Dice();
		newDice.roll();
		this.playerNum = playerNum;

		// Double Skunk rolled
		if (newDice.getLastRoll() == 2) {
			rollScore = 0;
			turnScore = 0;
			gameScore = 0;
			this.playerChipCount += -4;
//			newGame.setPlayerGameScore(playerNum) = 0; //12-14-19
			StdOut.println("***You rolled a double skunk!!!");
			loseTurn = true;
		}

		// Skunk Deuce rolled
		else if (newDice.getLastRoll() == 3) {
			rollScore = 0;
			turnScore = 0;
			playerChipCount += -2;
			StdOut.println("**You rolled a skunk deuce!!");
			loseTurn = true;
		}
		
		// Skunk rolled
		else if ((newDice.die1GetLastRoll() == 1 || newDice.die2GetLastRoll() == 1)) {
			rollScore = 0;
			turnScore = 0;
			this.playerChipCount += -1;
			StdOut.println("*You rolled a skunk!");
			loseTurn = true;

		} else
			rollScore = newDice.getLastRoll();
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

	public int getDie1Score() {
		return this.newDice.die1GetLastRoll();
	}
	
	public int getDie2Score() {
		return this.newDice.die2GetLastRoll();
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

	public int getPlayerChipCounts() {
		return this.playerChipCount;
	}
	
	public int updateKitty() {
		return -this.playerChipCount;
	}

}
