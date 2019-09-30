
public class Die
{
	private int lastRoll;
	public int RollType;
	
	public Die()
	{
		this.roll();
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
		this.lastRoll = 1;
		}
		int i = 1;
		while (i < 7)
		{
			i += 1;
		}
		}

	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "Die: " + this.getLastRoll();
	}

}
