package guessingGame;

public class User {
	private String firstName;
	private String range;
	public boolean rangeCheck =false;
 public User(String userName, String range) {
	 setFirstName(userName);
	 setRange(range);
 }
 
 public void setFirstName(String firstName) {
	 this.firstName = firstName;
	 
 }
 public String getFirstName() {
	 return this.firstName;
 }
 
 public void setRange(String range) {
	 rangeCheck = false;
	 range = range.toUpperCase();
	 System.out.println(range);
	 if(range.equals("HIGHER") || range.equals("LOWER")) {
		 this.range = range;
		 rangeCheck = true;
	 } else {
		 rangeCheck = false;
		 System.out.println("User, Wrong entry for range");
	 }
	
 }

 public String getRange() {
	 return this.range;
 }
}
