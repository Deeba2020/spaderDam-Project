import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AIPlayers extends Player {

    AIPlayers (){
        super( );
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
    
    
}