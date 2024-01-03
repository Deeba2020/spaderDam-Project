import java.util.ArrayList;
import java.util.Scanner;

public class Round {

    public static void runGame() {
        System.out.println("Enter your name using only alphabetic");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.println("Name of the active player is " + userName);

        // ... (the rest of your game initialization code)

        // Create the players, dealer, and other necessary game objects
        Player a = new ActivePlayer(userName);
        Player b = new AIPlayer("AIOne");
        Player c = new AIPlayer("AITwo");
        Player d = new AIPlayer("AIThree");

        Dealer dealer = new Dealer();
        dealer.addPlayer(a, b, c, d);
        dealer.dealCards(a, b, c, d);

        a.displayHand();
        b.displayHand();
        c.displayHand();
        d.displayHand();



//        do { NextTrick trick = new NextTrick(); trick.executeTrick(); }
//        while trick.getNumber() <= 13;

        FirstTrick firstTrick = new FirstTrick(dealer);
        NextTrick nextTrick = new NextTrick(dealer);
        firstTrick.playFirstTrick();
        nextTrick.isWinner();

        do{
//            nextTrick.findPreviousWinner();
            nextTrick.updateTrick();
            nextTrick.isWinner();
            nextTrick.playNextTrick();
            nextTrick.isWinner();
//
           // nextTrick.nextPlayer();
            //nextTrick.findPreviousWinner();
           // nextTrick.isWinner();
        } while (firstTrick.getTrickNo()<=13);




//    private int roundNum;
//    private final int MAX_SCORE = 100;
//    private int firstRound = 1;
//    private ArrayList<Player> players;
//    private Trick tricks;
//
//    public Round(int roundNum, Player player, Trick tricks) {
//        this.roundNum = roundNum;
//        this.players = null;
//        this.tricks = null;
//
//    }


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
}





