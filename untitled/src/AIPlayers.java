import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AIPlayers extends Player {

    AIPlayers (Trick trick){
        super(trick );
        super.type ="AI";
        
    }


 

   // private ArrayList<Integer> scores;
    
    
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    

public ArrayList<Card> getPlayerHand(){
    return playerHand;

}


    public Card pickCard(){
        int cardIndex=rand.nextInt(playerHand.size());
        
        Card myCard = playerHand.get(cardIndex);
        myCard.printCard();
       playerHand.remove(cardIndex);
        return myCard;
    
    
    
    }

    public void continuePlay() {

        Card pickedCard=pickCard();
        
        System.out.println( "player " + name + " added " + pickedCard.getSuitValue() + " of " + pickedCard.getSuits());

        if(trick.trickPileCards.size()==0 && pickedCard.getSuits()==Suit.HEART){
            if (!trick.isHeartBroken()){
              System.out.println("Heart is not broken, use another card!");
            pickCard();
            }
            else {
              trick.addToPile(name, pickedCard);
              leadingCard=pickedCard;
              System.out.println("The leading card is :" + leadingCard.getSuitValue() + " of " + leadingCard.getSuits());
            }
            
      
          }else trick.addToPile(name, pickedCard);
       
    
            }
    
    
}