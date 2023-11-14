import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Player {

    private String name;
    //private int score;
    private ArrayList<Card> cards;

    private ArrayList<Integer> scores;
    private Dealer deal;

    //    private ArrayList<Deck>decks;
    public Player(String name) {
        this.name = name;
        scores = null;
        cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public void displayHand() {
        System.out.println(name + " has following cards: ");
        for (Card currentCard : cards) {
            System.out.println(currentCard.getSuitValue().getSuitChar() + " of " + currentCard.getSuits().getUnicode());
        }
    }

//    public void  startPlay() {
//        Card startCard = new Card(Suit.CLUB,SuitValue.TWO);
//        for (Card currentCard : cards) {
//            if (cards.isEmpty()) {
//                System.out.println("no cards in hand");
//            }
//
//            else if (cards.contains(startCard)){
//
//            }
//            else if (currentCard.getSuitValue().equals(Suit.CLUB.getUnicode()) && (currentCard.getSuitValue().equals(SuitValue.TWO))) {
//
//                cards.remove(currentCard);}
//            else if (!cards.isEmpty()) {
//                cards.remove(0);
//            }
//        }
//
//    }





  List<Card> playedTrickCards = new ArrayList<>(); 

public void recieveCard(){
    for(Card choosenCard: cards){
    playedTrickCards.add(choosenCard);
    }
    
    }
}

    //recieveCard
    //addCard() floor




//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//

//
//    public void setCards(ArrayList<Card> cards) {
//        this.cards = cards;
//    }


//

//    public int shuffleCards (ArrayList<Card>cards){
//        cards.
//        return;
//    }

//    public Card playCard() {
//        // Check if the player has any cards to play
//        if (cards.isEmpty()) {
//            System.out.println("No cards in hand.");
//            return null;  // or throw an exception
//        }
//
//        // For simplicity, let's assume the player plays the first card in their hand.
//        Card playedCard = cards.get(0);
//
//        // Remove the played card from the player's hand
//        cards.remove(playedCard);
//
//        System.out.println(name + " played: " + playedCard.getSuitValue() + " of " + playedCard.getSuits().getUnicode());
//
//        return playedCard;
//    }










