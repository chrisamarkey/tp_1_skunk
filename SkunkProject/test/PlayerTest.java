import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PlayerTest {

	Player player = new Player();
	
	@Test
	public void testPlayer1() {
		
		assertEquals("testPlayer1", 0, player.getPlayerScore());
		
	}

	@Test	
	public void testPlayer2() {
		
		assertEquals("testPlayer2", 50, player.getPlayerChipCount());
		
	}

}