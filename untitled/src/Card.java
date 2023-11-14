import java.util.Objects;
import java.util.PrimitiveIterator;

public class Card{
    //card is single card representation
    private Suit suits;
    private SuitValue suitValue;
   // private  final Card START_CARD;

    public Card(Suit suit, SuitValue suitValue){
       suits= suit;
       this.suitValue=suitValue;
      // START_CARD= new Card(Suit.CLUB,SuitValue.TWO);

    }

    public Suit getSuits() {
        return suits;
    }

    public void setSuits(Suit suits) {
        this.suits = suits;
    }

    public SuitValue getSuitValue() {
        return suitValue;
    }

    public void setSuitValue(SuitValue suitValue) {
        this.suitValue = suitValue;
    }


    //overriding equals method of objects
    public boolean equals(Object otherObj) {

        boolean isEqual = false;

        if (otherObj == this){
            isEqual= true;
        } else if (otherObj==null) {
            isEqual=false;
        } else if (otherObj instanceof Card) {
            Card otherPlayer = (Card) otherObj;
            isEqual = this.suits.equals(otherPlayer.suits) && this.suitValue.equals(otherPlayer.getSuitValue());
        } else {
            isEqual= false;
        }

        return isEqual;
    }





//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//
//        Card otherCard = (Card) obj;
//        return suits == otherCard.suits && suitValue == otherCard.suitValue;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(suits, suitValue);
//    }



}
