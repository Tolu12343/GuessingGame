package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guessingGame.GuessingGame;
import guessingGame.Player;
import guessingGame.User;

public class PlayerTest {

    Player p1;
    Player p2;
 
    @Before
    public void setup() {
    	p1 = new Player("Tolu", 10);	
    	p2 = new Player("Tolu", -1);
    }
    
	@Test
	public void numRightTest() {
		assertEquals("The number is out of range",10, p1.getPlayerNumber() );
	}
	
	@Test
	public void numWrongTest() {
		assertNotEquals("The number is out of range",-1, p2.getPlayerNumber() );
	}
	
	
	
	
	

}
