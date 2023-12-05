import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AIPlayers extends Player {
  

    AIPlayers (Trick trick){
        super(trick );
        super.type ="AI";
        
    }
 
    Random rand = new Random();
    

public ArrayList<Card> getPlayerHand(){
    return playerHand;

}


    public Card pickCard(){
      int min=0;
      int max=playerHand.size()-1;
     
        int cardIndex= (int)Math.floor(Math.random() * (max - min + 1) + min);
        
        Card myCard = playerHand.get(cardIndex);
        
        return myCard;
    
    
    
    }

   
    
}