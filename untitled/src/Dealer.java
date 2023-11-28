import java.util.ArrayList;

public class Dealer {
    private final char SMILEY_FACE = '\u263A';

    private ArrayList<Card> cards;
     private ArrayList<Player> players;
    private final Deck DECK;
    private static final int MAX_DEAL = 13;  //no of cards each player should get
    private final Card START_CARD;


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















































