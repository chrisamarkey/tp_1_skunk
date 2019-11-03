import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PlayerTest {
	
//	private int playerNum;
//	private String playerID;

	Player player = new Player();
	
	@Test
	public void testPlayer1() {
		
		assertEquals("testPlayer1", 0, player.getPlayerScore());
		
	}

	@Test	
	public void testPlayer2() {
		
		assertEquals("testPlayer2", 50, player.getPlayerChipCount());
		
	}
	
	@Test	
	public void testPlayer3() {
		
		assertEquals("testPlayer3", 0, player.getPlayerNum());
		
	}
	
	@Test	
	public void testPlayer4() {
		
		assertEquals("testPlayer2", "Chris", player.getPlayerName());
		
	}

}