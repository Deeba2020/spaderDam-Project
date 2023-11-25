import java.util.*;

public class Trick {

    
    private List<CollectedCards> trickPile= new ArrayList<>(); 
    private Suit leadingSuit;
    private Card card;


    
/*     public Trick(){

    }
public void playTrick(Player player, Card card){
    // Defined the leading suit
    if (trickPile.size()==0){
        leadingSuit=card.getSuits();
        
        }
    // check if it is a valid suit and added to the tick
     if(isValidSuit(trickPile, card)) {
     //   trickPile.add(card);

       }
       else
       System.out.println("Please follow the suit!");

} */

Player players=new Player();
boolean validSuit= true;
public boolean isValidSuit(List<CollectedCards> trickPile, Card card){
    if (trickPile.size()==0) {
        if(card.getSuits()== Suit.HEART){
           if(isHeartBroken())
          System.out.println("Heart is not broken, use another card!");
           validSuit=false;
        }
           else {
           validSuit=true;
           }
           
        } 
        else if (players.hasSuit(card.getSuits())){
                validSuit = false;
            } 
            else {
                // If the player doesn't have cards of the leading suit, any card is valid
                validSuit =true;
            }
        return validSuit;
    }
    public boolean isHeartBroken(){
        for(CollectedCards suit: trickPile){
            if(suit.getCard().getSuits()==Suit.HEART){
                return true;
            }
             }
             return false;
            }


    // ... (other methods)











//    public boolean isTrickEnded (Player player) {
//        boolean trickEnded;
//
//        if (trick.getTrickNo() == trick.getMAX_TRICK()) {
//            for ()
//
//        }
//    }


//    public boolean isTrickEnded (Player player){
//        boolean trickEnded ;
//
//        if (trickNo == MAX_TRICK){
//
//
//
//        }
//        if (player.getScore()==MAX_SCORE || player.getScore()>MAX_SCORE){
//            System.out.println("game ended and"+ player+"is the looser");
//            roundEnded = true;
//        }
//        else {
//            roundEnded = false;
//        }
//
//        return trickEnded;
//    }

}
