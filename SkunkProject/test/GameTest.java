import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GameTest {
	
	String[] names = new String[] {"Chris", "Grant", "Sally", "Pat", "Mike"};
	String name = "Chris";

	int numPlayers = 5;

//	@SuppressWarnings("deprecation")
	@Test

		public void testGame1() {
			
			Game game = new Game(numPlayers, name);
			
			assertEquals("testGame1", name, game.getPlayerName());
			
		}

}
