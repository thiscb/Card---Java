Welcome to the fourth assignment's Card directory! You will find three files here:

Main.java
Card.java
Deck.java
In Operations.java, you can access the Operations class with the following methods:

createDeck(): This method combines all the suits and values to create a complete deck of cards.
printDeck(): This method prints the entire deck of cards.
printCard(): This method prints the first card of the deck.
sameCard(): This method randomly selects a card and finds its suit.
compareCard(): This method randomly selects two cards, compares their values, and returns a string indicating whether they have the same or different values.
findCard(): This method allows you to find a card by specifying its suit and value.
dealCards(): This method prints five random cards from the deck.
shuffle(): This method shuffles the deck of cards and prints them.
In Card.java, you will find the InputUser class, which includes the following methods:

Getter and setter methods for the private variables suit and value stored in a single Card object.
A parameterized constructor with variables for suit and value.
Finally, in Main.java, you can access the Main class with the following methods:

A switch case that allows the user to select an operation by entering a character.
A main method that contains a menu with options corresponding to the methods in the Deck.java class.
The main method catches the returned values from the different methods in the Operations class and displays them to the user.
