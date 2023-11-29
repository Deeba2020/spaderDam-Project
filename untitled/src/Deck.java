import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Deck  {
      //Deck is collection of cards
     ArrayList<Card> cards;
     Suit suit;
     SuitValue suitValue;


     public Deck(Suit suit,SuitValue suitValue){
         this.suit = suit;
         this.suitValue = suitValue;
         cards = new ArrayList<>();
     }


    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public SuitValue getSuitValue() {
        return suitValue;
    }

    public void setSuitValue(SuitValue suitValue) {
        this.suitValue = suitValue;
    }


    public ArrayList<Card> createDeck(){
         cards.clear();
         for(Suit suit: Suit.values()){
            for (SuitValue rank: SuitValue.values()){
                cards.add(new Card(suit, rank));
            }
         }
      
        return cards;
    }



    public void displayDeck() {
        for (Card card : cards) {
            System.out.println(card.getSuitValue().getSuitChar()+" of "+card.getSuits().getUnicode());
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    
    }
}
