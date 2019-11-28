//import edu.princeton.cs.introcs.StdOut;

public class Die
{
	private int lastRoll;
	private int RollType = 1;
	// Since the Die constructor did not import the int[] properly, I added the int[] here:
	private int[] seqRoll = {1,2,3,4,5,6};
	int i = 0;
	
	public Die()
	{
//		StdOut.println("Die() object is constructed now.");
		this.roll();
	}

	public Die(int[] seqRolls)
	{
//		StdOut.println("Die(int[] seqRolls) object is constructed now.");
		// predictable = true;
		this.roll();
		this.seqRoll = seqRolls;		
	}
	
	public int getLastRoll() // getter or accessor method
	{

		return this.lastRoll;
	}

	public void roll() // note how this changes Die's state, but doesn't return
						// anything. New: Modified this function to enable predictable die results.
	{
		if (RollType == 1) {
		this.lastRoll = (int) (Math.random() * 6 + 1);
		}
		else {
			this.lastRoll = seqRoll[i];
			if (seqRoll[i] < 6) {
				i++;
		}
			else i = 0;
		}
		}
	
	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "Die: " + this.getLastRoll();
	}

}