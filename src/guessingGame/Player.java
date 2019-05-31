package guessingGame;

public class Player {
 private String firstName;
 private int playerNumber;
 private int rangeNum;
 public Player(String firstame, int playerNumber, int rangeNum) {
	 setFirstName(firstName);
	 setRangeNum(rangeNum);
	 setPlayerNumber(playerNumber);
	 
 }
 public boolean numCheck =false;
 public boolean rangeNumCheck = false;
 public void setFirstName(String firstName) {
	 this.firstName = firstName;
	 
 }
 public String getFirstName() {
	 return this.firstName;
 }


public int getPlayerNumber() {
	return playerNumber;
}

public void setPlayerNumber(int playerNumber) {
	numCheck = false;
	 if(playerNumber >0 && playerNumber <=this.rangeNum) {
		 this.playerNumber = playerNumber;
		 numCheck = true;
		 
	 } else {
		 System.out.println("");
		 System.out.println(this.rangeNum);
		 System.out.println ("Player, your number entered is out of range "
		 		+ "and should be between 0 and less than the range "
		 		+ " entered");
		 numCheck = false;
		 
	 }
}
public int getRangeNum() {
	return rangeNum;
}
public void setRangeNum(int rangeNum) {
	rangeNumCheck = false;
	if(rangeNum >=10) {
		this.rangeNum = rangeNum;
		rangeNumCheck = true;
	} else {
		rangeNumCheck = false;
		System.out.println("");
		System.out.println("wrong entry");
	}
	
}
}
