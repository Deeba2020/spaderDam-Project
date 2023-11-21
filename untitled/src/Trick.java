import java.util.ArrayList;

public class Trick {

    ////heartBroken() should be implemented here

    //following should be implemented inorder to make the basic game the place/class of methods needs to be decided
    //countPenaltyScore() which is penalty score per user per trick(1st trick, 2n trick.......)
    //totalPenaltyScore() which is final penalty score per user after 13 tricks
    //winner() after 13 tricks
    //suit() which suit to choose to play with need to be implemented for AI and active
    //winPileCard() method for the players to win the pile card
    //condition in the main to allow user to only use alphabet for the name

    private final int MAX_TRICK = 13;
    private int trickNo = 0;
    private ArrayList<Player>players;

    private final Card START_CARD;
    private final char SMILEY_FACE = '\u263A';

    public Trick (ArrayList<Player>players){
        START_CARD =new Card(Suit.CLUB,SuitValue.TWO);
        this.players=players;
    }

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
