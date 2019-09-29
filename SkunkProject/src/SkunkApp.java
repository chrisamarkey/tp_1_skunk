import edu.princeton.cs.introcs.*;

public class SkunkApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdOut.println("Welcome to the Skunk game! Good luck!");
		
		Die dien;
		
		dien = new Die();
		dien.roll();
		
		StdOut.print(dien);
		
	}

}