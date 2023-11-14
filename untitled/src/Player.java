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
            System.out.println(currentCard.getSuitValue() + " of " + currentCard.getSuits().getUnicode());
        }
    }


    //need to remove unnecessary prints in last stage
    public void  startPlay(Player player) {
        //System.out.println("Looking for Two of Club");
        char smileyFace = '\u263A';
        Card startCard = new Card(Suit.CLUB,SuitValue.TWO);

        System.out.println(player.getName()+" current hand size is: " + player.getCards().size());
        System.out.println("Looking for: " + startCard.getSuitValue()+" of "+ startCard.getSuits().getUnicode());

        for (int i = 0; i<13 ; i++) {

            if (player.getCards().isEmpty()) {
                System.out.println("no cards in hand to play with");
            }

            else if (player.getCards().contains(startCard)){

                System.out.println("the player "+player.getName()+" has the card"+" " +startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode()+" and can start the game "+smileyFace);
                player.getCards().remove(startCard);
                System.out.println("Removed card in player's hand: " + startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode());
                System.out.println(player.getName() + "'s hand after removing TWO of CLUB is: ");
                player.displayHand();
            }

            }
    }













//  cards.remove(currentCard);
//          else if (!cards.isEmpty()) {
//          cards.remove(0);



//  List<Card> trickCards = new ArrayList<>();

//public void recieveCard(){
//    for(Card choosenCard: cards){
//    trickCards.add(choosenCard);
//    }
//
//    }
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










