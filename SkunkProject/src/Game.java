//import edu.princeton.cs.introcs.StdOut;

//import edu.princeton.cs.introcs.*;

public class Game {

	int numPlayers = 0;
	int playerNumber = 6;
	int playerName;
	String playersName = null;
	int[] gamesScores = null;
	int[] gamesChipCount = null;
	int gameScore = 0;
	Turn playTurn = new Turn(playerNumber);
	Roll rollDice = new Roll();

	public Game() {

	}

	public Game(int playerCount, String playerID) {
//		StdOut.println("Game(int playerCount, String playerID) object is constructed now.");
		this.numPlayers = playerCount;
		this.playersName = playerID;
		gamesScores = new int[numPlayers];
		for (int i = 0; i < numPlayers; i++) {
			gamesScores[i] = 0;
		}
//		Player player = new Player(playerCount, playerID);

	}

	public String getPlayerName() {
		return this.playersName;
	}

	public int getNumPlayers() {
		return this.numPlayers;
	}

	public int getGameScore() {
		if (rollDice.playerLosesTurn() == true & rollDice.getRollScore() == 2) {
			gameScore = 0;
		} else {
			gameScore = playTurn.getTurnScore();
		}
		return this.gameScore;
	}

	public int getGamesScores(int j) {
//		gamesScores[j] += gameScore;
		gamesScores[j] = gameScore;
		return gamesScores[j];
	}
	
	public int getGameChipScore(int j) {
		
		gamesChipCount[j] = rollDice.updateChipCount();
		return this.gamesChipCount[j];
	}

}