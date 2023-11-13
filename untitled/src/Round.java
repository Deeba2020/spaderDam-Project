import java.util.ArrayList;

public class Round {
    private int roundNum;
    private final int MAX_SCORE = 100;
    private int firstRound = 1;
    private ArrayList<Player> players;
    private ArrayList<Trick> tricks;

    public Round(int roundNum, Player player, Trick tricks) {
        this.roundNum = roundNum;
        this.players = null;
        this.tricks = null;

    }


//    public boolean isRoundEnded(Player player) {
//        boolean roundEnded;
//        if (player.getScore() >= MAX_SCORE) {
//            System.out.println("game ended and" + player + "is the looser");
//            roundEnded = true;
//        } else {
//            roundEnded = false;
//        }
//
//        return roundEnded;
//    }


//    public boolean isTrickEnded(Player player) {
//        boolean trickEnded;
//
//        if (player.getScore() == player) {
//
//        }


//        public int getRoundNum () {
//            return roundNum;
//        }
//
//
//        public void setRoundNum ( int roundNum){
//            this.roundNum = roundNum;
//
//        }

//    }

    }





