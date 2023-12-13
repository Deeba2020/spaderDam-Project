import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActivePlayer extends Player {

//    private String name;
//    private ArrayList<Card> cards;

    Scanner input = new Scanner(System.in);
    ArrayList<Card> matchedSuits;
    int chosenIndex;

    public ActivePlayer(String name) {
        super(name);
        matchedSuits = new ArrayList<>();
        // this.name=name;
        //cards = new ArrayList<>();
    }

    public void playerHandNumbered() {
        for (int i = 0; i < getCards().size(); i++) {
            System.out.println((i + 1) + ": " + getCards().get(i).getSuitValue().getUnicode() + getCards().get(i).getSuits().getUnicode());
        }
    }


    public String rankSuit(int j) {
        Card card = getCards().get(j - 1);
        return card.getSuits().getUnicode();
    }


    public boolean kanFollowSuit() {
        boolean leadingSuit = false;
        Card topCard = topTrickPileCard();
        for (Card checkCard : getCards()) {
            if (checkCard.getSuits().getUnicode().equals(topCard.getSuits().getUnicode())) {
                matchedSuits.add(checkCard);
                leadingSuit = true;
            }

        }
        return leadingSuit;
    }


    public boolean followsSuit(int chosenIndex) {
        boolean followSuit = false;
        if (kanFollowSuit()) {

            for (Card cards : matchedSuits) {

                if (cards.getSuits().getUnicode().equals(rankSuit(chosenIndex))) {
                    followSuit = true;
                }
            }
        }
        return followSuit;
    }


    public void addChosenCardToPile(){
        Card chosenCard = getCards().get(chosenIndex - 1);
        System.out.println("You chose: " + chosenCard.getSuitValue().getUnicode() + chosenCard.getSuits().getUnicode());
        addCardToPile(chosenCard);
        getCards().remove(chosenCard);
        //playerHandNumbered();
    }




//throw new InputMismatchException(); how to fit this exception to below method?
            public void findSuit () {
                System.out.println("Your turn:");
                playerHandNumbered();
                //int chosenIndex;
                do {
                    System.out.println("Enter the number of the card you want to play:");
                    chosenIndex = input.nextInt();
                }
                while (chosenIndex < 1 || chosenIndex > getCards().size());

                if(kanFollowSuit()) {

                    if (!followsSuit(chosenIndex)) {

                       // System.out.println("The leading suit of current trick is " + extractPileSuit() + " you have the leading suit you must play it ");

                        do {
                            System.out.println("The leading suit of current trick is " + extractPileSuit() + " you have the leading suit you must play it ");
                            chosenIndex = input.nextInt();

                        }
                        while (chosenIndex < 1 || chosenIndex > getCards().size() || !followsSuit(chosenIndex));

                    }
//                    Card chosenCard = getCards().get(chosenIndex - 1);
//                    System.out.println("You chose: " + chosenCard.getSuitValue().getUnicode() + chosenCard.getSuits().getUnicode());
//                    addCardToPile(chosenCard);
//                    getCards().remove(chosenCard);
//                    playerHandNumbered();
                    addChosenCardToPile();


                }else {
                    addChosenCardToPile();
                }







            }




//    public void findSuit () {
//        System.out.println("Your turn:");
//        playerHandNumbered();
//        int chosenIndex;
//
//        do {
//            System.out.println("Enter the number of the card you want to play:");
//            chosenIndex = input.nextInt();
//
//        }
//        while (chosenIndex < 1 || chosenIndex > getCards().size());
//
//        Card chosenCard = getCards().get(chosenIndex - 1);
//        System.out.println("You chose: " + chosenCard.getSuitValue().getUnicode() + chosenCard.getSuits().getUnicode());
//        addCardToPile(chosenCard);
//        getCards().remove(chosenCard);
//        playerHandNumbered();
//
//    }





}
