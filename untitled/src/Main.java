import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name using only alphabetic");

        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();


        System.out.println("name of the active player is "+ userName);

//        System.out.println("round one");


        ActivePlayer a = new ActivePlayer(userName);
        AIOne b = new AIOne();
        AITwo c = new AITwo();
        AIThree d = new AIThree();

        Dealer dealer = new Dealer();

        dealer.addPlayer(a,b,c,d);
//        dealer.addPlayer(a);
//        dealer.addPlayer(b);
//        dealer.addPlayer(c);
//        dealer.addPlayer(d);

        dealer.dealCards(a,b,c,d);

        a.displayHand();
        b.displayHand();
        c.displayHand();
        d.displayHand();

        a.startPlay(a);
        b.startPlay(b);
        c.startPlay(c);
        d.startPlay(d);




    }
}






