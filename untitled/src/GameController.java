import java.util.ArrayList;

public class GameController {



    private static ArrayList<Card> pileCards;

    public GameController(){
        pileCards = new ArrayList<>();
    }


    //showing all list of trick pile
    public void trickPileList() {
        if(!(pileCards.isEmpty())) {
            System.out.println("Trick pile has following cards: ");
            for (Card currentCard : pileCards) {
                System.out.println(currentCard.getSuitValue().getUnicode() + " of " +
                        currentCard.getSuits().getUnicode());
                //System.out.println(currentCard.getRank());
            }
        }else {
            System.out.println("trick pile is empty because all cards added to pile of the trick winner");
        }
    }


    public Card topTrickPile() {
        if (!(pileCards.isEmpty())) {
            System.out.println("Card on the top of trick pile is "
                    + pileCards.get(0).getSuitValue().getUnicode() + " of " +
                    pileCards.get(0).getSuits().getUnicode());
            return pileCards.get(0);
        } else {
            System.out.println("trick pile has no card");

            return null;
        }
    }


    public Card topTrickPileCard() {
        if (!(pileCards.isEmpty())) {
            return pileCards.get(0);
        } else {
            System.out.println("trick pile has no card");
            return null;
        }
    }


    public String extractPileSuit() {

        if(!pileCards.isEmpty()){
            return pileCards.get(0).getSuits().getUnicode();
        }else {
            return "no card found";
        }
    }


    //public static ArrayList<Card> getPileCards() {
//        return pileCards;
//    }


    public static ArrayList<Card> getPileCards() {
        return pileCards;
    }
}
