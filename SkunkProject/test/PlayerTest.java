import edu.princeton.cs.introcs.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


class PlayerTest {

	Player player = new Player();
	Roll roll = new Roll();
	Game newGame = new Game(1, "Chris");
	
	@Test
	public void testPlayer1() {
		
		assertEquals("testPlayer1", 0, player.getPlayerScore(1));
		
	}

	@Test	
	public void testPlayer2() {
		assertEquals("testPlayer2", 50, player.getPlayerChipCount(1));
		
	}
	
	@Test	
	public void testPlayer3() {
		
		assertEquals("testPlayer3", 0, player.getPlayerNum());
		
	}
	
	@Test	
	public void testPlayer4() {	
		assertEquals("testPlayer2", "Chris", newGame.getPlayerName());
		
	}

}
