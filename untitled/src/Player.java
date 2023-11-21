import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Player {
    private String name;
    private ArrayList<Card> cards;
    Queue<Integer> pileCards = new LinkedList<>();
    private ArrayList<Card> trickCards;
    private ArrayList<Integer> scores;


    public Player() {
        scores = null;
        cards = new ArrayList<>();
        trickCards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public void displayHand() {
        System.out.println( " player has following cards: ");
        for (Card currentCard : cards) {
            System.out.println(currentCard.getSuitValue() + " of " + currentCard.getSuits().getUnicode());
        }
    }

    public void addCardTrickPile(Card card){
        trickCards.add(card);
        System.out.println(card.getSuitValue()+" of "+  card.getSuits()+" added to the trick pile");
        displayTrickPile();
        }


    public ArrayList<Card> displayTrickPile() {
        System.out.println("Trick pile has following cards: ");
        for (Card currentCard : trickCards) {
            System.out.println(currentCard.getSuitValue() + " of " + currentCard.getSuits().getUnicode());
        }
        return trickCards;
    }





}









