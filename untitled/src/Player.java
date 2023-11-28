import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Player {
    private String name;
    private ArrayList<Card> cards;
    //first in first out
    static Queue<Card> pileCards;
    private ArrayList<Integer> scores;
    private Random randomSuit;
     Queue<CardShared> cardToPile = new LinkedList<>();
    //private Trick trick;


    public Player(String name) {
        this.name = name;
        scores = null;
        cards = new ArrayList<>();
        pileCards = new LinkedList<>();
        randomSuit = new Random();
        //trick = new Trick();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public void displayHand() {
        System.out.println(name + " player has following cards: ");
        for (Card currentCard : cards) {
            System.out.println(currentCard.getSuitValue().getUnicode() + " of " + currentCard.getSuits().getUnicode());
        }
    }


    //showing all list of trick pile
    public Queue<Card> trickPileHand() {
        System.out.println("Trick pile has following cards: ");
        for (Card currentCard : pileCards) {
            System.out.println(currentCard.getSuitValue().getUnicode() + " of " + currentCard.getSuits().getUnicode());
        }
        return pileCards;
    }


    public void addCardToPile(Card card) {
        pileCards.add(card);
        CardShared cardShared = new CardShared(this, card);
        cardToPile.add(cardShared);
        System.out.println(card.getSuitValue().getUnicode() + " of " + card.getSuits().getUnicode() + " added to the trick pile");
        trickPileHand();
        topTrickPile();
    }


    //to show top card on the trick pile
    public Card topTrickPile() {
        if (!(pileCards.isEmpty())) {
            System.out.println("Card on the top of trick pile is " + pileCards.peek().getSuitValue().getUnicode() + " of " + pileCards.peek().getSuits().getUnicode());
            return pileCards.peek();
        } else {
            System.out.println("trick pile has no card");

            return null;
        }
    }


    public Queue<CardShared> getCardToPile() {
        return cardToPile;
    }

    //to find matching suit in players hand to the trickPile
    public void findSuit() {
        // ArrayList<Card>card= getCards();

            Card topCard = topTrickPile();
            ArrayList<Card> matchedSuits = new ArrayList<>();
            for (Card checkCard : cards) {
                if (checkCard.getSuits().getUnicode().equals(topCard.getSuits().getUnicode())) {
                    matchedSuits.add(checkCard);

                }
            }
            if (!(matchedSuits.isEmpty())) {
                int suitIndex = randomSuit.nextInt(matchedSuits.size());
                Card chosenCard = matchedSuits.get(suitIndex);
                addCardToPile(chosenCard);
                topTrickPile();
                cards.remove(chosenCard);


        }





//    public Queue<Card> getPileCards() {
//        return pileCards;
//    }
//
//    public  Queue<CardShared> getCardToPile() {
//        return cardToPile;
//    }


//
//    public void addCardTrickPile(Card card){
//        pileCards.add(card);
//        System.out.println(card.getSuitValue().getUnicode()+" of "+  card.getSuits().getUnicode()+" added to the trick pile");
//        displayTrickPile();
//        }


//    public Queue<Card> displayTrickPile() {
//        System.out.println("Trick pile has following cards: ");
//        for (Card currentCard : pileCards) {
//            System.out.println(currentCard.getSuitValue().getUnicode() + " of " + currentCard.getSuits().getUnicode());
//        }
//        return pileCards;
//    }


//    public Card chooseCard(){
//
//
//
//    }


    }
}









