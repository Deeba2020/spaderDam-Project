import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name using only alphabetic");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.println("Name of the active player is " + userName);

        // ... (the rest of your game initialization code)

        // Create the players, dealer, and other necessary game objects
        ActivePlayer a = new ActivePlayer(userName);
        AIPlayer b = new AIPlayer("AIOne");
        AIPlayer c = new AIPlayer("AITwo");
        AIPlayer d = new AIPlayer("AIThree");

        Dealer dealer = new Dealer();
        dealer.addPlayer(a, b, c, d);
        dealer.dealCards(a, b, c, d);

        a.displayHand();
        b.displayHand();
        c.displayHand();
        d.displayHand();

        FirstTrick firstTrick = new FirstTrick(dealer);
        NextTrick nextTrick = new NextTrick(dealer);

        firstTrick.playFirstTrick();


        int currentTrick = 1;
        while (currentTrick <= 13) {

            //nextTrick.updateTrick();
            System.out.println(currentTrick);
            nextTrick.isWinner();
           // nextTrick.nextPlayer();
            nextTrick.playNextTrick();
            //nextTrick.nextPlayer();
            // Check the winner's type and execute findStartCard if needed
//            Player trickWinner = nextTrick.trickWinnerPlayer();
//            if (trickWinner instanceof AIPlayer) {
//                AIPlayer aiWinner = (AIPlayer) trickWinner;
//                aiWinner.findStartCard();
//            } else if (trickWinner instanceof ActivePlayer) {
//                ActivePlayer activeWinner = (ActivePlayer) trickWinner;
//                activeWinner.findStartCard();
//            }

            //nextTrick.nextPlayer();
            currentTrick++;
        }


        // Round.runGame();
//        System.out.println("Enter your name using only alphabetic");
//
//        Scanner input = new Scanner(System.in);
//        String userName = input.nextLine();
//
//        System.out.println("name of the active player is "+ userName);

//        System.out.println("round one");


//        Player a = new ActivePlayer(userName);
//        Player b = new AIPlayer("AIOne");
//        Player c = new AIPlayer("AITwo");
//        Player d = new AIPlayer("AIThree");

//        Dealer dealer = new Dealer();
//
//        dealer.addPlayer(a,b,c,d);
//
//        dealer.dealCards(a,b,c,d);
//
//
//        a.displayHand();
//        b.displayHand();
//        c.displayHand();
//        d.displayHand();
//
//
//
//        FirstTrick firstTrick = new FirstTrick(dealer);
//
//        firstTrick.playFirstTrick();
//
//        dealer.displayCardPlayerMapHand();


       // dealer.trickWinner();


//        firstTrick.isWinner();
        //dealer.returnWinner();

//        a.trickPileList();
//
//
//        firstTrick.isHeartBroken();
//
//        Trick trick = new Trick(dealer);
//        trick.trickWinner();
//
//        NextTrick nextTrick = new NextTrick(dealer);
//        nextTrick.isWinner();

       // System.out.println("max player name issss"+Trick.getMaxPlayerName());

//        trick.playerName();
//
//        nextTrick.playNextTrick();
//
//        nextTrick.nextPlayer();


//        dealer.displayCardPlayerMapHand();
//        nextTrick.isWinner();
//        a.topTrickPileCard();
//        nextTrick.isHeartBroken();
//        trick.trickWinner();


















    }
}






