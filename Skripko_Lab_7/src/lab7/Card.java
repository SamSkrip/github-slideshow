package lab7;

public class Card {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	private String player;
	private int year;
	
	public Card(String player, int year) {
		setDetails(player, year);
	}
	private void setDetails(String player, int year) {
		this.player=player;
		this.year=year;
	}
	public String getPlayer() {
		return player;
	}
	public int getYear() {
		return year;
	}
	public String getDetails() {
		return player + " (" + year + ")";
	}
}
