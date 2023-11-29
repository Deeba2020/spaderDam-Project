import java.util.*;

public class FollowSuit {

    
    

Player players=new Player();

public boolean isValidSuit(ArrayList<CollectedCards> trickPile, Card card){
    if (trickPile.size()==0) {
        if(card.getSuits()== Suit.HEART){
           if(isHeartBroken(trickPile))
          System.out.println("Heart is not broken, use another card!");
           return false;
        }
           
        } 
        else if (trickPile.size()!=0 && players.hasSuit(card.getSuits())){
                return false;
            } 
            
        return true;
    }
    
    public boolean isHeartBroken(ArrayList<CollectedCards> trickPile){
        for(CollectedCards card: trickPile){
            if(card.getCard().getSuits()==Suit.HEART){
                return true;
            }
             }
             return false;
            }












}
