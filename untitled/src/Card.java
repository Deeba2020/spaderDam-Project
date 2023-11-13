import java.util.PrimitiveIterator;

public class Card{
    //card is single card representation
    private Suit suits;
    private SuitValue suitValue;
   // private  final Card START_CARD;

    public Card(Suit suit, SuitValue suitValue){
       suits=suit;
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

//    public Card getSTART_CARD() {
//        return START_CARD;
//    }
}
