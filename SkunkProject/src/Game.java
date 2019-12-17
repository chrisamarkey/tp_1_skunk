
//import edu.princeton.cs.introcs.StdOut;

import edu.princeton.cs.introcs.*;

public class Game {

	int numPlayers = 0;
	int playerNumber = 6;
	int playerName;
	String playersName = null;
	int[] gamesScores = null;
	int[] gamesChipCount = { 50, 50, 50, 50, 50 }; //12/14/19
	int gameScore = 0;
	Roll rollDice = new Roll();
	Turn playTurn = new Turn(playerNumber);
	
	public Game() {

	}

	public Game(int playerCount, String playerID) {
		this.numPlayers = playerCount;
		this.playersName = playerID;
		gamesScores = new int[numPlayers];
		for (int i = 0; i < numPlayers; i++) {
			this.gamesScores[i] = 0;
//			this.gamesChipCount[i] = 0; //12/14/19
		}

	}

	public String getPlayerName() {
		return this.playersName;
	}

	public int getNumPlayers() {
		return this.numPlayers;
	}

	public int getGameScore() {
		if (rollDice.playerLosesTurn() == true & rollDice.getRollScore() == 2) {
			this.gameScore = 0;
//			this.setPlayerGameScore(j); // 12-14-19
			StdOut.println("You rolled a double skunk!!!!");
		} else {
			this.gameScore += playTurn.getTurnScore(); // 12/14/19 Issue with this logic!
//			this.gameScore = playTurn.getTurnScore(); // 12/14/19 Issue with this logic!
		}
		return this.gameScore;
	}

	public int getPlayerGameScore(int j) {
//		gamesScores[j] += gameScore;
		gamesScores[j] = playTurn.playersTurn(rollDice, j);
		return gamesScores[j];
	}
	
	public void setPlayerGameScore(int j) {
		
	}

	public int getPlayerGameChipScore(int j) {
		if (rollDice.playerLosesTurn() == true & rollDice.getRollScore() == 2) {
			StdOut.println("You rolled a double skunk!!!!");
			return this.gamesChipCount[j];
		} else {
//			gamesChipCount[j] = rollDice.updateChipCount();
//			return this.gamesChipCount[j];
			return this.rollDice.updateChipCount();
		}
	}

}
