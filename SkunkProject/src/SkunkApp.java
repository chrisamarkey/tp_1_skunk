import edu.princeton.cs.introcs.*;

//You should implement SkunkApp with starting main() and other classes so that your app 
//plays a complete interactive Turn of Skunk with one human Player. A Turn starts with 
//asking the player by name if they wish to roll and ends after either the user declines
//to roll again, or else throws a Skunk. 

public class SkunkApp {

	
	
	public static void main(String[] args) {

		StdOut.println("Welcome to the Skunk game! Good luck! Don't get skunked!");
		
		// Decide whether to do a die random # or sequential # generation.
		StdOut.println("Enter a '1' for a random die # generation or a '0' for sequential die # generation.");
		int RollType = StdIn.readInt();

//		Dice dien;
//		dien = new Dice();
//		dien.roll();
//		StdOut.print(dien);
		
//		Dice dice = new Dice();
//		dice.roll();
//		StdOut.println(dice);
		
		Roll roll = new Roll();
		roll.throwDice();
		StdOut.println(roll.getRollScore());
		
		while ( true )
		{

		  // Hopefully this question can be used when a player start their rolls and after each subsequent roll.
		  StdOut.println("Do you want to roll again? Please enter a 'yes' or 'no' answer.");
		  String continueToRoll = StdIn.readString().toLowerCase();	
		  if (continueToRoll.equals("yes"))
		  {
            StdOut.println("Rolling again");
//  		Dice dienCont;
// 		    dienCont = new Dice();
//  		dienCont.roll();
//  		StdOut.print(dienCont);
            roll.throwDice();
            StdOut.println(roll.getRollScore());
		  }
		  else if (continueToRoll.equals("no"))
		  {
			 StdOut.println("Ending turn");
			 StdOut.println("Roll score: " + roll.getRollScore());
			 StdOut.println("Score for turn: " + roll.getTurnScore());
			 break;
		  }
		  else 
		  {
			 StdOut.println("Please enter 'yes' or 'no'"); 
		  }
	      	
		}
		
	} 
	
}