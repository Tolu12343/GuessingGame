package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guessingGame.GuessingGame;
import guessingGame.Player;
import guessingGame.User;

public class GameTest {
  GuessingGame g1;
  GuessingGame g2;
  Player p1;
  User u1;
  User u2;
  User u3;
  @Before
  public void setup() {
	  p1 = new Player("Tolu", 10);
	  u1 = new User("Sam", "HIGHER");
	  u2 = new User("Sam", "LOWER");
	  g1 = new GuessingGame();
	  g2 = new GuessingGame();
  }
	@Test
	public void higherRangeTest() {
		assertNotEquals("Wrong value", g1.test, g1.logic(p1, u1));
	}
	@Test
	public void lowerRangeTest() {
		assertNotEquals("Wrong value", g2.test, g2.logic(p1, u2));
	}
	
	
	
  

}
