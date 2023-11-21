import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> cards;
     private ArrayList<Player> players;
    private final Deck DECK;
    private static final int MAX_DEAL = 13;  //no of cards each player should get


    public Dealer() {
        DECK = new Deck(Suit.HEART, SuitValue.TWO);
        cards = DECK.createDeck();
        players = new ArrayList<>();
    }



    public void addPlayer(Player player1,Player player2, Player player3, Player player4){
        players.add(0,player1);
        players.add(1,player2);
        players.add(2,player3);
        players.add(3,player4);
    }



        public void dealCards(Player p1, Player p2, Player p3, Player p4) {
        DECK.shuffleDeck();
        for (int i = 0; i < MAX_DEAL; i++) {
            for (Player player : players) {
                if (!cards.isEmpty()) {
                    Card currentCard = cards.get(0);
                    ArrayList<Card> playerHand = player.getCards();
                    playerHand.add(currentCard);
                    cards.remove(0);
                }
            }
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }




}















































