import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AIPlayers extends Player {

    private String type = "Human";

    AIPlayers (Trick trick){
        super(trick );
        type ="AI";
        
    }


 

   // private ArrayList<Integer> scores;
    
    
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    

//public ArrayList<Card> getPlayerHand(){
//    return getPlayerHand();
//
//}


    public Card pickCard(){
        int cardIndex=rand.nextInt(getPlayerHand().size());
        
        Card myCard = getPlayerHand().get(cardIndex);
        myCard.printCard();
       getPlayerHand().remove(cardIndex);
        return myCard;
    
    
    
    }

    public void continuePlay() {

        Card pickedCard=pickCard();
        
        System.out.println( "player " + getName() + " added " + pickedCard.getSuitValue() + " of " + pickedCard.getSuits());

        if(getTrick().trickPileCards.size()==0 && pickedCard.getSuits()==Suit.HEART){
            if (!getTrick().isHeartBroken()){
              System.out.println("Heart is not broken, use another card!");
            pickCard();
            }
            else {
              getTrick().addToPile(getName(), pickedCard);
              leadingCard=pickedCard;
              System.out.println("The leading card is :" + leadingCard.getSuitValue() + " of " + leadingCard.getSuits());
            }
            
      
          }else getTrick().addToPile(getName(), pickedCard);
       
    
            }
    
    
}