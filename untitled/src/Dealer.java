import java.util.ArrayList;

public class Dealer {
    private final char SMILEY_FACE = '\u263A';

    private ArrayList<Card> cards;
     private ArrayList<Player> players;
    private final Deck DECK;
    private static final int MAX_DEAL = 13;  //no of cards each player should get
    private final Card START_CARD;
    //Map<String,Card> cardPlayer;


    public Dealer() {
        DECK = new Deck(Suit.HEART, SuitValue.TWO);
        cards = DECK.createDeck();
        players = new ArrayList<>();
        START_CARD =new Card(Suit.CLUB,SuitValue.TWO);

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



    //  method to extract rank number of the card from the card in integer
    public int extractCardRank(String deckInfo) {

        String[] deck = deckInfo.split(" ");
        String cardRank = deck[deck.length-1];
        return Integer.parseInt(cardRank);
    }




    public void TrickWinner() {
        int maxRankNum = 0;
        String maxPlayerName = "";
        String maxRankDeck = "";
        String maxSuitDeck = "";


        for (Player player : players) {
            String keyName = player.getName();
            if (player.cardPlayer.containsKey(keyName)) {
                String deckInfo = player.cardPlayer.get(keyName);
                int cardRankInt = extractCardRank(deckInfo);
                maxSuitDeck = extractCardSuit(deckInfo);

                String pileSuit = player.extractPileSuit();

                if (pileSuit.equals(maxSuitDeck)) {
                    if (cardRankInt > maxRankNum) {
                        maxRankNum = cardRankInt;
                        maxPlayerName = keyName;
                        maxRankDeck = deckInfo;
                    }
                }
            }
        }

        if (!maxPlayerName.isEmpty()) {
            System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " +
                    maxRankDeck + " the suit is  " + maxSuitDeck);
        } else {
            System.out.println("No cards added to the trick pile yet!");
        }
    }




//to extract the suit of the deck
    public String extractCardSuit(String deckInfo) {

        String[] deck = deckInfo.split(" ");
        String cardSuit = deck[2];
        return cardSuit;
    }




    //this method is used to know which cards was used by the player in the trick pile
    public void displayCardPlayerMapHand() {
        for (Player player : players) {
            String keyName = player.getName();
            if (player.cardPlayer.containsKey(keyName)) {
                System.out.println(keyName + " used card: " +player.cardPlayer.get(keyName));
            }
        }
    }



}















































