package guessingGame;

import java.util.ArrayList;

public class GuessingGame {
	public int result;
	public int test;
	public boolean rangeNumCheck = false;
	public GuessingGame() {
	}

  public String logic (Player p1, User p2) {
    	if(p2.getRange().equals("HIGHER")){
    		test = (int) Math.round(Math.random() * p1.getRangeNum());
    		while(true) {
    			result = (int) Math.round(Math.random() * p1.getRangeNum());
    			if(result> p1.getPlayerNumber()) {
    				break;
    			}
    		}		
    	} else {
    		System.out.println(p2.getRange());
    		test = (int) Math.round(Math.random() * p1.getRangeNum());
    		while(true) {
    			result = (int) Math.round(Math.random() * p1.getRangeNum());
    			if(result < p1.getPlayerNumber()) {
    				break;
    			} 
    		}	
    	}
    	return "The computer guesses: " + Integer.toString(result);
    }

    
}
