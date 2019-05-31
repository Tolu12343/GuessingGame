package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guessingGame.GuessingGame;
import guessingGame.User;

public class UserTest {

	 User u1;
	 User u2;
	 User u3;
	 
	 @Before
	 public void setup() {
	    	 u1 = new User("Sam", "west");
	    	 u2 = new User("Sam", "higher");
	    	 u3 = new User("Sam", "lower");
	    }
	
	@Test
	public void rangeWrongTest() {
		assertNull("wrong input for range", u1.getRange());
	}
	
	@Test
	public void rangeRightTest() {
		assertEquals("wrong input for range", "HIGHER", u2.getRange());
	}
	@Test
	public void rangeRightSecondTest() {
		assertEquals("wrong input for range", "LOWER", u3.getRange());
	}

}
