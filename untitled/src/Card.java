import java.util.Objects;
import java.util.PrimitiveIterator;

public class Card{
    //card is single card representation
    private Suit suits;
    private SuitValue suitValue;



    public Card(Suit suit, SuitValue suitValue){
       suits= suit;
       this.suitValue=suitValue;
    }

    public Suit getSuits() {
        return suits;
    }


    public SuitValue getSuitValue() {
        return suitValue;
    }


    public int getRank(){return suitValue.getRankNo();}







    //overriding equals method of objects to find equal cards
    public boolean equals(Object otherObj) {
        boolean isEqual = false;
        if (otherObj == this){
            isEqual= true;
        } else if (otherObj==null) {
            isEqual=false;
        } else if (otherObj instanceof Card) {
            Card otherCard = (Card) otherObj;
            isEqual = this.suits.equals(otherCard.suits) && this.suitValue.equals(otherCard.getSuitValue());
        } else {
        }
        return isEqual;
    }













}
