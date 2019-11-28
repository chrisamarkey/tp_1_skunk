//import edu.princeton.cs.introcs.StdOut;

public class Turn {

	int[] turnsScores = null;
	private int turnScore = 0;
	int playerNum = 0;

	public Turn(int playerCount) {
		turnsScores = new int[playerCount];
		for (int i = 0; i < playerNum; i++) {
			turnsScores[i] = 0;
		}
	}
	
	public int playersTurn(Roll rollDice, int playerNumber)
	{
//		StdOut.println("playersTurn() object is constructed now.");
		playerNum = playerNumber;

		// Double Skunk, Skunk Deuce or Skunk rolled
		if (rollDice.playerLosesTurn() == true) {
//			Stop rolling the dice. Your turn is over.
			turnsScores[playerNum] = 0;
			return this.turnsScores[playerNum];
		}
			else {
			turnsScores[playerNum] += rollDice.getRollScore();
			return this.turnsScores[playerNum];
			}	
	}

	public int getTurnScore() {
		return this.turnsScores[playerNum];
	}

}