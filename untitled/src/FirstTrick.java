public class FirstTrick extends Trick {
     FirstTrick(){
        super();
    }

    public Card startTrick() {
        Card START_CARD = new Card(Suit.CLUB, SuitValue.TWO);
        Card PickedCard = new Card(Suit.CLUB, SuitValue.TWO);
        if (playerHand.contains(START_CARD)) {
          PickedCard = START_CARD;
        }
    
        return PickedCard;
      }
    
    
}
