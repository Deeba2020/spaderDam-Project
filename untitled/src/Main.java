import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       // System.out.println("Enter your name using only alphabetic");

        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

       // System.out.println("name of the player is "+ userName);

        //System.out.println("round one");

        Deck deck = new Deck(Suit.HEART,SuitValue.TWO);

        deck.createDeck();
        System.out.println(deck.cards.size());

        deck.displayDeck();



    }
}