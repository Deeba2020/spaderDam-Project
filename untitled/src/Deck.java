import java.util.ArrayList;
import java.util.Collections;

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



    //update this one to be the one from Samra
    public ArrayList<Card> createDeck(){
         cards.clear();
        for (int i = 0; i < Suit.values().length; i++){
            for(int j = 0; j < SuitValue.values().length; j++){
                cards.add(new Card(Suit.values()[i], SuitValue.values()[j]));
            }
        }
        return cards;
    }



    public void displayDeck() {
        for (Card card : cards) {
            System.out.println(card.getSuitValue()+" of "+card.getSuits().getUnicode());
        }
    }

    public void shuffleDeck() {
        System.out.println("list of shuffled cards are");
        Collections.shuffle(cards);
        displayDeck();
    }

//    @Override
//    public String toString() {
//        return getSuitValue() + " of " + getSuit();}

}
