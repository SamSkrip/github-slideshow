package lab7;
import java.util.ArrayList;
public class CardCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String collectorName;
	private ArrayList<Card> cards;
	
	public CardCollection( String collectorName) {
		cards = new ArrayList<Card>();
		this.collectorName=collectorName;
	}
	//@return the collectors name
	public String getCollectorName() {
		return collectorName;
	}
	//@return list of cards on one line
	public String getCards() {
		String list="";
		for(int i=0 ; i<cards.size(); i++) {
			list = list + cards.get(i).getDetails() + ",";
		}
		return list;
	}
	//@return the number of cards in the collection
	public int getNumberOfCards() {
		return cards.size();
	}
	//@return true if 
	//@param  index at given parameter is valid
	private boolean indexValid(int index) {
		boolean x=true;
		if(index<0) {
			System.out.println("non-negative index please:" + index );
			x=false;
		}
		else if( index >= cards.size()) {
			System.out.println("Index too large:"+ index);
			x=false;
		}
		return x;
	}
	//@param adds the given card to the collection
	public void addCard(Card card) {
		if(card!=null) {
			cards.add(card);
			System.out.println("Added card" + card.getDetails());
		}
		else System.out.println("Invalid: card cannot be added");
	}
	//@param removes the card at the given index
	public void removeCard(int index) {
		if(indexValid(index)==true) {
			System.out.println("Removed card: " + cards.get(index).getDetails());
			cards.remove(index);
		}
		else System.out.println("No card to remove at index:" + index);
	}
	//@param prints the card details of card at given index
	public void listCard(int index) {
		
		if(indexValid(index)==true) {
			System.out.println("Card" + index + cards.get(index).getDetails());
		}
		else System.out.println("Invalid index:" + index);
	}
	//prints all the cards in a vertical list
	public void listAllCards() {
		if(cards.isEmpty()== true ) {
			System.out.println("There are NO cards to print");
		}
		else {
			System.out.println("Card list:");
			for(Card card:cards) {
				System.out.println(card.getDetails());
			}
		}
	}
	//@param finds if a card matches the same name as the given player and prints
	//@return true if a player is found
	public void listByPlayer(String player) {
		boolean found =false;
		for(Card card: cards) {
			if(card.getPlayer().compareToIgnoreCase(player)== 0) {
				System.out.println(card.getDetails());
				found=true;
			}
		}
		if(found==false) System.out.println("No cards found for player:" + player);
	}
	//@param prints the player details if they have the given year
	//@return true if a player is found
	public void listByYear(int year) {
		boolean found =false;
		for(Card card: cards) {
			if(card.getYear()== year) {
				System.out.println(card.getDetails());
				found=true;
			}
		}
		if(found==false) System.out.println("No cards found for year:" + year);
	}
	//@param if a player contains the given search string
	//@return true if such player found
	public int findFirstPlayer(String searchString) {
		int index=0;
		boolean searching=true;
		while(searching==true && index<cards.size()) {
			if(cards.get(index).getPlayer().toLowerCase().contains(searchString.toLowerCase())) {
				searching=false;
			}
			else index++;
		}
		if(searching==true) {
			System.out.println("No player card for: " + searchString );
			return -1;
		}
		else {
			System.out.println("Player card for: " + searchString + " at index " + index );
			return index;
		}
		
	}
}
