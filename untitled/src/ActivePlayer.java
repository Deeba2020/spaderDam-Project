import javax.sound.midi.Soundbank;
import java.util.ArrayList;
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


    public String suitOfRank(int j) {
        Card card = getCards().get(j - 1);
        return card.getSuits().getUnicode();
    }

    //
//    public boolean kanUseHeart(){
//        boolean kanUseHeart = true;
//        if (kanFollowSuit()){
//            kanUseHeart=false;
//        }
//        return kanUseHeart;
//    }

    //
    public boolean kanUseHeart(){
        boolean kanUseHeart = true;
        if (matchedSuits.isEmpty()){
            kanUseHeart=false;
        }
        return kanUseHeart;
    }

    //
//    public void useHeart() {
//            if (kanUseHeart()){
//                addChosenRankToPile();
//                setIsHeartBroken(true);
//            }
//            else {
//                System.out.println("you can not use heart suit since heart are not broken yet");
//            }
//    }


    public void useHeart() {

        addChosenRankToPile();
        setIsHeartBroken(true);
        System.out.println("you can not use heart suit since heart are not broken yet");

    }





//
    public boolean kanFollowSuit() {
        boolean hasLeadingSuit = false;
        Card topCard = topTrickPileCard();
        for (Card checkCard : getCards()) {
            if (checkCard.getSuits().getUnicode().equals(topCard.getSuits().getUnicode())) {
                matchedSuits.add(checkCard);
                hasLeadingSuit = true;
            }
        }
        return hasLeadingSuit;
    }

//
    public boolean followsSuit(int chosenIndex) {
        boolean followSuit = false;
        if (kanFollowSuit()) {

            for (Card cards : matchedSuits) {

                if (cards.getSuits().getUnicode().equals(suitOfRank(chosenIndex))) {
                    followSuit = true;
                }
            }
        }
        return followSuit;
    }



    public void addChosenRankToPile(){
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
                do {
                    System.out.println("Enter the number of the card you want to play:");
                    chosenIndex = input.nextInt();
                }
                while (chosenIndex < 1 || chosenIndex > getCards().size());

                if(kanFollowSuit()) {

                    if (!followsSuit(chosenIndex)) {

                        do {
                            System.out.println("The leading suit of current trick is " + extractPileSuit() + " you have the leading suit you must play it ");
                            chosenIndex = input.nextInt();

                        }
                        while (chosenIndex < 1 || chosenIndex > getCards().size() || !followsSuit(chosenIndex));

                    }

                    addChosenRankToPile();

                } else {
                    if(suitOfRank(chosenIndex).equals(Suit.HEART.getUnicode())){
                        useHeart();
                    } else {
                        addChosenRankToPile();
                    }
                }

            }

    public void findStartCard() {
        //ArrayList<Card>card= getCards();
        ArrayList<Card> differentSuit = new ArrayList<>();
        for (Card checkCard : getCards()) {

            differentSuit.add(checkCard);
        }

        int suitIndex;
        Card chosenCard;

        if (!(differentSuit.isEmpty())) {
            suitIndex = getRandomSuit().nextInt(differentSuit.size());
            chosenCard = differentSuit.get(suitIndex);
            addCardToPile(chosenCard);
            getCards().remove(chosenCard);
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


    //    public void useHeart() {
//            if (suitOfRank(chosenIndex).equals(Suit.HEART.getUnicode())) {
//                if (kanUseHeart()){
//                    addChosenRankToPile();
//                }
//                else {
//                    System.out.println("you can not use heart suit since heart are not broken yet");
//                }
//            }
//    }




}
