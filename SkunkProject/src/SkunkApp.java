import edu.princeton.cs.introcs.*;

//You should implement SkunkApp with starting main() and other classes so that your app 
//plays a complete interactive Turn of Skunk with one human Player. A Turn starts with 
//asking the player by name if they wish to roll and ends after either the user declines
//to roll again, or else throws a Skunk. 

public class SkunkApp {

	int numPlayers = 0;
	String[] namePlayers = null;

	public static void main(String[] args) {

		StdOut.println("Welcome to the Skunk game! Good luck! Don't get skunked!");

		// Taking String array input from user
		System.out.println("Please enter the number of players in this game.");
		int numPlayers = StdIn.readInt();
		// Create a String array to save user input
		String[] namePlayers = new String[numPlayers];

		// Loop over array to save user input
		System.out.println("Please enter the players names.");
		for (int i = 0; i < numPlayers; i++) {
			System.out.print("Enter a player's name: ");
			namePlayers[i] = StdIn.readString();
		}

		int num = 0;
		Game newGame = new Game(numPlayers, namePlayers[num]);

		Player player = new Player(numPlayers, namePlayers[num]);
		player.setPlayer();
		StdOut.println("Player's name is: " + namePlayers[num]);

		int j = 0;

		while (newGame.gamesScores[j] < 100) {

			int count = 0;

			while (true) {
				count = count + 1;
				Roll roll = new Roll();
				String continueToRoll = null;

				// This question can be used when an individual player start their rolls and
				// after each subsequent roll.
				StdOut.println(
						namePlayers[j] + " Do you want to roll or roll again? Please enter a 'yes' or 'no' answer.");
				continueToRoll = StdIn.readString().toLowerCase();
				if (continueToRoll.equals("yes")) {
					StdOut.println(namePlayers[j] + " is rolling");
					roll.throwDice();
					StdOut.println("Roll score for this roll is " + roll.getRollScore());
					StdOut.println("Score for turn: " + newGame.playTurn.playersTurn(roll, j));
					newGame.getGameScore();
					StdOut.println("Score for game: " + newGame.getGamesScores(j));
				}
				if (continueToRoll.equals("no") || roll.playerLosesTurn() == true || newGame.gamesScores[j] > 100) {
					StdOut.println("Ending turn for player: " + namePlayers[j]);
					StdOut.println("Score for turn: " + newGame.playTurn.getTurnScore() + "Score for game: "
							+ newGame.getGamesScores(j));
					break;
				}

			}

			if (newGame.gamesScores[j] < 100) {
				j = (j + 1) % numPlayers;
			}

		}
	}
}