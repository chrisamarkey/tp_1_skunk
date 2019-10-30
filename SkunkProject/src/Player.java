import edu.princeton.cs.introcs.StdOut;

public class Player {

	private int chipCount = 50;
	private int playerScore = 0;
	int playerNum = 0;
	String playerName = null;
//	Player player = new Player();
	Game newGame = new Game();
	Roll roll = new Roll();
//	Skipping player takes a turn and going directly to Roll class using Roll and Skunk
//	classes to control the turn and return the results of the turn.
//	Turn turn = new Turn();
	
	public Player(int playerCount, String playerID) {
		this.playerName = playerID;
		this.playerNum = playerCount;
			StdOut.println("Player(int playerCount, String playerID) object is constructed now.");
//			this.playerScore = player.getPlayerScore();
//			StdOut.println("playerScore w/in the Player class = " + this.getPlayerScore());

	}
	
	public Player() {
//		player.getPlayerName();
//		player.getPlayerNum();
			StdOut.println("Player() object is constructed now.");
//			this.playerScore = player.getPlayerScore();

	}

	public void setPlayer() {
		playerName = newGame.getPlayerName();
		playerNum = newGame.getNumPlayers();
	}

	public String getPlayerName() {
		return this.playerName;
	}
	
	public int getPlayerNum() {
		return this.playerNum;
	}

//	public void setPlayerScore() {
//		playerScore = 0;
//	}

	public int getPlayerScore() {
		this.playerScore += newGame.getGameScore();
		return this.playerScore;
	}

	public int getPlayerChipCount() {
		return this.chipCount += roll.updateChipCount();
	}

}