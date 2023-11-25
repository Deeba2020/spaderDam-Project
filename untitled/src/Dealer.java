import java.util.ArrayList;
import java.util.List;

public class Dealer {

    private ArrayList<Card> cards;
     private Player [] players;
    private Deck deck;
    private final int MAX_DEAL = 13;
    private Player player;
    


    public Dealer() {
        deck = new Deck(Suit.HEART, SuitValue.TWO);
        cards = deck.createDeck();
        players = new Player[4];

    }

    /* public void addPlayer(Player p1, Player p2, Player p3, Player p4){
        players.add(player);
    } */


    public void dealCards( Player [] players) {
        deck.shuffleDeck();

        for (int i = 0; i < MAX_DEAL; i++) {
            for (Player player : players) {
                if (!cards.isEmpty()) {
                    Card currentCard = cards.get(0);
                    player.playerHand.add(currentCard);
                    cards.remove(0);
                }
            }
        }
        
       
    }
    
 

}















































