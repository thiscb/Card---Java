package Card;

// Class Card with data structure having a suit and a value for a card
// It contains methods to control these private variables
public class Card {
    private String suit;
    private String value;
    // Getter method for private variable suit
    public String getSuit() {
        return suit;
    }

    // Setter method for private variable suit
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Getter method for private variable value
    public String getValue() {
        return value;
    }

    // Setter method for private variable value
    public void setValue(String value) {
        this.value = value;
    }

    // Parameterised Constructor of the class
    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    // Method toString to print a card with his suit name and value
    public String toString(){
        return "\n Card is "+value+" of "+suit+".";
    }
}