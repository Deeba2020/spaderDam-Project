import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public abstract class Trick {

    ////heartBroken() should be implemented here

    //following should be implemented inorder to make the basic game the place/class of methods needs to be decided
    //countPenaltyScore() which is penalty score per user per trick(1st trick, 2n trick.......)
    //totalPenaltyScore() which is final penalty score per user after 13 tricks
    //winner() per round after 13 tricks
    //winner() final winner when one of players reaches 100 points and also game should end
    //suit() which suit to choose to play with need to be implemented for AI and active
    //winPileCard() method for the players to win the pile card
    //condition in the main to allow user to only use alphabet for the name
    //GameEnd() when total score of one of user reaches 100 points

    private final int MAX_TRICK = 13;
    private int trickNo = 1;
    private ArrayList<Player>players;

    private final Card START_CARD;
    private final char SMILEY_FACE = '\u263A';
   // Queue<Card> pileCards;
    Dealer dealer;
   // Player player;



    public Trick (Dealer dealer){
        START_CARD =new Card(Suit.CLUB,SuitValue.TWO);
        players=this.getPlayers();
      //  pileCards = new LinkedList<>();
        this.dealer=dealer;
       // player = dealer.getPlayers().get(0);

    }

    public void isHeartBroken(){

        System.out.println("check heart");


    }


////showing all list of trick pile
//        public Queue<Card> trickPileHand() {
//        System.out.println("Trick pile has following cards: ");
//        for (Card currentCard : pileCards) {
//            System.out.println(currentCard.getSuitValue().getUnicode() + " of " + currentCard.getSuits().getUnicode());
//        }
//        return pileCards;
//    }


//to show top card on the trick pile
//    public void topTrickPile(){
//        System.out.println(pileCards.peek());
//       // return pileCards.peek();
//
//
//    }

    public int getMAX_TRICK() {
        return MAX_TRICK;
    }

    public int getTrickNo() {
        return trickNo;
    }

    public Card getSTART_CARD() {
        return START_CARD;
    }

    public char getSMILEY_FACE() {
        return SMILEY_FACE;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }



    public void nextPlayer() {}

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
