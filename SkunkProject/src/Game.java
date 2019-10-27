import edu.princeton.cs.introcs.*;

public class Game {
	
//	String[] playersNames = new String[] {"Chris", "Grant", "Sally", "Pat", "Mike"};
	int numPlayers = 0;
	int playerNumber = 0;
	String playersName = null;
	Turn playTurn = new Turn();
	int gameScore = 0;
	Roll rollDice = new Roll();
	int playerName;
	
	public Game() {
		
	}
	
//	public int playGame() {
//	
////	StdOut.println("Enter the # of players in this game.");
////	int numPlayers = StdIn.readInt();
//	
////	Turn turnInst;
////	playerInst = new Player();
//		
//		return playTurn.getTurnScore();
//
//}
	
	public Game(int playerCount, String namesPlayer) {
		
		this.numPlayers = playerCount;	
		this.playersName = namesPlayer;
		
	}
	
	public String getPlayerName()
	{
		return this.playersName;
	}
	
	public int getNumPlayers()
	{
		return this.numPlayers;
	}
	
	public int getGameScore() {
		if (rollDice.playerLosesTurn() == true) {
			gameScore = 0;
		}
		else {
			gameScore += playTurn.getTurnScore();
		}
		return this.gameScore;
	}
	
}