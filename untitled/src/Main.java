import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Enter your name using only alphabetic");
//
//        Scanner input = new Scanner(System.in);
//        String userName = input.nextLine();
//
//        System.out.println("name of the player is "+ userName);
//
//        System.out.println("round one");

        Player p1 =new Player("a");
        Player p2 = new Player("b");
        Player p3 = new Player("C");
        Player p4 = new Player("d");

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


    }
}






