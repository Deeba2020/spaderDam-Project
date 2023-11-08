import java.util.ArrayList;

public class Deck  {

     ArrayList<Card> cards;
     Suit suit;
     SuitValue suitValue;



    public Deck(Suit suit,SuitValue suitValue){
        this.cards= new ArrayList<>();
        this.suit=suit;
        this.suitValue=suitValue;
    }



//     void createDeck() {
//        for (Suit suit : Suit.values()) {
//            for (SuitValue suitValue : SuitValue.values()) {
//                cards.add(new Card(suit, suitValue));
//            }
//        }
//    }


    void createDeck(){
        for (int i = 0; i < Suit.values().length; i++){
            for(int j = 0; j < SuitValue.values().length; j++){
                cards.add(new Card(Suit.values()[i], SuitValue.values()[j]));
            }
        }
    }


    public void displayDeck() {
        for (Card card : cards) {
            System.out.println(card.getSuitValue()+" of "+card.getSuits().getUnicode());
        }
    }


}
