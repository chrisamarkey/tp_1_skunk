import edu.princeton.cs.introcs.StdOut;

public class Roll {

	private int rollScore;
	private int turnScore;
	private int gameScore;
	private Dice newDice;
	private Die die1;
	private Die die2;
	private boolean loseTurn = false;
	private int playerChipCount;

	public int throwDice() {

		this.newDice = new Dice();

		//this.die1 = new Die();
		//die1.roll();
		//this.die2 = new Die();
		//die2.roll();

		// Double Skunk rolled

//		if ((die1.getLastRoll()==1)&(die2.getLastRoll()==1))
		if (newDice.getLastRoll() == 2 ) 
		{
			rollScore = 0;
			turnScore = 0;
			gameScore = 0;
			this.playerChipCount += -4;
			loseTurn = true;
		}

		// Skunk rolled
//		else if ((die1.getLastRoll()==1||die2.getLastRoll()==1))
//		{
//			rollScore = 0;
//			turnScore = 0;
//			this.playerChipCount += -1;
//			loseTurn = true;
//		}

		// Skunk Deuce rolled
//		else if((die1.getLastRoll()==1&die2.getLastRoll()==2)||(die1.getLastRoll()==2&die2.getLastRoll()==1))
		else if (newDice.getLastRoll() == 3)
		{
			rollScore = 0;
			turnScore = 0;
			playerChipCount += -2;
			loseTurn = true;
		}
//		else rollScore = die1.getLastRoll() + die2.getLastRoll(); 
		else rollScore = newDice.getLastRoll();
	    turnScore = turnScore + rollScore;	
	    return rollScore;
		//return turnScore;

	}

	public boolean playerLosesTurn() {
		return this.loseTurn;
	}

	public int getChipCount() {
		return this.playerChipCount;
	}
	
	public void setRollScore() {
//		rollScore = 3;
	}

	public int getRollScore() {
		return this.rollScore;
	}

	public int getTurnScore() {
		return this.turnScore;
	}

	public int getGameScore() {
		return this.gameScore;
	}	

}