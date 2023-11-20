import java.util.List;

public class TrickRule {

 private Deck deck;
 private Card card;
 private Player activePlayer;


  public TrickRule(Player activePlayer){
      deck = new Deck(Suit.HEART,SuitValue.TWO);
      this.activePlayer=activePlayer;
  }


//    public void checkSuit() {
//        Suit club = Suit.CLUB;
//        Suit heart = Suit.HEART;
//        Suit diamond = Suit.DIAMOND;
//        Suit spade = Suit.SPADE;
//
//        if (activePlayer.getActiveCard().equals(club)){
//            System.out.println("gottttt clubbbb");
//
//        }
//
//
//    }


//    public void checkSuit() {
//        Suit club = Suit.CLUB;
//        System.out.println("outside loop");
//        for (Card card : activePlayer.getActiveCard()) {
//            System.out.println("inside loop");
//            if (card.getSuits() == club) {
//                System.out.println("Found a club in the active player's hand");
//            }
//        }
//    }

    public void checkSuit() {
        Suit club = Suit.CLUB;

        List<Card> activeCards = activePlayer.getCards();
        if (activeCards.isEmpty()) {
            System.out.println("Active player has no cards.");
            return;
        }

        for (Card card : activeCards) {
            Suit cardSuit = card.getSuits();
            if (cardSuit == club) {
                System.out.println("Found a club in the active player's hand");
            } else {
                System.out.println("This card is not a club.");
            }
        }
    }


















}
