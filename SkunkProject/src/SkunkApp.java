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

		// taking String array input from user
		System.out.println("Please enter the number of players in this game.");
		int numPlayers = StdIn.readInt();

		// create a String array to save user input
		String[] namePlayers = new String[numPlayers];

		// loop over array to save user input
		System.out.println("Please enter the players names.");
		for (int i = 0; i < numPlayers; i++) {
	        System.out.print("Enter a player's name: ");
	        namePlayers[i] = StdIn.readString();
//	        System.out.println("Player's name read from console is : \n"+ namePlayers[i]);	
		}

		// Decide whether to do a die random # or sequential # generation.
//		StdOut.println("Enter a '1' for a random die # generation or a '0' for sequential die # generation.");
//		int RollType = StdIn.readInt();

		int num = 0;
		Game newGame = new Game(numPlayers, namePlayers[num]);
		StdOut.println(newGame.getGameScore());
		
		Player player = new Player(numPlayers, namePlayers[num]);
		player.setPlayer();
		StdOut.println("Player's name is: " + namePlayers[num]);
		

		while (true) {
			StdOut.println("In the while loop now!");
			Turn playTurn = new Turn();
			StdOut.println("Player's score is: " + playTurn.getTurnScore());

			Roll roll = new Roll();
			StdOut.println(roll.getRollScore());
			
			String continueToRoll = null;

//			// These if else statements continuously check whether the player loses his turn or not.
//			if (roll.playerLosesTurn() == true) {
//				continueToRoll = "no";
//			} 
//			else {
//				continueToRoll = "yes";
//			}
			
			// This question can be used when an individual player start their rolls and
						// after each subsequent roll.
			StdOut.println("Do you want to roll or roll again? Please enter a 'yes' or 'no' answer.");
			continueToRoll = StdIn.readString().toLowerCase();
//			roll.throwDice();
//			StdOut.println("I am here!");
			if (continueToRoll.equals("yes")) {
				StdOut.println("Rolling");
				roll.throwDice();
				StdOut.println("Roll score for this roll is " + roll.getRollScore());
			} else if (continueToRoll.equals("no") || roll.playerLosesTurn() == true) {
				StdOut.println("Ending turn for player: " + namePlayers[num]);
				StdOut.println("Roll score: " + roll.getRollScore());
				StdOut.println("Score for turn: " + playTurn.getTurnScore());
				StdOut.println("Score for game: " + newGame.getGameScore());
				num++;
				break;
			} else {
				StdOut.println("Please enter 'yes' or 'no'");
			}

		}
	}
}