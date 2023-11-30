import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name using only alphabetic");

        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        System.out.println("name of the active player is "+ userName);

//        System.out.println("round one");


        Player a = new ActivePlayer(userName);
        Player b = new AIPlayer("AIOne");
        Player c = new AIPlayer("AITwo");
        Player d = new AIPlayer("AIThree");

        Dealer dealer = new Dealer();

        dealer.addPlayer(a,b,c,d);

        dealer.dealCards(a,b,c,d);


        a.displayHand();
        b.displayHand();
        c.displayHand();
        d.displayHand();

        //dealer.findStartCard();
        FirstTrick firstTrick = new FirstTrick(dealer);
        //firstTrick.hasStartCArd();
        firstTrick.startFirstTrick();

        dealer.displayCardPlayerMapHand();

        dealer.displayCardPlayerMap();
        dealer.winner();
        System.out.println(a.extractPileSuit());

        //dealer.highestRankPlayer();

        //a.cardPlayer();
       // a.checkCardShared();
        //firstTrick.nextPlayer();
//       a.topTrickPile();
//       b.topTrickPile();
//       b.trickPileHand();
//       a.displayHand();
//       b.displayHand();
//       c.displayHand();
//       d.displayHand();




//        Trick trick = new Trick();
//
//        trick.topTrickPile();


//        Trick firstTrick = new FirstTrick(dealer.getPlayers());
//        firstTrick.nextPlayer();






    }
}






