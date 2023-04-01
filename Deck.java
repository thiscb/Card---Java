package Card;

// Importing all the necessary packages and modules
import java.util.ArrayList;
import java.util.*;

// Class Deck containing all the methods for deck and cards
public class Deck {
    // ArrayList Card which will store cards object
    ArrayList<Card> card= new ArrayList<Card>();

    // All the possible suit values stored in suit variable
    String[] suit = {"Spade", "Club", "Diamond", "Heart"};
    // All the card values stores in value variable
    String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q"};
    // Method to create whole deck
    public void createDeck(){
        // Enhanced for loop to combine all the suit with card values
        for (String s : suit) {
            for (String item : value) {
                this.card.add(new Card(s, item));
            }
        }
    }

    // To print whole deck
    public void printDeck(){
        System.out.println(this.card);
    }

    // To print first card of the deck
    public void printCard(){
        System.out.println(this.card.get(0));
    }

    // Randomly selecting a card and finding its suit
    public void sameCard(){
        int index = (int)(Math.random()*this.card.size());
        Card selectedCard = this.card.get(index);
        System.out.println("This randomly selected card belongs to "+selectedCard.getSuit()+".");
    }

    // Comparing values of two randomly selected cards
    public void compareCard(){
        int index1 = (int)(Math.random()*this.card.size());
        int index2 = (int)(Math.random()*this.card.size());
        Card selectedCard1 = this.card.get(index1);
        Card selectedCard2 = this.card.get(index2);
        if(selectedCard1.getValue() == selectedCard2.getValue()){
            System.out.println("Two randomly generated cards have same rank or value");
        }else{
            System.out.println("Two randomly generated cards have different rank or value");
        }
    }

    // To find card using suit and value
    public void findCard(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter suit: ");
        String suit = scan.nextLine();
        System.out.print("Enter value: ");
        String value = scan.nextLine();

        for(int i=0; i<card.size(); i++){
            Card c = this.card.get(i);
            if(c.getSuit().equals(suit)){
                if(c.getValue().equals(value)){
                    System.out.println(this.card.get(i));
                }
            }
        }
    }

    // Method to print 5 random cards from the deck
    public void dealCards(){
        for(int i=0;i<5;i++){
            int index = (int)(Math.random()*this.card.size());
            System.out.print(card.get(index));
        }
    }

    // TO shuffle the cards
    public void shuffle(){
        Collections.shuffle(this.card);
        printDeck();
    }

    // Constructor with createDeck method
    Deck(){
        this.createDeck();
    }
}