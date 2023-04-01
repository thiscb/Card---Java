package Card;

// Importing package and class for Scanner
import java.util.Scanner;

// Main Class with switch case and menu
public class Main {

    // Main method
    public static void main(String[] args) {
        // Object deck of class Deck
        Deck deck = new Deck();

        // Printing Menu
        System.out.println("1. createDeck");
        System.out.println("2. printDeck");
        System.out.println("3. printCard");
        System.out.println("4. sameCard");
        System.out.println("5. compareCard");
        System.out.println("6. findCard");
        System.out.println("7. dealCard");
        System.out.println("8. shuffleCard");

        // Taking user choice for menu as input
        // Creating Scanner object scan
        Scanner scan = new Scanner(System.in);
        int choice = Integer.parseInt(scan.next());

        // Switch case for menu
        switch(choice){
            // Case 1 to create deck
            case 1:
                System.out.println("Done");
                break;
            case 2:
                // Case 2 to print deck
                deck.printDeck();
                break;
            case 3:
                // Case 3 to print top card
                deck.printCard();
                break;
            case 4:
                // Case 4 to randomly select a card and find its suit
                deck.sameCard();
                break;
            case 5:
                // Case 5 to compare values of two randomly selected cards
                deck.compareCard();
                break;
            case 6:
                // Case 6 to find card using suit and value
                deck.findCard();
                break;
            case 7:
                // Case 7 to print 5 random cards from the deck
                deck.dealCards();
                break;
            case 8:
                // Case 8 to shuffle the cards
                deck.shuffle();
                break;
        }

    }
}