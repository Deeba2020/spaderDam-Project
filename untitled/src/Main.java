import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player p1 =new Player("a");
        Player p2 = new Player("b");
        Player p3 = new Player("C");
        Player p4 = new Player("d");


//        Deck d = new Deck(Suit.HEART,SuitValue.TWO);
//        d.createDeck();
//        d.shuffleDeck();

        Dealer dealer = new Dealer();

        dealer.addPlayer(p1);
        dealer.addPlayer(p2);
        dealer.addPlayer(p3);
        dealer.addPlayer(p4);

        dealer.dealCards(p1,p2,p3,p4);

        p1.displayHand();
        p2.displayHand();
        p3.displayHand();
        p4.displayHand();

        p1.startPlay(p1);
        p2.startPlay(p2);
        p3.startPlay(p3);
        p4.startPlay(p4);




        // System.out.println("Enter your name using only alphabetic");

//        Scanner input = new Scanner(System.in);
//        String userName = input.nextLine();

        // System.out.println("name of the player is "+ userName);

        //System.out.println("round one");

//        Deck d = new Deck(Suit.HEART,SuitValue.TWO);
//        d.createDeck();
//        d.displayDeck();
//
//        d.shuffleDeck();

//        Player p1 = new Player("Sara");
//        p1.shuffleDeck();

//        Dealer dealer = new Dealer();
//        dealer.distCards(13);

//        Dealer dealer = new Dealer();

        // Simulate dealing cards to players
//        int numberOfPlayers = 4; // You can adjust this based on your game rules
//        for (int i = 0; i < numberOfPlayers; i++) {
//            ArrayList<Card> playerHand = dealer.distCards(13); // Deal 13 cards to each player
//            System.out.println("Player " + (i + 1) + " hand: " + playerHand);
//        }
//
//        // Create players (replace "Player" with actual names)
//        Player player1 = new Player("Player1");
//        Player player2 = new Player("Player2");
//        Player player3 = new Player("Player3");
//        Player player4 = new Player("Player4");
//
//        // Simulate players playing cards
//        simulatePlayerTurn(player1);
//        simulatePlayerTurn(player2);
//        simulatePlayerTurn(player3);
//        simulatePlayerTurn(player4);
//    }
//
//    private static void simulatePlayerTurn(Player player) {
//        // Simulate a player's turn
//        System.out.println("\n" + player.getName() + "'s turn:");
//        Card playedCard = player.playCard();
//
//        // You can continue the game simulation logic here, such as updating scores and progressing through rounds.
//    }
    }
}






