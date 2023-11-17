import java.util.ArrayList;
import java.util.List;


public class Dealer {

    private ArrayList<Card> cards;
     private ArrayList<Player> players;
    private Deck deck;
    private final int MAX_DEAL = 13;
    private List<Card> playerHand = new ArrayList<>();
    private List<Card> playedTrickCards= new ArrayList<>(); 
    private Suit leadingSuit;


    public Dealer() {
        deck = new Deck(Suit.HEART, SuitValue.TWO);
        cards = deck.createDeck();
        players = new ArrayList<>();

    }

    public void addPlayer(Player player){
        players.add(player);
    }


    public void dealCards(Player p1,Player p2,Player p3, Player p4) {
        deck.shuffleDeck();

        for (int i = 0; i < MAX_DEAL; i++) {
            for (Player player : players) {
                if (!cards.isEmpty()) {
                    Card currentCard = cards.get(0);
                     playerHand = player.getCards();
                    playerHand.add(currentCard);
                    cards.remove(0);
                }
            }
        }
    }
// check wheather the player has the leading suit
    public  boolean hasSuit(Suit suit) {
        
        for (Card card : playerHand) {
            if (card.getSuits() == suit) {
                return true;
            }
        }
        return false;
    }

        
    
public void playTrick(Player player, Card card){
    // Defined the leading suit
    if (playedTrickCards.size()==0){
        leadingSuit=card.getSuits();
        
        }
    // check if it is a valid suit and added to the tick
     if(isValidSuit(player, leadingSuit)) {
        playedTrickCards.add(card);

       }
       else
       System.out.println("Please follow the suit!");
}

public boolean isValidSuit(Player player, Suit leadingSuit){
    if (playedTrickCards.size()==0) {
            // The first card played is always valid 
            // ? check heart is broken
            return true;
        } 
        else if (hasSuit(leadingSuit)){
                return true;
            } 
            else {
                // If the player doesn't have cards of the leading suit, any card is valid
                return true;
            }
        
    }
    public boolean isHeartBroken(){
        return true;

    }


}















































