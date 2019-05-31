package main;
import java.util.*;

import guessingGame.GuessingGame;
import guessingGame.Player;
import guessingGame.User;
public class Main {
public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	boolean playerCheck = false;
	int playerNum = 0;
	boolean userCheck =false;
	boolean nameCheck = true;
	String p2 = "";
	String u2 = "";
	String r = "";
	boolean continueCheck = false;
	boolean rangeNumCheck = false;
	int rangeNum =0;
	while(true) {
		if(nameCheck == true) {
			System.out.println("Player, enter your name or username");
			p2 = userInput.nextLine();
		}
		if(playerCheck == false) {
				System.out.println("");
				System.out.println("Player, enter your number");
				try {
					playerNum = userInput.nextInt();
				} catch(InputMismatchException ime) {
					System.out.println("Wrong entry for number");
				}	
		}
	
		if(rangeNumCheck == false) {
			
			System.out.println("");
			System.out.println("Player, enter the playing range"
					+ " it must be greater than 10");
			try {
				rangeNum = userInput.nextInt();
			} catch(InputMismatchException ime) {
				System.out.println("Wrong entry for the player number");
			}
		}
		if(nameCheck == true) {
			System.out.println("");
			userInput.nextLine();
			System.out.println("User, enter your name or username");
			u2 = userInput.nextLine();
			nameCheck = false;
		}
		
		if(userCheck == false) {
			System.out.println("User, enter your range it has "
					+ "it has to be \"higher\" or \"lower\"");
			
			r = userInput.nextLine();
		}
		Player p1 = new Player(p2,playerNum, rangeNum);
		User u1 = new User(u2,r);
		p1.setRangeNum(rangeNum);
        playerCheck = p1.numCheck;
        userCheck = u1.rangeCheck;
        rangeNumCheck = p1.rangeNumCheck;
        
        if(playerCheck == true && userCheck == true && rangeNumCheck == true) {
        	GuessingGame g1 = new GuessingGame();
        	System.out.println(g1.logic(p1, u1));
        	System.out.println("");
        	System.out.println("Do you want to have another round "
        			+ "press \"n\" to stop");
        	String c = userInput.nextLine();
        	
        	if(c.equals("n")) {
        		continueCheck = true;
        		break;
        	}
        	
        }
        
        if(continueCheck == true) {
        	break;
        } else {
        	playerCheck = false;
        	userCheck = false;
        }
       	
	}
	

  }
}
