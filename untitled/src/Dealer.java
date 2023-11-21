import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> cards;
     private ArrayList<Player> players;
    private final Deck DECK;
    private static final int MAX_DEAL = 13;  //no of cards each player should get
    private final Card START_CARD;
    final char SMILEY_FACE = '\u263A';


    public Dealer() {
        DECK = new Deck(Suit.HEART, SuitValue.TWO);
        START_CARD =new Card(Suit.CLUB,SuitValue.TWO);
        cards = DECK.createDeck();
        players = new ArrayList<>();
    }



    public void addPlayer(Player player1,Player player2, Player player3, Player player4){
        players.add(0,player1);
        players.add(1,player2);
        players.add(2,player3);
        players.add(3,player4);
    }


    //this method is useful only for 1st trick
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


    //this method is useful only for 1st trick
        public void startPlay(Player player) {
                        player.addCardTrickPile(START_CARD);
                        player.getCards().remove(START_CARD);
                        System.out.println("Removed card in "+player.getName() + "'s hand: " + START_CARD.getSuitValue() + " of " + START_CARD.getSuits().getUnicode());
                        player.displayHand();

                    }




    //this method is useful only for 1st trick
    public void nextCard(Player player){
        String hi = "here the logic to play card should be implemented (in the 1st trick only when trickPile has only 2 of club) ";
        System.out.println(hi);
    }


    //this method is useful only for 1st trick
    public void nextPlayer() {
        for (int i = 0; i < players.size(); i++) {
            Player p0 = players.get(0);
            Player p1 = players.get(1);
            Player p2 = players.get(2);
            Player p3 = players.get(3);

            if (p0.getCards().contains(START_CARD)) {
                System.out.println(p0.getName()+" has "+START_CARD.getSuitValue()+" of "+ START_CARD.getSuits().getUnicode()+" and can start the game "+SMILEY_FACE);
                startPlay(p0);
                nextCard(p3);
            } else if (p1.getCards().contains(START_CARD)) {
                System.out.println(p1.getName()+" has "+START_CARD.getSuitValue()+" of "+ START_CARD.getSuits().getUnicode()+" and can start the game "+SMILEY_FACE);
                startPlay(p1);
                nextCard(p0);
            } else if (p2.getCards().contains(START_CARD)) {
                System.out.println(p2.getName()+" has "+START_CARD.getSuitValue()+" of "+ START_CARD.getSuits().getUnicode()+" and can start the game "+SMILEY_FACE);
                startPlay(p2);
                nextCard(p1);
            } else if (p3.getCards().contains(START_CARD)) {
                System.out.println(p3.getName()+" has "+START_CARD.getSuitValue()+" of "+ START_CARD.getSuits().getUnicode()+" and can start the game "+SMILEY_FACE);
                startPlay(p3);
                nextCard(p2);
            }
        }
    }



}















































