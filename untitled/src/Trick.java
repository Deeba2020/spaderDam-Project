import java.util.ArrayList;

public class Trick {

  public ArrayList<CollectedCards> trickPileCards = new ArrayList<>();
  public String name;
  public String trickWinnersName;
  public Card cards;
  public boolean isHeartBroken=false;
  public Suit leadingSuit = null;
  public Player player;
  protected ArrayList<CollectedCards> winnerCollection = new ArrayList<>();



  public void addToPile(String name, Card card) {
    if(leadingSuit==null)
     leadingSuit = card.getSuits();

    if(card.getSuits()==Suit.HEART)
     this.isHeartBroken = true;
     
    trickPileCards.add(new CollectedCards(name, card));
    
  }

  public String whoWonTrick() {
    int rankValueTrick = -1;
    
    Card winnerCard = new Card(Suit.CLUB, SuitValue.TWO);

    for (CollectedCards trick : trickPileCards) {
      if (trick.getCard().getSuits() == leadingSuit) {
        if (trick.getCard().getSuitValue().getRankValue() > rankValueTrick) {
          rankValueTrick = trick.getCard().getSuitValue().getRankValue();
          winnerCard = trick.getCard();

          trickWinnersName = trick.getName();
        }
      }
    }
    System.out.println("Winner of the trick is " + trickWinnersName + " " + winnerCard.getSuits() + " of " + winnerCard.getSuitValue());

    return trickWinnersName;
  }
  public ArrayList<CollectedCards> winnerCollectTrick() {
    for(CollectedCards trickPile: trickPileCards){
    winnerCollection.add(new CollectedCards(trickPile.getName(), trickPile.getCard()));
    }
    return winnerCollection;
    

  }

  public void desplayTrickWon() {
    for (CollectedCards card : winnerCollection) {
      System.out.println(
        card.getName() +
        " got " +
        card.getCard().getSuitValue()+
        "  of " +
        card.getCard().getSuits().getUnicode()
      );
    }
  }
 
 

  public void emptyPileTrick() {
//    for (int i = 0; i < trickPileCards.size(); i++) {
//      trickPileCards.remove(i);
      trickPileCards.clear();
    }
//  }

  boolean heartSuit=false;
  public boolean isHeartBroken(){
    for(CollectedCards card: trickPileCards){
        if(card.getCard().getSuits()==Suit.HEART){
            heartSuit=true;
        }
         }
         return heartSuit;
        }
       
      

  public void updateScore(Player player) {
    for (CollectedCards trickCard : trickPileCards) {
      if (trickCard.getCard().getSuits() == Suit.HEART) {
        player.setScore(1);
      }
      if ( trickCard.getCard().getSuits() == Suit.SPADE && trickCard.getCard().getSuitValue() == SuitValue.QUEEN) {
        player.setScore(13);
      }
    }
    trickPileCards.clear();
  }

}
   

