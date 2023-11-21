import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Player {
    private String name;
    private ArrayList<Card> cards;
    Queue<Card> pileCards;
    private ArrayList<Integer> scores;


    public Player() {
        scores = null;
        cards = new ArrayList<>();
        pileCards = new LinkedList<>();
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
        pileCards.add(card);
        System.out.println(card.getSuitValue()+" of "+  card.getSuits()+" added to the trick pile");
        displayTrickPile();
        }


    public Queue<Card> displayTrickPile() {
        System.out.println("Trick pile has following cards: ");
        for (Card currentCard : pileCards) {
            System.out.println(currentCard.getSuitValue() + " of " + currentCard.getSuits().getUnicode());
        }
        return pileCards;
    }





}









