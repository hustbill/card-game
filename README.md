# card-game
Card game  using object-oriented design

In a typical card game, each player gets a hand of cards. The deck is shuffled and cards are dealt one at a time from the deck and added to the players' hands. In some games, cards can be removed from a hand, and new cards can be added. The game is won or lost depending on the value (ace, 2, ..., king) and suit (spades, diamonds, clubs, hearts) of the cards that a player receives.   

If we look for nouns in this description, there are several candidates for objects: *game, player, hand, card, deck, value, and suit*. Of these, the value and the suit of a card are simple values, and they might just be represented as *instance variables* in a *Card* object.  
 
In a complete program, the other five nouns might be represented by classes. But let's work on the ones that are most obviously reusable: card, hand, and deck.

## Deck class
First, we'll design the deck class in detail. When a deck of cards is first created, it contains 52 cards in some standard order. The Deck class will need a constructor to create a new deck. The constructor needs no parameters because any new deck is the same as any other.  

- shuffle()  shuffle a deck  
It will rearrange the 52 cards into a random order. 

- dealCard()  deal a card from a deck  
 This method will get the next card from the deck. This will be a function with a return type of Card, since the caller needs to know what card is being dealt. It should probably be considered an error to try to deal a card from an empty deck, so the deck can throw an exception in that case.   
 
 - cardsLeft()  know how many cards it has left, 
 This method returns the number of cards remaining in the deck.
 

## Hand
- addCard()     add a card to hand
This method needs a parameter of type Card to specify which card is being added. 

- removeCard()  cards be removed from hands  
A parameter is needed to specify which card to be remove.   
 * specify the card itself,  such as "remove the ace of spades"
 *  speicif the card by its position in the hand, such as "remove the third card in the hand"  
 
 So, we'll have two removeCard() instance methods. one with a parameter of type Card specifying the card to be removed and one with a parameter of type int specifying the position of the card in the hand.  
 
 - getCardCount() that returns the number of cards in the hand
 

## Card
A Card object can be constructed knowing the value and the suit of the card  
I've declared the instance variables suit and value to be final, since they are never changed after they are initialized. An instance variable can be declared *final* provided it is either given an initial value in its declaration or is initialized in every constructor in the class. Since all its instance variables are final, a Card is an *immutable object*.    

















##



