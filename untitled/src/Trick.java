import java.util.*;

public class Trick {

    private static final Suit S = null;
    private final int MAX_TRICK = 13;
    private int trickNo = 0;
    private List<Card> playedTrickCards= new ArrayList<>(); 
    private Suit leadingSuit;
    private Card card;
    private Dealer dealer;

    
    public Trick(){

    }
public void playTrick(Player player, Card card){
    // Defined the leading suit
    if (playedTrickCards.size()==0){
        leadingSuit=card.getSuits();
        
        }
    // check if it is a valid suit and added to the tick
     if(isValidSuit(player, leadingSuit)) {
        playedTrickCards.add(card);

       }
       else
       System.out.println("Please follow the suit!");
}

public boolean isValidSuit(Player player, Suit leadingSuit){
    if (playedTrickCards.size()==0) {
            // The first card played is always valid 
            // ? check heart is broken
            return true;
        } 
        else if (dealer.hasSuit(leadingSuit)){
                return card.getSuits() == leadingSuit;
            } 
            else {
                // If the player doesn't have cards of the leading suit, any card is valid
                return true;
            }
        
    }
    public boolean isHeartBroken(){
        return true;

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


    public int getMAX_TRICK() {
        return MAX_TRICK;
    }

    public int getTrickNo() {
        return trickNo;
    }
}
