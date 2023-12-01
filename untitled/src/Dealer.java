import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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
        //cardPlayer=new HashMap<>();
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



//    public void displayCardPlayerMap() {
//        int maxRank = Integer.MIN_VALUE;
//        String playerName = "";
//        String maxRankCard = "";
//
//        for (Player player : players) {
//            String keyName = player.getName();
//            if (player.cardPlayer.containsKey(keyName)) {
//                String cardInfo = player.cardPlayer.get(keyName);
//                // Extract the rank from the card information
//                int cardRank = extractCardRank(cardInfo);
//                if (cardRank > maxRank) {
//                    maxRank = cardRank;
//                    playerName = keyName;
//                    maxRankCard = cardInfo;
//                }
//            }
//        }
//
//        if (!playerName.isEmpty()) {
//            System.out.println(playerName + " has the highest-ranked card: " + maxRankCard);
//        } else {
//            System.out.println("No cards played yet!");
//        }
//    }

    public void displayCardPlayerMap() {
        int maxRankNum = 0;
        String maxPlayerName = "";
        String maxRankDeck = "";

        for (Player player : players) {
            String keyName = player.getName();
            if (player.cardPlayer.containsKey(keyName)) {
                String deckInfo = player.cardPlayer.get(keyName);
                // Extract the rank from the card using another method
                int cardRankInt = extractCardRank(deckInfo);
                if (cardRankInt > maxRankNum) {
                    maxRankNum = cardRankInt;
                    maxPlayerName = keyName;
                    maxRankDeck = deckInfo;
                }
            }
        }

        if (!maxPlayerName.isEmpty()) {
            System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " + maxRankDeck);
        } else {
            System.out.println("No cards added to the trick pile yet!");
        }
    }


    //  method to extract rank number of the card from the card in integer
    public int extractCardRank(String deckInfo) {

        String[] deck = deckInfo.split(" ");
        String cardRank = deck[deck.length-1];
        return Integer.parseInt(cardRank);
    }


