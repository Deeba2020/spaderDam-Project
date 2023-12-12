import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActivePlayer extends Player {

//    private String name;
//    private ArrayList<Card> cards;

    Scanner input = new Scanner(System.in);

    public ActivePlayer(String name){
        super(name);
       // this.name=name;
        //cards = new ArrayList<>();
    }

    public void playerHandNumbered (){
        for (int i = 0; i <getCards().size(); i++) {
            System.out.println((i + 1) + ": " + getCards().get(i).getSuitValue().getUnicode()+getCards().get(i).getSuits().getUnicode());
        }
    }



    //to find matching and  non-matching suit in players hand and add it  to the trickPile
//    public void findSuit() {
//        System.out.println("Your turn:");
//        playerHandNumbered();
//
//        System.out.println("Enter the number of the card you want to play:");
//        int chosenIndex = input.nextInt();
//        if (chosenIndex >= 1 && chosenIndex <= getCards().size()) {
//            Card chosenCard = getCards().get(chosenIndex - 1);
//            System.out.println("You chose: " + chosenCard.getSuitValue().getUnicode()+chosenCard.getSuits().getUnicode());
//            pileCards.add(chosenCard);
//            // Process the chosen card further in your game logic
//        } else {
//            System.out.println("Invalid choice. Please enter a valid number.");
//        }
//    }





//throw new InputMismatchException(); how to fit this exception to below method?
    public void findSuit() {
        System.out.println("Your turn:");
        playerHandNumbered();
        int chosenIndex;

        do {
            System.out.println("Enter the number of the card you want to play:");
            chosenIndex = input.nextInt();
        }
        while (chosenIndex < 1 || chosenIndex > getCards().size() );

        Card chosenCard = getCards().get(chosenIndex - 1);
        System.out.println("You chose: " + chosenCard.getSuitValue().getUnicode() + chosenCard.getSuits().getUnicode());
        pileCards.add(chosenCard);

    }









}
