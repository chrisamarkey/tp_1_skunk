import edu.princeton.cs.introcs.*;

public class SkunkApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdOut.println("Welcome to the Skunk game! Good luck! Don't get skunked!");

		Die dien;
		StdOut.println("Welcome to the Skunk game! Good luck! Don't get skunked!");

//		int RollType;
//		Die dien;
		// Decide whether to do a die random # or sequential # generation.
		StdOut.println("Enter a '1' for a random die # generation or a '0' for sequential die # generation.");
		int RollType = StdIn.readInt();

		dien = new Die();
		dien.roll();

		StdOut.print(dien);
//		StdOut.println("Enter a '1' for a random die # generation or a '0' for sequential die # generation.");
//		RollType = StdIn.readInt();	
//		dien = new Die();
//		dien.roll();
//		StdOut.print(dien);

	} 
	
}