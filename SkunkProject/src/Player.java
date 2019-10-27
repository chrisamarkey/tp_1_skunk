
public class Player {

	private int chipCount = 50;
	private int playerScore = 0;
	int playerTotal = 0;
	int playerNum = 0;
	String playerName = null;
	Player player;
	Game newGame = new Game();
	Roll roll = new Roll();
	Turn turn = new Turn();
	
	public Player() {
//			this.playerScore = player.getPlayerScore();

	}

	public void setPlayer() {
		playerName = newGame.getPlayerName();
		playerTotal = newGame.getNumPlayers();
	}

	public Player getPlayer() {
		return this.player;
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