//returns player name with the highest rank card in the pile
//public void winner() {
//    int maxRankNum = 0;
//    String maxPlayerName = "";
//    String maxRankDeck = "";
//    String maxSuitDeck = "";
//
//
//    for (Player player : players) {
//        Card m = player.topTrickPile();
//        String keyName = player.getName();
//        if (player.cardPlayer.containsKey(keyName)) {
//            String deckInfo = player.cardPlayer.get(keyName);
//            // Extract the rank from the card using another method
//            int cardRankInt = extractCardRank(deckInfo);
//            maxSuitDeck =extractCardSuit(deckInfo);
//
//            if (cardRankInt > maxRankNum && Objects.equals(maxSuitDeck, player.extractPileSuit())) {
//                maxRankNum = cardRankInt;
//                maxPlayerName = keyName;
//                maxRankDeck = deckInfo;
//                //System.out.println(maxPlayerName );
//                //System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " + maxRankDeck+" the suit is  "+maxSuitDeck);
//
//            } else if (Objects.equals(maxSuitDeck, player.extractPileSuit())) {
//                maxRankNum = cardRankInt;
//                maxPlayerName = keyName;
//                maxRankDeck = deckInfo;
//               // System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " + maxRankDeck+" the suit is  "+maxSuitDeck);
//
//               // System.out.println(maxPlayerName );
//
//            }
//        }
//        System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " + maxRankDeck+" the suit is  "+maxSuitDeck);
//    }
//
//    if (!maxPlayerName.isEmpty()) {
//        System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " + maxRankDeck+" the suit is  "+maxSuitDeck);
//    } else {
//        System.out.println("No cards added to the trick pile yet!");
//    }
//}

    public void winner() {
        int maxRankNum = 0;
        String maxPlayerName = "";
        String maxRankDeck = "";
        String maxSuitDeck = "";

        for (Player player : players) {
            Card m = player.topTrickPile();
            String keyName = player.getName();
            if (player.cardPlayer.containsKey(keyName)) {
                String deckInfo = player.cardPlayer.get(keyName);
                // Extract the rank from the card using another method
                int cardRankInt = extractCardRank(deckInfo);
                maxSuitDeck =extractCardSuit(deckInfo);
                System.out.println("max suit deck is!!!! "+maxSuitDeck);
                System.out.println("max rank!!!!!"+cardRankInt);

                String pileSuit = player.extractPileSuit();
                System.out.println("pile suit isss!!!!"+pileSuit);


                if (cardRankInt > maxRankNum && maxSuitDeck.equals(player.extractPileSuit())) {
                    maxRankNum = cardRankInt;
                    maxPlayerName = keyName;
                    maxRankDeck = deckInfo;
                    System.out.println("hiiiiiiiiii");
                    //System.out.println(maxPlayerName );
                    //System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " + maxRankDeck+" the suit is  "+maxSuitDeck);

                } else if (maxSuitDeck.equals(player.extractPileSuit())) {
                    maxRankNum = cardRankInt;
                    maxPlayerName = keyName;
                    maxRankDeck = deckInfo;
                    System.out.println("byeeeeeeeeeeeeeeeeee");
                    // System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " + maxRankDeck+" the suit is  "+maxSuitDeck);

                    // System.out.println(maxPlayerName );

                }
            }

           // System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " + maxRankDeck+" the suit is  "+maxSuitDeck);
        }
        System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " + maxRankDeck+" the suit is  "+maxSuitDeck);

        if (!maxPlayerName.isEmpty()) {
            System.out.println(maxPlayerName + " has the highest-ranked card which follows the suit: " + maxRankDeck+" the suit is  "+maxSuitDeck);
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



//    public Player winCrads(){
//        for (Player player: players){
//
//
//        }
//        return ;
//    }



//    public Player winner (){
//        for (Player player : players){
//            if (maxrank || followSuit){
//                add cards to player win card
//            } else if (followSuit) {
//                add cards to player win card
//
//            }
//        }
//    }

    //  method to extract rank number of the card from the card
//    private int extractCardRank(String deckInfo) {
//
//        String[] deck = deckInfo.split(" ");
//        String cardRank = deck[deck.length - 1];
//        return Integer.parseInt(cardRank);
//    }


//    public void displayCardPlayerMap() {
//
//            for (String playerName : cardPlayer.keySet()) {
//                System.out.println(playerName + " has card: " + cardPlayer.get(playerName));
//            }
//
//    }

    //this method is used to know which cards was used by the player in the trick pile
    public void displayCardPlayerMapHand() {
        for (Player player : players) {
            String keyName = player.getName();
            if (player.cardPlayer.containsKey(keyName)) {
                System.out.println(keyName + " used card: " +player.cardPlayer.get(keyName));
            }
        }
    }


//    public void TrickWinner(){
//        for(Player player: players){
//            ArrayList<String> s = (ArrayList<String>) player.getCardPlayer().values();
//            for (String d : s){
//                if (d.)
//            }
//
//    }



    //this must be here since we need to go through player's hand and find 2 of club to start the game
//    public void findStartCard(){
//        for (Player player: players){
//           if (player.getCards().contains(START_CARD)){
//               System.out.println(player.getName()+" has "+START_CARD.getSuitValue().getUnicode()+" of "+START_CARD.getSuits().getUnicode() +SMILEY_FACE);
//               player.addCardToPile(START_CARD);
//               player.getCards().remove(START_CARD);
//               player.displayHand();
//           }
//        }
//    }

//    public void nextPlayer(){
//        for(Player player:players){
//            if(players.get(0).getCards().contains(START_CARD)){
//                players.get(3).addStartCardPile();
//            } else if (players.get(1).getCards().contains(START_CARD)) {
//                players.get(0).addStartCardPile();
//            }else if (players.get(2).getCards().contains(START_CARD)) {
//                players.get(1).addStartCardPile();
//            }else if (players.get(3).getCards().contains(START_CARD)) {
//                players.get(2).addStartCardPile();
//            }
//        }
//    }




}















































