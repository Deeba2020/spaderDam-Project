import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
public class Player {

   public String name;
   public String trickWinnersName;
   public int score;
 
   // private  Card cards []= new Card[13];
    private ArrayList<Card> cards = new ArrayList<>();
   // private ArrayList<TrickWinner> trickCards= new ArrayList<TrickWinner>();
    private ArrayList<CollectedCards> winnerCollection=new ArrayList<>();
    public Card card;
    public ArrayList<Card> playerHand = new ArrayList<>();
    

   // private ArrayList<Integer> scores;
    
    
    Random rand = new Random();
    

public ArrayList<Card> getPlayerHand(){
    return playerHand;

}


  public String getName() {
       return name;
  }

   public void setName(String name) {
       this.name = name;
  }

    //public ArrayList<Card> getCards() {
        //return cards;
   // }


    public void displayHand() {
        System.out.println( " name   "+ " has following cards: ");
        for (Card currentCard : cards) {
            System.out.println(currentCard.getSuitValue().getSuitChar() + " of " + currentCard.getSuits().getUnicode());
        }
    }

public ArrayList getWinnerCollectTrick(){
    return winnerCollection;

}
   /*  public void addToPile(Card card){
        trickCards.add(new TrickWinner(name, card));
        System.out.println("player "+ name + " " + card.getSuitValue()+" of "+  card.getSuits()+" added");
        
        //displayMiddle();
        }
 */
public Card pickCard(){
    int cardIndex=rand.nextInt(playerHand.size());
    
 Card myCard = playerHand.get(cardIndex);
 myCard.printCard();
 playerHand.remove(cardIndex);
 return myCard;



}

/* public void whoWonTrick(){
     
    int rankValueTrick=-1;
    Card leadingCard=new Card(Suit.CLUB, SuitValue.TWO);
     Card winnerCard=new Card(Suit.CLUB, SuitValue.TWO);
    
    for(TrickWinner trick: trickCards){
       
        if(trick.getCard().getSuits()==leadingCard.getSuits()){
           if(trick.getCard().getSuitValue().getRankValue() > rankValueTrick){
            rankValueTrick=trick.getCard().getSuitValue().getRankValue();
            winnerCard=trick.getCard();
            trickWinnersName=trick.getName();
        }
}
  
        } 
        System.out.println("Winner of the trick is "+ trickWinnersName + " " + winnerCard.getSuits() + " of " + winnerCard.getSuitValue()); 
       
}  */
/* public void WinnerCollectTrick(){
    if(this.trickWinnersName==this.name){
            for(TrickWinner tricks: trickCards){
            WinnerCollectTrick.add(new TrickWinner(name,tricks.getCard()));
           // trickCards.remove(tricks);
        }
        } 
        
        for(TrickWinner cards: WinnerCollectTrick){
System.out.println("player "+ cards.getName() + " has all these cards  "+cards.getCard().getSuitValue()+ " of " + cards.getCard().getSuits());
}
} */


 public ArrayList<CollectedCards> winnerCollectTrick( CollectedCards trick){
              winnerCollection.add(new CollectedCards(trick.getName(),trick.getCard()));
              return winnerCollection;
            
             // trickCards.remove(tricks) 
  
  }

  public void desplayTrickWon(){
    for(CollectedCards card: winnerCollection){
        System.out.println(card.getName()+ " got " + card.getCard().getSuitValue() + "  of "+  card.getCard().getSuits());

    }
  }
  public  void setScore(int scoreValue){

    score= score+scoreValue;
  }

  public int getScore(){
    return score;
  }


  public void displayerPlayerHand(){
    for (Card card : playerHand) {
        System.out.println("Player "+ name + " has " +  card.getSuitValue().getSuitChar()+" of "+card.getSuits());
    }
}

// check wheather the player has the leading suit
boolean hasSuitInHand=false;
public  boolean hasSuit(Suit suit) {
    
    for (Card card : playerHand) {
        if (card.getSuits() == suit) {
            hasSuitInHand=true;
        }
    }
    return hasSuitInHand;
}

  
    
    
    



    

    //need to remove unnecessary prints in last stage
    public Card  startPlay() {
       return this.pickCard();
       
        
        

      /*   char smileyFace = '\u263A';
        Card startCard = new Card(Suit.CLUB,SuitValue.TWO);

        System.out.println( "  player.getName() "+" current hand size is: " + player.getCards().size());
        System.out.println("Looking for: " + startCard.getSuitValue()+" of "+ startCard.getSuits().getUnicode());

        for (int i = 0; i<13 ; i++) {

            if (player.getCards().isEmpty()) {
                System.out.println("no cards in hand to play with");
            }

            else if (player.getCards().contains(startCard)){

                System.out.println("the player "+  "player.getName()" + " has the card "+" " +startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode()+" and can start the game "+smileyFace);
                player.addToPile(startCard);
                player.getCards().remove(startCard);
                System.out.println("Removed card in player's hand: " + startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode());
                System.out.println(  " player.getName()"     + "'s hand after removing TWO of CLUB is: ");
                player.displayHand();

            }

            }
 */
    }



}










