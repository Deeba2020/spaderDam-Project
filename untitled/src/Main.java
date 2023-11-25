import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
  public ArrayList<CollectedCards> trickCards= new ArrayList<>();
   public String name;
   public String trickWinnersName;
  public Card cards;

 public void addToPile( String name, Card card){
      trickCards.add(new CollectedCards(name, card));
      //displayMiddle();
      }
      public String whoWonTrick(){
     
        int rankValueTrick=-1;
        Card leadingCard=new Card(Suit.CLUB, SuitValue.TWO);
         Card winnerCard=new Card(Suit.CLUB, SuitValue.TWO);
        
        for(CollectedCards trick: trickCards){
           
            if(trick.getCard().getSuits()==leadingCard.getSuits()){
               if(trick.getCard().getSuitValue().getRankValue() > rankValueTrick){
                rankValueTrick=trick.getCard().getSuitValue().getRankValue();
                winnerCard=trick.getCard();
            
                trickWinnersName=trick.getName();
            }
    } 
            } 
            System.out.println("Winner of the trick is "+ trickWinnersName + " " + winnerCard.getSuits() + " of " + winnerCard.getSuitValue()); 
         
         
      return trickWinnersName;
       
    } 
    public void emptyPileTrick(){
      for (int i=0; i<trickCards.size();i++){
        trickCards.remove(i);
       }
  }

  public void updateScore(Player player){
    for(CollectedCards trickCard: trickCards){
    
        if(trickCard.getCard().getSuits()== Suit.HEART){
            player.setScore(1);
        }
        if(trickCard.getCard().getSuits()== Suit.SPADE && trickCard.getCard().getSuitValue()== SuitValue.QUEEN ){
            player.setScore(13);
        }

    }
   
    
    trickCards.clear();
 /*    ArrayList currentList=player.getWinnerCollectTrick();
    for(TrickWinner list: currentList){
System.out.println(list.getName()+ list.getCard().getSuits()+ list.getCard().getSuitValue());
    } */
    
  
  }
 
  
  
  public static void main(String[] args) throws InterruptedException {
    //System.out.println("Enter your name using only alphabetic");
    Main main=new Main();
    Scanner input = new Scanner(System.in);
    

    //System.out.println("name of the active player is " + userName);

    //        System.out.println("round one");

    /*  ActivePlayer a = new ActivePlayer(userName);
        AIThree b = new AIThree();
        AITwo c = new AITwo();
        AIOne d = new AIOne();

        Dealer dealer = new Dealer();
        dealer.addPlayer(a);
        dealer.addPlayer(b);
        dealer.addPlayer(c);
        dealer.addPlayer(d);

        dealer.dealCards(a,b,c,d);

        a.displayHand();
        b.displayHand();
        c.displayHand();
        d.displayHand();

        a.startPlay(a);
        b.startPlay(b);
        c.startPlay(c);
        d.startPlay(d); */
    // Samra change
 

    Player[] players = new Player[4];
     Dealer dealer = new Dealer();
     Trick trick= new Trick();
    for (int i = 0; i < 4; i++) {
      players[i] = new Player();
      System.out.println("Enter your name: ");
      String userName = input.nextLine();
      players[i].name=userName;
    }
     
       dealer.dealCards(players);

     
       


    
/* for(int playerIndex=0; playerIndex < players.length; playerIndex++ ){
    ArrayList <Card> playersHand= players[playerIndex].fillCards();
    for(Card eachCard: playersHand){
        if(eachCard.getSuits()=="CLUB" )

    }
} */

for (int trickNumber=0; trickNumber<13; trickNumber++ ){
    
    for (int playerIndex=0; playerIndex < players.length; playerIndex++){
       Card pickeCard= players[playerIndex].startPlay();
       if(trick.isValidSuit(main.trickCards, pickeCard)){
       main.addToPile(players[playerIndex].name,pickeCard);
       System.out.println("player " + players[playerIndex].name + " added " + pickeCard.getSuitValue()+" of "+  pickeCard.getSuits());
       
       } else{
       pickeCard = players[playerIndex].startPlay();
       main.addToPile(players[playerIndex].name,pickeCard);
       System.out.println("player " + players[playerIndex].name + " addedededed " + pickeCard.getSuitValue()+" of "+  pickeCard.getSuits());
       }
    }
players[1].displayerPlayerHand();
   String winnersName=main.whoWonTrick() ;



   for(int player=0;player < players.length; player++){
    
      if(winnersName==players[player].name){
     main.updateScore(players[player]);
    
     System.out.println(players[player].name + " has scored " + players[player].getScore());
}
      
}


TimeUnit.SECONDS.sleep(10);


    
}
}
  }

